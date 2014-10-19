package com.lviv.jobsuma.componet.abstractelm;


import com.lviv.jobsuma.component.element.Element;
import org.openqa.selenium.WebElement;

/**
 * Describes behaviour of element factory
 */
public interface ElementFactory {
    
    /**
     * Returns element which created by implementation of specified class.<br/>
     * This implementation will be matched in the com.malkos.masterview.cms.component.elements.impl package
     * 
     * @param <E> defines all elements which inherited from {@link Element}
     * @param elementClass defines class
     * @param wrappedElement defines {@link WebElement} which should be wrapped
     * @return wrapped {@link WebElement} which implements one of class which inherited from {@link Element}
     */
    <E extends Element> E create(Class<E> elementClass, WebElement wrappedElement);
}
