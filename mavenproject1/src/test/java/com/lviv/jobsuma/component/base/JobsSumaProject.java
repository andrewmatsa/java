package com.lviv.jobsuma.component.base;

import com.lviv.jobsuma.helper.ActionsHelper;
import com.lviv.jobsuma.testcase.BaseTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * Instance of this class represents project. It contains all needed constants and parameters from property file.
 * @author yzaretskyy
 */
public class JobsSumaProject {
    
    protected WebDriver driver = null;
    public static final Integer DEFAULT_TIMEOUT = new Integer((BaseTest.Consts.DEFAULT_TIMEOUT));
    public static PageFactory pageFactory; 
    
    public JobsSumaProject() { 
        // this path  should changed due to os
     System.setProperty("webdriver.chrome.driver", "C://tests//chromedriver.exe");
     driver = new ChromeDriver();
// driver = new FirefoxDriver();
      
     driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
     pageFactory = new PageFactory(driver);
     ActionsHelper.init(driver);
        
    }
    
    public WebDriver getDriver() {
        return driver;
    }
    
    public PageFactory getPageFactory() {
    
        return pageFactory;
    }
    
    public void reloadPageFactory() {
        pageFactory = new PageFactory(driver);
    }
}
