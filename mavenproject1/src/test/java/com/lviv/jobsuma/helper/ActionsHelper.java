/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lviv.jobsuma.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author lesya
 */
public class ActionsHelper {
    private static Actions actions;

    private ActionsHelper() {
    }
    
    public static void init(WebDriver driver) {
        actions = new Actions(driver);
    }
    
    /**
     * Performs double click on element
     * @param element element, which need to click
     */
    public static void doubleClick(WebElement element) {
        actions.doubleClick(element);
        actions.perform();
    }
}