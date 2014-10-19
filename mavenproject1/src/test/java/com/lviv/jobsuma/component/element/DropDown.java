package com.lviv.jobsuma.component.element;

/**
 * Describes dropdown behaviour
 * @author vlavrynovych
 */
public interface DropDown extends Element {
    
    String EMPTY = "";
    
    /**
     * Selects empty option
     */
    void selectEmpty();
    
    /**
     * Selects element by index
     * @param index element index
     */
    void selectElementByIndex(int index);
    
    /**
     * Selects element by value
     * @param value element value
     */
    void selectElementByValue(String value);
    
    /**
     * Selects element by visible text
     * @param text element visible text
     */
    void selectElementByVisibleText(String text);
    
    /**
     * Verification of the existence of an option with the specified text
     * @param text option text
     * @return <code>true</code> if option was found or <code>false</code> if didn't found
     */
    boolean  hasOption(String text);
    boolean isEmpty();
    /**
     * Returns selected  text
     * @return selected  text
     */
    String getSelectedText();
}
