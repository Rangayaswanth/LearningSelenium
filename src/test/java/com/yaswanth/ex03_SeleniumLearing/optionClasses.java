package com.yaswanth.ex03_SeleniumLearing;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class optionClasses {



    @Description("Working on the Options Classes")
    @Test
    public void test_optionclasses() throws Exception{
        EdgeOptions edgeoptions =  new EdgeOptions();
        edgeoptions.addArguments("--window-size-1920,1080");













        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://google.com");









    }
}
