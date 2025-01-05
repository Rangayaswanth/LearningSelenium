package com.yaswanth.ex04_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MiniDemo01 {




    @Description("TestCase")
    @Test
    public void test_Positive_MakeApp() throws InterruptedException {


        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com");
        WebElement buttonMakeAppoin = driver.findElement(By.id("btn-make-appointment"));
        buttonMakeAppoin.click();

        WebElement UserNameIn = driver.findElement(By.id("txt-username"));
        UserNameIn.sendKeys("John Doe");


        WebElement Password = driver.findElement(By.id("txt-password"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement ButtonLogin = driver.findElement(By.id("btn-login"));
        ButtonLogin.click();


        //driver.get("https://katalon-demo-cura.herokuapp.com/#appointment");

        WebElement Facility = driver.findElement(By.id("combo_facility"));
        Facility.sendKeys("Hongkong CURA Healthcare Center");


        WebElement chk_chk_hospotal_readmission = driver.findElement(By.id("chk_hospotal_readmission"));
        chk_chk_hospotal_readmission.click();

        String CurrentURL = driver.getCurrentUrl();
        String ExpectedURL =  "https://katalon-demo-cura.herokuapp.com/#appointment";
        Assert.assertEquals(CurrentURL,ExpectedURL, "Test Failed: The current URL does not match the expected URL!");
        System.out.println("Test Passed: Successfully navigated to the appointment page.");
        driver.quit();
    }

}
