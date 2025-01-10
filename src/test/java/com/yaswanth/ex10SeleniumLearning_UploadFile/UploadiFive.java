package com.yaswanth.ex10SeleniumLearning_UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class UploadiFive {


    EdgeDriver driver;

    @BeforeTest
    public void beforeTest(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("maximized");
        driver= new EdgeDriver();
    }

    @Test
    public void uploadthefile() throws InterruptedException {
        driver.manage().window().maximize();
        String url = "https://the-internet.herokuapp.com/upload";
        driver.get(url);
        WebElement upload01 = driver.findElement(By.xpath("//input[@id='file-upload']"));
        String working_dir=System.getProperty("user.dir");
        Thread.sleep(3000);

        upload01.sendKeys(working_dir+"src/test/java/com/yaswanth/ex10SeleniumLearning_UploadFile/DataUpload.txt");
        driver.findElement(By.id("file-submit")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='File Uploaded!']")));
        String success_msg= driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
        Assert.assertEquals(success_msg,"File Uploaded!");
//        upload01.sendKeys("src/test/java/com/yaswanth/ex10SeleniumLearning_UploadFile/example.apk");
//
//
//        WebElement submit = driver.findElement(By.xpath("//input[@class='button']"));
//        submit.click();
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
