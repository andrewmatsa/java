/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lviv.jobsuma.testcase;

import com.lviv.jobsuma.component.base.JobsSumaProject;
import com.lviv.jobsuma.component.element.Button;
import com.lviv.jobsuma.component.element.TextField;
import com.lviv.jobsuma.page.IndexPage;
import static com.lviv.jobsuma.testcase.BaseTest.project;
import org.junit.After;
import org.junit.Assert; 
import org.junit.Before; 
import org.junit.Test; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
/**
 *
 * @author Andrew
 */
public class IndexPageTest extends BaseTest{
    private IndexPage indexPage = project.getPageFactory().getIndexPage();
    

    /**
     *
     * @throws Exception
     */
  
    @Before
//    public void before() {
//        Assert.assertTrue(indexPage.isLoaded());
//    }
    @After
    public void after() {
       
//        project.getPageFactory();
    }
    
    @Test  
    public void test() { 
        setUp();
//        TextField jobTitleTxtField = (TextField)project.getDriver().findElement(By.id("field-job-title"));
//        jobTitleTxtField.clearAndType("test");
//        TextField jobLocationTxtField = (TextField)project.getDriver().findElement(By.id("field-job-location"));
//        jobTitleTxtField.clearAndType("location");
//        Button searcButton = (Button)project.getDriver().findElement(By.id("edit-job-submit"));
//        searcButton.click();
//        }
        indexPage.clickonfield("Design");
}
}
