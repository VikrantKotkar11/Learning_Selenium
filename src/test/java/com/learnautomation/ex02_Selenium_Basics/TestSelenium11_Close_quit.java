package com.learnautomation.ex02_Selenium_Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium11_Close_quit {
    @Test(description = "Open the URl")
    public void test_selenium01() throws Exception {
        // Use WebDriverManager to setup EdgeDriver
        //WebDriverManager.edgedriver().setup();
        //WebDriver driver = new EdgeDriver();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        Thread.sleep(5000);
          // driver.close();

        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null

      //  Thread.sleep(5000);
        //driver.quit();
        // It will close all the tabs. - session id == nul
    }
}
