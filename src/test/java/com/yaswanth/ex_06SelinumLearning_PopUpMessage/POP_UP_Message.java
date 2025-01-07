package com.yaswanth.ex_06SelinumLearning_PopUpMessage;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class POP_UP_Message {
    @Description
    @Test
    public void ExperienceMessage() throws InterruptedException {


        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver= new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");


        WebElement Input_User_Name= driver.findElement(By.id("username"));
        Input_User_Name.sendKeys("augtest_040823@idrive.com");

        WebElement Input_Password = driver.findElement(By.id("password"));
        Input_Password.sendKeys("123456");

        WebElement span_checkbox = driver.findElement(By.className("id-checkmark"));
        span_checkbox.click();

        Thread.sleep(3000);








    }








}
