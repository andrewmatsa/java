package com.lviv.jobsuma.component.elements.impl;

import com.lviv.jobsuma.component.element.Attributes;
import com.lviv.jobsuma.component.element.TextField; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Represents implementation of {@link TextField}
 */
class TextFieldImpl extends AbstractElement implements TextField {
    
    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    protected TextFieldImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Writes text into the text field
     * @param text defines text to write into the field
     */
    @Override
    public void type(final String text) {
        if(text!=null && !text.equals("")){
            wrappedElement.sendKeys(text);
        }
    }

    /**
     * Clears the text field
     */
    @Override
    public void clear() {
        wrappedElement.clear();
    }

    /**
     * Clears the text field and writes text
     * @param text defines text to write into the field
     */
    @Override
    public void clearAndType(final String text) {
        clear();
        type(text);
    }

    /**
     * Imitates pressing of ENTER button on the text field
     */
    public void clickEnter() {
        wrappedElement.sendKeys(Keys.ENTER);
    }

    /**
     * Returns text field value
     * @return text field value
     */
    public String getValue(){
        return wrappedElement.getAttribute(Attributes.VALUE);
    }
    
    /**
     * Returns true if text field is not filled
     * @return true if text field is not filled
     */
    public boolean isEmpty() {
        return getValue().trim().isEmpty();
    }

    public void setFocus() {
        wrappedElement.click();
    }

    /**
     * Returns text field max length
     * @return text field max length
     */
    public int getMaxLength() {
        String maxLength = wrappedElement.getAttribute(Attributes.MAX_LENGTH);
        return maxLength==null || maxLength.isEmpty() ? Integer.MAX_VALUE : new Integer(maxLength);
    }
}
