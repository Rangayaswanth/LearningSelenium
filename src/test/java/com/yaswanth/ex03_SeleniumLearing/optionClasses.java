package com.yaswanth.ex03_SeleniumLearing;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class optionClasses {



    @Description("Working on the Options Classes")
    @Test
    public void test_optionclasses() throws Exception{
        EdgeOptions edgeoptions =  new EdgeOptions();
        edgeoptions.addArguments("--window-size-1920,1080");
        edgeoptions.addExtensions(new File("src/test/java/com/yaswanth/ex03_SeleniumLearing/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store (1).zip"));







        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://google.com");
    }
}
