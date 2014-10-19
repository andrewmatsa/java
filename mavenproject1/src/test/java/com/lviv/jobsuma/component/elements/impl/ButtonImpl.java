package com.lviv.jobsuma.component.elements.impl;

import com.lviv.jobsuma.component.element.Button; 
import org.openqa.selenium.WebElement;

/**
 * Represents implementation of {@link Button}
 * @author 
 */
class ButtonImpl extends AbstractElement implements Button {
    
    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    protected ButtonImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Performs a click
     */
    @Override
    public void click() {
        wrappedElement.click();
    }
}
