package com.lviv.jobsuma.componet.abstractelm;

 
import com.lviv.jobsuma.component.element.Attributes;
import org.openqa.selenium.WebElement;

public abstract class AbstractContainer implements Container {
    protected WebElement wrappedElement;

    @Override
    public final void init(final WebElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }

    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }

    public boolean isDisabled() {
        return Boolean.valueOf(wrappedElement.getAttribute(Attributes.DISABLED)).booleanValue();
    }
}
