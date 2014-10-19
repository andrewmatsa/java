/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lviv.jobsuma.component.base;

import com.lviv.jobsuma.component.element.Attributes;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Andrew
 */
public abstract class AbstractContainer implements IContainer{
    protected WebElement wrappedElement;

    @Override
    public final void init(final WebElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }

    @Override
    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }

    public boolean isDisabled() {
        return Boolean.valueOf(wrappedElement.getAttribute(Attributes.DISABLED)).booleanValue();
    }
}
    
