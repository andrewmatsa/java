package com.lviv.jobsuma.component.element;

import org.openqa.selenium.WebElement;

/**
 * Describes text field behaviour
 */
public interface TextField extends WebElement {
    
    /**
     * Writes text into the text field
     * @param text defines text to write into the field
     */
    void type(String text);

    /**
     * Clears the text field
     */
    void clear();

    /**
     * Clears the text field and writes text
     * @param text defines text to write into the field
     */
    void clearAndType(String text);
    
    /**
     * Imitates pressing of ENTER button on the text field
     */
    void clickEnter();
    
    /**
     * Returns text field value
     * @return text field value
     */
    String getValue();
    
    /**
     * Returns true if text field is not filled
     * @return true if text field is not filled
     */
    boolean isEmpty();
    
    /**
     * Returns text field max length
     * @return text field max length
     */
    int getMaxLength();
    
    void setFocus();
}
