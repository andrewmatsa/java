/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lviv.jobsuma.page;

import com.lviv.jobsuma.component.base.ElementWrapper;
import com.lviv.jobsuma.component.base.PageFactory;
import com.lviv.jobsuma.component.element.Element;
import com.lviv.jobsuma.testcase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Andrew
 */

    
    public abstract class BasePage {
 
    public static final Integer DEFAULT_TIMEOUT = new Integer(BaseTest.Consts.DEFAULT_TIMEOUT);
    public static final Integer DEFAULT_SEARCH_TIMEOUT = (new Integer(BaseTest.Consts.DEFAULT_TIMEOUT)) * 5;
    public static final int DEFAULT_WAIT_INTERVAL = 100;
    private String pageTitle;
    private WebDriver driver;
    protected PageFactory pageFactory;
    private ElementWrapper elementWrapper;
 
    /**
     * Constructs an instance
     */
    public BasePage() {
    }
 
    /**
     * Constructs anpublic abstract class BasePage {
 
    public static final Integer DEFAULT_TIMEOUT = new Integer(BaseTest.Consts.DEFAULT_TIMEOUT);
    public static final Integer DEFAULT_SEARCH_TIMEOUT = (new Integer(BaseTest.Consts.DEFAULT_TIMEOUT)) * 5;
    public static final int DEFAULT_WAIT_INTERVAL = 100;
    private String pageTitle;
    private WebDriver driver;
    protected PageFactory pageFactory;
    private ElementWrapper elementWrapper;
 
    /**
     * Constructs an instance
     */
//     */ @param title defines page title
//     */
    public BasePage(String pageTitle) {
        this.pageTitle = pageTitle;
    }
 
    /**
     * Sets web driver
     * @param driver defines Selenium web driver
     */
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
 
    /**
     * Sets element wrapper
     * @param elementWrapper defines wrapper for basic element
     */
    public void setElementWrapper(ElementWrapper elementWrapper) {
        this.elementWrapper = elementWrapper;
    }
 
    /**
     * Returns element wrapper
     * @return element wrapper
     */
    protected ElementWrapper getElementWrapper() {
        return elementWrapper;
    }
 
    /**
     * Sets page factory
     * @param pageFactory defines page factory
     */
    public void setPageFactory(PageFactory pageFactory) {
        this.pageFactory = pageFactory;
    }
 
    /**
     * Returns web driver
     * @return web driver
     */
    public WebDriver driver() {
        return driver;
    }
 
    /**
     * Switches to pop up with specified title
     * @param title pop up title
     */
    public void switchToPopUp(String title) {
        for (String handle : driver().getWindowHandles()) {
            try {
                driver().switchTo().window(handle);
                String s = driver().getTitle();
                if (s != null && s.equals(title)) {
                    break;
                }
            } catch (Exception e) {
            }
        }
    }
 
    /**
     * Waits for opening of the pop up window with default timeout
     * @deprecated Do not use this old method
     * @param previousWidowsCount defines count of windows before window call
     * @param title defines title of expected window
     * @return true if pop up window was opened during the default timeout
     */
    private boolean isPopUpLoaded(final int previousWidowsCount) {
        try {
            new WebDriverWait(driver(), DEFAULT_TIMEOUT, 100*2).until(new ExpectedCondition<Boolean>() {
 
                public Boolean apply(WebDriver webDriver) {
                    return webDriver.getWindowHandles().size() != previousWidowsCount;
                }
            });
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
 
    /**
     * Waits for pop up window and switches to it
     * @deprecated use {@link #waitForPopUpAndSwitch(String title)}
     * @param previousWidowsCount defines count of windows before window call
     * @param title defines title of expected window
     */
    public void waitForPopUpAndSwitch(final int previousWidowsCount, String title) {
        if (isPopUpLoaded(previousWidowsCount)) {
            switchToPopUp(title);
        }
    }
 
    /**
     * Switches to the base window (first window in WindowHandles set)
     */
//    public void switchToBaseWindow() {
//        waitForPopUpAndSwitch(MainPage.TITLE);
//    }
 
    /**
     * Switches to current page.<br/>
     * Selects either the first frame on the page, or the main document when a page contains iframes.
     * Use this function if you nee to return to the page from some iframe
     */
    public void switchToPage() {
        driver().switchTo().defaultContent();
    }
 
    /**
     * Wrapper for WebDriver method <code>findElement(By.id())</code>.
     * @param id defines element id
     * @return found element
     */
    public WebElement findElementById(String id) {
        return driver().findElement(By.id(id));
    }
 
    /**
     * Wrapper for WebDriver method <code>switchTo().frame()</code>.
     * @param nameOrId the name of the frame window, the id of the frame or iframe element
     */
    public void switchToFrame(String nameOrId) {
        waitForIframeLoaded(nameOrId);
        driver().switchTo().frame(nameOrId);
    }
 
    /**
     * Returns windows count
     * @return windows count
     */
    public int getWindowsCount() {
        return driver().getWindowHandles().size();
    }
 
    /**
     * Wrapper for WebDriver method <code>getTitle()</code>.
     * @return title of current window (active at this moment)
     */
    public String getTitle() {
        return driver().getTitle();
    }
 
    /**
     * Returns page title for a specific page
     * @return page title for a specific page
     */
    public String getPageTitle() {
        return pageTitle;
    }
 
    /**
     * Returns true if needed page was loaded
     * @return true if needed page was loaded
     */
    public boolean isLoaded() {
        try {
            new WebDriverWait(driver(), DEFAULT_TIMEOUT, DEFAULT_WAIT_INTERVAL).until(new ExpectedCondition<Boolean>() {
 
                public Boolean apply(WebDriver webDriver) {
                    WebElement element = webDriver.findElement(getPageIdentifier());
                    return webDriver.getTitle().equals(pageTitle)
                            && element != null
                            && element.isDisplayed();
                }
            });
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
 
    /**
     * Closes page if it was opened
     */
    public final void close() {
        if (getTitle().equals(getPageTitle())) {
            driver().close();
//            switchToBaseWindow();
        }
    }
 
    /**
     * Returns current page URL
     * @return current page URL
     */
    public final String getCurrentUrl() {
        return driver().getCurrentUrl();
    }
 
    /**
     * Calls this method every time after page was loaded
     */
    private void waitForIframeLoaded(final String iframeId) {
        try {
            new WebDriverWait(driver(), DEFAULT_TIMEOUT, DEFAULT_WAIT_INTERVAL).until(new ExpectedCondition<Boolean>() {
 
                public Boolean apply(WebDriver webDriver) {
                    return webDriver.findElement(By.id(iframeId)) != null;
                }
            });
        } catch (Exception ex) {
        }
    }
 
    /**
     * Checks element state and after that waits for additional 1 second.
     * In CMS search buttons are disabled during search.
     * @param element defines DOM Element search button as example.
     */
    protected void waitForSearchResults(final Element element) {
        new WebDriverWait(driver, DEFAULT_SEARCH_TIMEOUT, DEFAULT_WAIT_INTERVAL).until(
                new ExpectedCondition<Boolean>() {
 
                    @Override
                    public Boolean apply(WebDriver webDriver) {
                        return !element.isDisabled();
                    }
                });
        //TODO: find how to check that dialog is still open
        try {
            //in CMS "Please wait dialog will be closed in 500 miliseconds. next wait is for it"
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
 
    }
 
    /**
     * Waits for text in dropDown
     * 
     * @param dropDown that must be selected
     */
//    public void waitForTextPresenet(final DropDown dropdown) {
// 
//        new WebDriverWait(driver(), DEFAULT_TIMEOUT, DEFAULT_WAIT_INTERVAL).until(
//                new ExpectedCondition<Boolean>() {
// 
//                    @Override
//                    public Boolean apply(WebDriver webDriver) {
//                        return !dropdown.isEmpty();
//                    }
//                });
//    }
 
    /**
     * Returns page indetifier.<br/>
     * This abstract method should be implemented differently depending on the particular page
     * 
     * @return page indetifier
     */
    protected abstract By getPageIdentifier();
     
    /**
     * Waits for window and switches to it
     * @param title defines title of expected window
     */
    public void waitForPopUpAndSwitch(final String title) {
        try {
            new WebDriverWait(driver(), DEFAULT_TIMEOUT, 100).until(new ExpectedCondition<Boolean>() {
 
                public Boolean apply(WebDriver f) {
                    for (String handle : driver().getWindowHandles()) {
                        try{
                            driver().switchTo().window(handle);
                            String s = driver().getTitle();
 
                            if(s.equals(title)) return true;
                        } catch (Exception ex){
                            //skips handles which were closed 
                        }
                    }
                    return false;
                }
            });
        } catch (Exception ex) {
        }
    }
}
    
    
    

