package com.learnautomation.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07_CommandMax {
    @Test(description = "Open the URL")
    public void Test_selenium01(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        driver.manage().window().maximize();
        driver.manage().window().minimize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
