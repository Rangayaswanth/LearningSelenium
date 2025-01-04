package com.yaswanth.ex02_SeleniumLearning;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing_Live {


    @Description
    @Test
    public void test_selenium4() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service");
            Assert.assertTrue(true);
        }
        else {
            throw new Exception("CURA Healthcare Service is not visible");
        }




    }
}
