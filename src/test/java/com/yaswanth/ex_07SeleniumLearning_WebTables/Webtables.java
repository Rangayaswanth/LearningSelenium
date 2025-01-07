package com.yaswanth.ex_07SeleniumLearning_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Webtables {



    @Description
    @Test
    public void Test_Webtables(){


        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/webtable.html");









    }
















}
