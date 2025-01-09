package com.yaswanth.ex_08SeleniumLearning_SvgElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class svgElements04 {


    @Test
    public void india_Map(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");


        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']/*[local-name()='g'][7]/*[local-name()='g']/*[local-name()='g']/*[local-name()='path']"));


        for(WebElement state: states){
            //System.out.println(state.getAttribute("aria-label"));

//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[contains(text(),'Tripura')]"),
//                    "Tripura"));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            if(state.getAttribute("aria-label").contains("Tripura")){
                state.click();
            }





        }

















    }








}
