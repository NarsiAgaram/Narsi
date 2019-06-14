package com.rsc.tech.test;

import com.rsc.tech.test.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    DriverManager manager = new DriverManager();

    @Before
    public void setUp(){
        manager.openBrowser();
        manager.navigateToUrl();
    }

    @After
    public void TearDown(){
        manager.closeBrowser();
    }
}
