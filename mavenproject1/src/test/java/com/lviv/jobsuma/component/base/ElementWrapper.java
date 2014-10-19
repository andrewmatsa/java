package com.lviv.jobsuma.component.base;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Represent helper to get wrapped elements from {@link WebElement}
 * @author vlavrynovych
 */
public class ElementWrapper {

    private WebDriver driver;
//    private SimpleFieldDecorator decorator = new SimpleFieldDecorator();

    /**
     * Constructs an instance
     * @param driver defines web driver
     */
    public ElementWrapper(WebDriver driver) {
        this.driver = driver;
    }

//    /**
//     * Returns {@link TextField} by selector
//     * @param by defines selector
//     * @return {@link TextField} by selector
//     */
//    public TextField getTextFieldBy(By by) {
//        return getTextField(driver.findElement(by));
//    }
//
//    /**
//     * Returns {@link ToolBarButton} by selector
//     * @param by defines selector
//     * @return {@link ToolBarButton} by selector
//     */
//    public ToolBarButton getToolBarButtonBy(By by) {
//        return getToolBarButton(driver.findElement(by));
//    }
//
//    /**
//     * Returns {@link ToolBarButton} from {@link WebElement}
//     * @param element defines web element to wrap
//     * @return {@link ToolBarButton} from {@link WebElement}
//     */
//    public ToolBarButton getToolBarButton(WebElement element) {
//        return initElement(ToolBarButton.class, element);
//    }
//
//    /**
//     * Returns {@link TextField} from {@link WebElement}
//     * @param element defines web element to wrap
//     * @return {@link TextField} from {@link WebElement}
//     */
//    public TextField getTextField(WebElement element) {
//        return initElement(TextField.class, element);
//    }
//
//    private <E extends Element> E initElement(Class<E> elementClass, WebElement wrappedElement) {
//        return decorator.decorate(elementClass, wrappedElement);
//    }
//;
}
