/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lviv.jobsuma.component.base;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Andrew
 */
public interface IContainer extends IElement{
    void init(WebElement wrappedElement);
}
    

