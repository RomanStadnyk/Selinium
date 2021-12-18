package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class chekBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement singleCheckBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        singleCheckBox.click();
        Thread.sleep(2000);
        singleCheckBox.click();


        //Select all 4 text-boxes

        List<WebElement> chekBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        System.out.println(chekBoxes.size());

        for (WebElement box : chekBoxes) {
            box.click();
        }

        for (WebElement box : chekBoxes) {
            String atr=box.getAttribute("value");
            System.out.println(atr);
            if (!atr.equalsIgnoreCase("Option-3")) {
               box.click();
            }
        }
    }
}