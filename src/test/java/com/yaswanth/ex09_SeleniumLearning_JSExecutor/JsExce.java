package com.yaswanth.ex09_SeleniumLearning_JSExecutor;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class JsExce {
    EdgeDriver driver;
    @Description
    @Test
    public void JsFirst_Name() {

        EdgeOptions edgeOptions  = new EdgeOptions();
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();


        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);


        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("window.scrollBy(0,500);");

        String url = js.executeScript("return document.URL;").toString();
        System.out.println(url);













    }






}
