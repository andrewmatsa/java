package com.lviv.jobsuma.component.elements.impl;
 
import com.lviv.jobsuma.component.element.Element;
import com.lviv.jobsuma.componet.abstractelm.ElementFactory;
import java.lang.reflect.InvocationTargetException;
import static java.text.MessageFormat.format;
import org.openqa.selenium.WebElement;

/**
 * Represents implementation of {@link ElementFactory}
 */
public class DefaultElementFactory implements ElementFactory {
    
    /**
     * Returns element which created by implementation of specified class.<br/>
     * This implementation will be matched in the com.malkos.masterview.cms.component.elements.impl package
     * 
     * @param <E> defines all elements which inherited from {@link Element}
     * @param elementClass defines class
     * @param wrappedElement defines {@link WebElement} which should be wrapped
     * @return wrapped {@link WebElement} which implements one of class which inherited from {@link Element}
     */
    @Override
    public <E extends Element> E create(final Class<E> elementClass, final WebElement wrappedElement) {
        try {
            return findImplementationFor(elementClass)
                    .getDeclaredConstructor(WebElement.class)
                    .newInstance(wrappedElement);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private <E extends Element> Class<? extends E> findImplementationFor(final Class<E> elementClass) {
        try {
            if (!elementClass.isInterface()) return elementClass;
            return (Class<? extends E>) Class.forName(format("{0}.{1}Impl", getClass().getPackage().getName(), elementClass.getSimpleName()));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

