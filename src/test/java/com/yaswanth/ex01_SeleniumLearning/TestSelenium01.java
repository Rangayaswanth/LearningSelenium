package com.yaswanth.ex01_SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {


    @Test
    public void test_Selenium01(){

        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());













    }









}
