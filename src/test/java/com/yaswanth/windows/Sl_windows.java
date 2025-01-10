package com.yaswanth.windows;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;

public class Sl_windows {

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
    public void test_windows() throws Exception{


        String url = "https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String parentWindowHandle = driver.getWindowHandle();
        //System.out.println("Parent->"+parentWindowHandle);

        List<WebElement>list_heatmaps = driver.findElements(By.cssSelector("[data-qa='yedexafobi']"));
        Actions actions  =  new Actions(driver);
        actions.moveToElement(list_heatmaps.get(1)).click().build().perform();

        Thread.sleep(13000);
        Set<String>allHandles = driver.getWindowHandles();

        for(String handle : allHandles ){
            if(!handle.equals(parentWindowHandle)){
                driver.switchTo().window(handle);
                driver.switchTo().frame("heatmap-iframe");
                WebElement clickmap = driver.findElement(By.cssSelector("[data-qa='liqokuxuba']"));
                clickmap.click();


            }
        }
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