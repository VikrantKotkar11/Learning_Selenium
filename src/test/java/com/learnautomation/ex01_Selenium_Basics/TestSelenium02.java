package com.learnautomation.ex01_Selenium_Basics;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Test(description = "Open the app.vwo.com and verify the title!")
    public void test_selenium02(){
        // open the url
        EdgeDriver driver = new EdgeDriver();


        //nevigate/get the url
        driver.get("https://app.vwo.com");


        //assert the url --> Validation
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        //Close the browser
        driver.quit();

    }

}
