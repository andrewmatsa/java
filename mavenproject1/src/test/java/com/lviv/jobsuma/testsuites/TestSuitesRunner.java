package com.lviv.jobsuma.testsuites;
import com.lviv.jobsuma.testcase.IndexPageTest;
 
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Base class for running test classes
 * 
 * @author 
 */

@RunWith(Suite.class)
// list of test classes for running under current testsuite 
@SuiteClasses({
                 IndexPageTest.class
                })
public class TestSuitesRunner {
    
    @BeforeClass
    public static void start(){
        /* Please, uncomment next line if you want to do backup before tests will started */
    }
    
    @AfterClass
    public static void finish(){
      
    }
}