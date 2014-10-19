package com.lviv.jobsuma.component.elements.impl;

 
import com.lviv.jobsuma.component.element.Attributes;
import com.lviv.jobsuma.component.element.Element;
import org.openqa.selenium.WebElement;

/**
 * Represents implementation of {@link Element}
 */
abstract class AbstractElement implements Element {
    
    protected WebElement wrappedElement;

    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    protected AbstractElement(final WebElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }

    public AbstractElement() {
    }
    
    /**
     * Returns true if element is displayed on page
     * @return true if element is displayed on page
     */
    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }

    /**
     * Returns true if element is disabled
     * @return true if element is disabled
     */
    public boolean isDisabled(){
        return Boolean.valueOf(wrappedElement.getAttribute(Attributes.DISABLED)).booleanValue();
    }
}
