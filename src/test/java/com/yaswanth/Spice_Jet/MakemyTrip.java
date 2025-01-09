package com.yaswanth.Spice_Jet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakemyTrip {

    EdgeDriver driver;

    @BeforeTest
    public void beforeTest(){

        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver= new EdgeDriver();
    }

    @Test
    public void test_fromcity() {
        String url = "https://www.makemytrip.com/flights/";
        driver.get(url);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));

        WebElement froMCity = driver.findElement(By.id("fromCity"));

        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));

        Actions actions = new Actions(driver);
        actions.moveToElement(froMCity).click().sendKeys("del").build().perform();
        actions.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
    }


    @AfterTest
    public void afterTest(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }






















}
