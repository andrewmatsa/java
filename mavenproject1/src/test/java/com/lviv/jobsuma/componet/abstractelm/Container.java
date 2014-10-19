package com.lviv.jobsuma.componet.abstractelm;


import com.lviv.jobsuma.component.element.Element;
import org.openqa.selenium.WebElement;


public interface Container extends Element {
    void init(WebElement wrappedElement);
}
