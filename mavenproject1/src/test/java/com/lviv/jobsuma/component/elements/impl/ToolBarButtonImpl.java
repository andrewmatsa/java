package com.lviv.jobsuma.component.elements.impl;

import com.lviv.jobsuma.component.element.Attributes;
import com.lviv.jobsuma.component.element.ToolBarButton;
import org.openqa.selenium.WebElement;

/**
 * Represents implementation of {@link ToolBarButton}
 * @author 
 */
public class ToolBarButtonImpl extends ButtonImpl implements ToolBarButton {
    
    private static final String CLASS_DISABLED = "tbButtonDisabled";
    
    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    protected ToolBarButtonImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }
    
    /**
     * Returns true if element is disabled.<br/>
     * It is checked by class attribute.
     * 
     * @return true if element is disabled
     */
    @Override
    public boolean isDisabled(){
        String classValue = wrappedElement.getAttribute(Attributes.CLASS);
        return classValue.equals(CLASS_DISABLED);
    }
}
