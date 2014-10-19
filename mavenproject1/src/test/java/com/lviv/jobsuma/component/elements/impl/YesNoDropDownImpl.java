package com.lviv.jobsuma.component.elements.impl;

import com.lviv.jobsuma.component.element.YesNoDropDown;
import org.openqa.selenium.WebElement;

/**
 * Represents implementation of {@link YesNoDropDown}
 * @author vlavrynovych
 */
public class YesNoDropDownImpl extends DropDownImpl implements YesNoDropDown {
    
    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    public YesNoDropDownImpl(WebElement wrappedElement) {
        super(wrappedElement);
    }
    
    /**
     * Selects Yes value
     */
    public void selectYes(){
        selectElementByVisibleText(YES);
    }
    
    /**
     * Selects No value
     */
    public void selectNo(){
        selectElementByVisibleText(NO);
    }

    /**
     * Sets the specified value. <br/>
     * Sets empty value if specified value is null
     * @param value defines new value for {@link YesNoDropDown}
     */
    public void selectValue(Boolean value) {
        if(value!=null){
            if(value){
                selectYes();
            } else {
                selectNo();
            }
        } else {
            selectEmpty();
        }
    }

    public boolean isDisplayed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isDisabled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
