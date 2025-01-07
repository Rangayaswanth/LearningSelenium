package com.yaswanth.ex_08SeleniumLearning_SvgElements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class svgElements02 {


    @Description
    @Test
    public void test_svgState02() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.flipkart.com/");
        WebElement Searching_Item = driver.findElement(By.name("q"));
        Searching_Item.sendKeys("macmini");

        List<WebElement>SearchKey = driver.findElements(By.xpath("//*[name()='svg']"));
        SearchKey.get(0).click();






//        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
//        svgElements.get(0).click();


    }}
