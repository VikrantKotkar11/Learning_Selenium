package com.learnautomation.ex02_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium14_Project1 {
    @Test(description = "Verify the emailid ,password and verify the errors")
    public void test_navigate_vwo_login() throws Exception{

        //EdgeOptions edgeOptions = new EdgeOptions();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
//        driver.navigate().to("https://app.vwo.com");
        driver.get("https://app.vwo.com");

        // 1. Find the email inputbox and enter the email
        // <input open Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // id="login-username"
        // data-qa="hocewoqisi"
        // > close Tag

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("vikrant@admin.com");

        // 2. Find the password inputbox and enter the password

        // <input
        // type="password"
        // class="text-input W(100%)"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe">




        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("pass");

        // 3. Find the submit button and click on it.
        // <button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--positive btn--inverted W(80%) H(48px) Fz(16px)"
        // onclick="login.login(event)"
        // data-qa="sibequkica"
        // >

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

//        waitJVM(3000);

        Thread.sleep(3000);

        // 4. Find the invalid error message and verify.
        // <div
        // class="notification-box-description"
        // data-qa="rixawilomi">
        // Your email, password, IP address or location did not match</div>


        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }
}
