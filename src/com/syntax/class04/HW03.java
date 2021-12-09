package com.syntax.class04;

/*
goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form (edited)
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name *='first_na']")).sendKeys("Jack");
        driver.findElement(By.cssSelector("input[name *='last_na']")).sendKeys("Sparrow");
        driver.findElement(By.cssSelector("input[name *='email']")).sendKeys("SparrowPirate@yahoo.com");
        driver.findElement(By.cssSelector("input[name *='phone']")).sendKeys("3474521896");
        driver.findElement(By.cssSelector("input[name *='address']")).sendKeys("417 East str apt #5j");
        driver.findElement(By.cssSelector("input[name *='city']")).sendKeys("Brooklyn");
        driver.findElement(By.xpath("//select[@name ='state']/child::option[34]")).click();
        driver.findElement(By.cssSelector("input[name *='zip']")).sendKeys("11210");
        driver.findElement(By.cssSelector("input[name *='website']")).sendKeys("facebook.com");
        driver.findElement(By.xpath("//input[@name='hosting'][@value='no']")).click();
        driver.findElement(By.cssSelector("textarea[name *='comment']")).sendKeys("This is my home work");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-default']")).click();
        driver.quit();
    }
}
