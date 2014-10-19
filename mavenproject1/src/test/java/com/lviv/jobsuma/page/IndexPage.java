/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lviv.jobsuma.page;

import com.lviv.jobsuma.component.base.AbstractContainer;
import com.lviv.jobsuma.component.element.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Andrew
 */
public class IndexPage extends BasePage {  
    private static final String TITLE = "Jobsuma";
    private static final String IDENT = "warum-jobsuma";
    @FindBy(id = "field-job-title")
    private TextField searchTitleField;
    
    public IndexPage(){
        super(TITLE);
    }
    
    @Override
    protected By getPageIdentifier() {
        return By.id(IDENT);
    }
    
    public void clickonfield (String text){
        searchTitleField.clearAndType(text);
    }

}
