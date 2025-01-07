package com.yaswanth.ex_06SelinumLearning_PopUpMessage;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkingPop {

    @Description
    @Test
    public void eroor_message(){
        EdgeOptions eo = new EdgeOptions();
        eo.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        eo.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(eo);
        driver.get("https://www.idrive360.com/enterprise/login");


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement User_Input_Name = driver.findElement(By.name("username"));
        User_Input_Name.sendKeys("augtest_040823@idrive.com");


        WebElement User_Input_Password= driver.findElement(By.id("password"));
        User_Input_Password.sendKeys("123456");

        WebElement User_Element_CheckBox = driver.findElement(By.className("id-check"));
        User_Element_CheckBox.click();

        WebElement User_SignIn = driver.findElement(By.id("frm-btn"));
        User_SignIn.click();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


       // WebElement Error_message = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        WebElement Error_message = driver.findElement(By.className("id-card-title"));
        Assert.assertEquals(Error_message.getText(),"Your free trial has expired");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
















}
