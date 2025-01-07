package com.yaswanth.ex_07SeleniumLearning_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Webtables {



    @Description
    @Test
    public void Test_Webtables(){


        EdgeOptions edgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();


        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));


        List<WebElement> row_tables = driver.findElements(By.tagName("tr"));


        for(int i = 0; i<row_tables.size();i++){
            List<WebElement>col = row_tables.get(i).findElements(By.tagName("td"));
            for (WebElement c : col){
                System.out.println(c.getText());
            }
        }















    }
















}
