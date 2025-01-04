package com.yaswanth.ex02_SeleniumLearning;

import io.qameta.allure.Description;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Description("Open the URL")
    @Test
    public void test_Selenium(){
        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
//        driver.manage().window().maximize();
//        driver.manage().window().minimize();
        Assert.assertEquals(driver.getTitle(),"Login - VWO ");

        driver.close();


    }





}
