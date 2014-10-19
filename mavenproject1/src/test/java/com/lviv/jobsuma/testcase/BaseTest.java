/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lviv.jobsuma.testcase;

import com.lviv.jobsuma.component.base.JobsSumaProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.MethodRule;
import org.junit.rules.TestWatchman;
import org.junit.runners.model.FrameworkMethod;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 

/**
 *
 * @author lesya
 */
public class BaseTest {
    
    private static final String PROPERTY_FILE = "properties";
    public static final ResourceBundle JobsSuma_SETTINGS = ResourceBundle.getBundle(PROPERTY_FILE);
    protected static JobsSumaProject project;

    public static class Consts {

        public static final String USER_LOGIN = JobsSuma_SETTINGS.getString("user.login");
        public static final String USER_PASSWORD = JobsSuma_SETTINGS.getString("user.password");
        public static final String PROJECT_URL = JobsSuma_SETTINGS.getString("project.url");
        public static final String DEFAULT_TIMEOUT = JobsSuma_SETTINGS.getString("default.timeout");
        public static final String PROJECT_LOCATION = JobsSuma_SETTINGS.getString("project.location");
        public static final String SCREENSHOT_LOCATION = PROJECT_LOCATION + JobsSuma_SETTINGS.getString("screenshot.folder");
        public static final String DEFAULT_EXTENTION_FOR_SCREENSHOT = ".png";
        public static final String DEFAULT_SEPARATOR = "_";
        public static final String FILE_PATH = JobsSuma_SETTINGS.getString("file.path");
    }
 
    public void setUp() { 
        project = new JobsSumaProject();
        project.getDriver().get(Consts.PROJECT_URL);
      
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//        driver.get("http://www.google.com/");
        //driver.findElement("");
    }

    public static void tearDown() {
        try {
            project.getDriver().quit();
        } catch (Exception ex) {
            //Nothing to do
        }
    }
    /**
     * This Watchman take a screen shots when test failed
     */
    @Rule
    public MethodRule watchman = new TestWatchman() {

        @Override
        public void failed(Throwable e, FrameworkMethod method) {
            FileOutputStream fos = null;
            try {
                byte[] screenshot = ((TakesScreenshot) project.getDriver()).getScreenshotAs(OutputType.BYTES);
                File f = new File(getScreenShotName(method));
                f.createNewFile();
                fos = new FileOutputStream(f);
                fos.write(screenshot);
                fos.flush();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BaseTest.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                Logger.getLogger(BaseTest.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (fos != null) {
                        fos.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(BaseTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        private String getScreenShotName(FrameworkMethod method) {
            StringBuilder builder = new StringBuilder();
            builder.append(Consts.SCREENSHOT_LOCATION);
            builder.append(method.getMethod().getName());
            builder.append(Consts.DEFAULT_SEPARATOR);
            builder.append(new Date().getTime());
            builder.append(Consts.DEFAULT_EXTENTION_FOR_SCREENSHOT);
            return builder.toString();
        }
    };
}

