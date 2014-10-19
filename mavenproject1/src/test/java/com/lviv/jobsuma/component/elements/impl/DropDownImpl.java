package com.lviv.jobsuma.component.elements.impl;
 
import com.lviv.jobsuma.component.element.DropDown;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Represents implementation of {@link DropDown}
 *
 * @author andrew
 */
public class DropDownImpl extends AbstractElement implements DropDown {

    private Select stored;

    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    public DropDownImpl(WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Selects empty option
     */
    public void selectEmpty() {
        getSelect().selectByVisibleText(EMPTY);
    }

    /**
     * Returns {@link Select} element
     * @return
     */
    public Select getSelect() {
        if (stored == null) {
            stored = new Select(wrappedElement);
        }
        return stored;
    }

    /**
     * Selects element by index
     * @param index element index
     */
    public void selectElementByIndex(int index) {
        getSelect().selectByIndex(index);
    }

    /**
     * Selects element by value
     * @param value element value
     */
    public void selectElementByValue(String value) {
        getSelect().selectByValue(value);
    }

    /**
     * Verification of the existence of an option with the specified text
     * @param text option text
     * @return <code>true</code> if option was found or <code>false</code> if didn't found
     */
    public boolean hasOption(String text) {
        for (WebElement option : getSelect().getOptions()) {
            if (option.getText().equals(text)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Selects element by visible text
     * @param text element visible text
     */
    public void selectElementByVisibleText(String text) {
        getSelect().selectByVisibleText(text);
    }
    
    /**
     * Returns selected  text
     * @return selected  text
     */
    public String getSelectedText() {
        return getSelect().getFirstSelectedOption().getText();
    }

    /**
     * 
     * @return true if the dropDown empty
     */
    public boolean isEmpty() {
         for (WebElement option : getSelect().getOptions()) {
            if (!option.getText().equals("")) 
                return false;
         }
         return true; 
    }
}
