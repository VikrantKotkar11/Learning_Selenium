package com.learnautomation.ex02_Selenium_Basics;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium13_addExtension {
    @Test(description = "Options class")
    public void test_selenium01() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        //edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex02_Selenium_Basics/adblock1.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");
    }
}
