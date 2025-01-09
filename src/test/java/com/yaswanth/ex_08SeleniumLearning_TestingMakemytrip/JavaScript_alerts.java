package com.yaswanth.ex_08SeleniumLearning_TestingMakemytrip;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScript_alerts {



    @Description
    @Test
    public void test_alerts(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


//        WebElement Click_JsAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//        Click_JsAlert.click();
//
//
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//
//
//        String result = driver.findElement(By.id("result")).getText();
//
//        Assert.assertEquals(result,"You successfully clicked an alert");

//        WebElement Click_jsConfirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//        Click_jsConfirm.click();
//
//
//
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//
//
//
//        String result = driver.findElement(By.id("result")).getText();
//
//        Assert.assertEquals(result,"You clicked: Ok");




        WebElement Click_jsPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

        Click_jsPrompt.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());



        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Yaswanth");
        alert.accept();


        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You entered: Yaswanth");


    }






}
