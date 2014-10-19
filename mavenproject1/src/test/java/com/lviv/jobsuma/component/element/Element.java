package com.lviv.jobsuma.component.element;

/**
 * Describes basic behaviour of web elements
 */
public interface Element {
    
    /**
     * Returns true if element is displayed on page
     * @return true if element is displayed on page
     */
    boolean isDisplayed();
    
    /**
     * Returns true if element is disabled
     * @return true if element is disabled
     */
    boolean isDisabled();
}
