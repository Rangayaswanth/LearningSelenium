package com.yaswanth.Spice_Jet;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpiceJet {

    EdgeDriver driver;


    @BeforeTest
    public void beforeTest(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);

    }


    @Test
    @Description
    public void test_From(){

        String url = "https://www.spicejet.com/";
        driver.get(url);

        WebElement btn_input  = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));

        Actions actions = new Actions(driver);

       actions.moveToElement(btn_input).click().sendKeys("BLR").build().perform();
    }
    @AfterTest
    public void afterTest(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


       driver.quit();


    }


}
