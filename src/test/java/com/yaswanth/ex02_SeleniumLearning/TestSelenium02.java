package com.yaswanth.ex02_SeleniumLearning;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Description
    @Test
    public void test_selenium(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://edge.com");




    }


}
