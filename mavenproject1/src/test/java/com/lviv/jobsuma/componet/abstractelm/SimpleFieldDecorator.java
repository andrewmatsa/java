package com.lviv.jobsuma.componet.abstractelm;


import com.lviv.jobsuma.component.element.Element;
import com.lviv.jobsuma.component.elements.impl.DefaultElementFactory;
import com.lviv.jobsuma.componet.abstractelm.ElementFactory;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;

/**
 * Represents class which decorates web elements into basic elements of MasterView project
 * @author oshumilov
 */
public class SimpleFieldDecorator {
    
    private ElementFactory factory;

    /**
     * Constructs an instance
     */
    public SimpleFieldDecorator() {
        factory =new DefaultElementFactory();
    }

    /**
     * Constructs an instance
     * @param factory defines element factory
     */
    public SimpleFieldDecorator(ElementFactory factory) {
        this.factory = factory;
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
    public <E extends Element> E decorate(Class<E> elementClass, WebElement wrappedElement) {
        return factory.create(elementClass, wrappedElement);
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
    public <E extends Element> List<E> decorateList(Class<E> elementClass, List<WebElement> wrappedElements) {
        List result = new ArrayList<E>();
        for (WebElement element : wrappedElements) {
            result.add(factory.create(elementClass, element));
        }
        return result;
    };
}
