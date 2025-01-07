package com.yaswanth.ex_08SeleniumLearning_SvgElements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class svgElements {



    @Description
    @Test
    public void test_svgState() throws Exception{
    WebDriver driver  =  new EdgeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        Thread.sleep(1000);
        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement state : states){
            Thread.sleep(1000);
            if(state.getAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }









    }






}
