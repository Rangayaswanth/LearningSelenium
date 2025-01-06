package com.yaswanth.ex_05_SeleniumLearning;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Xpath_Cura {
    @Description
    @Test
    public void Xpath_Cura(){

        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.espocrm.com/demo/");
//        WebElement Live_Demo = driver.findElement(By.ByXPath("//a[@id='demo-button']"));
//        Live_Demo.click();
        WebElement Live_Demo = driver.findElement(By.xpath("//a[@id='demo-button']"));
        Live_Demo.click();
    }
}
