package com.yaswanth.ex10SeleniumLearning_UploadFile;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class upLoad_File {

    EdgeDriver driver;

    @BeforeTest
    public void beforeTest(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("maximized");
        driver= new EdgeDriver();
    }
    @Description
    @Test
    public void testUploadFile(){
        driver.manage().window().maximize();
        String url = "https://app-automate.browserstack.com/dashboard/v2/getting-started";
        driver.get(url);


        WebElement upload = driver.findElement(By.xpath("//span[text()='UPLOAD APP']"));

        Actions actions = new Actions(driver);
        actions.click(upload).sendKeys("src/test/java/com/yaswanth/ex10SeleniumLearning_UploadFile/example.apk");
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
