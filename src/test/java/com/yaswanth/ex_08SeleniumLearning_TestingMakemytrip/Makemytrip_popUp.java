package com.yaswanth.ex_08SeleniumLearning_TestingMakemytrip;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Makemytrip_popUp {


    @Description
    @Test
    public void test_MakeMytrip_Popup(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.makemytrip.com");


        WebElement Login_btn = driver.findElement(By.xpath("//li[@data-cy='account']"));
        Login_btn.click();


        WebElement Screen_Click = driver.findElement(By.xpath("//section[@data-cy='CommonModal_2']"));


        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(Screen_Click));

        wait.until(ExpectedConditions.textToBePresentInElement(Screen_Click, ""));

        Screen_Click.click();
        driver.quit();

















    }





}
