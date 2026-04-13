package com.learnautomation.ex02_Selenium_Basics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.Set;

public class TestSelenium09_VerifyPageSource {

    @Test(description = "Open the Url")
    public void test_selenium01(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://magarpattacity.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("nandedcity")){
            System.out.println("Magarpatta website is visible !");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
        driver.quit();
    }
}
