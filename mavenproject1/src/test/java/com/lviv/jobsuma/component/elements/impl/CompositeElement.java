package com.lviv.jobsuma.component.elements.impl;

 
import com.lviv.jobsuma.component.element.Element;  
import com.lviv.jobsuma.componet.abstractelm.SimpleFieldDecorator;
import java.util.List;
import org.openqa.selenium.WebElement;

/**
 * Represents abstract composite element
 * @author oshumilov
 */
public abstract class CompositeElement extends AbstractElement {
    
    private SimpleFieldDecorator decorator = new SimpleFieldDecorator();
    
    /**
     * Constructs an instance
     * @param wrappedElement defines wrapped {@link WebElement}
     */
    public CompositeElement(WebElement wrappedElement) {
        super(wrappedElement);
    }

    public CompositeElement() {
    }
    
    /**
     * Returns element which created by implementation of specified class.<br/>
     * This implementation will be matched in the com.malkos.masterview.cms.component.elements.impl package
     * 
     * @param <E> defines all elements which inherited from {@link Element}
     * @param elementClass defines class
     * @param wrappedElement defines {@link WebElement} which should be wrapped
     * @return wrapped {@link WebElement} which implements one of class which inherited from {@link Element}
     */
    protected <E extends Element> E getElement(Class<E> elementClass, WebElement wrappedElement) {
        return decorator.decorate(elementClass, wrappedElement);
    };
    
    /**
     * Returns list of elements which created by implementation of specified class.<br/>
     * This implementation will be matched in the com.malkos.masterview.cms.component.elements.impl package
     * 
     * @param <E> defines all elements which inherited from {@link Element}
     * @param elementClass defines class
     * @param wrappedElement defines {@link WebElement} which should be wrapped
     * @return list of wrapped elements which implements one of class which inherited from {@link Element}
     */
    protected <E extends Element> List<E> getElementList(Class<E> elementClass, List<WebElement> wrappedElements) {
        return decorator.decorateList(elementClass, wrappedElements);
    }; 
    
}
