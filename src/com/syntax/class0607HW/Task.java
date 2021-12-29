package com.syntax.class0607HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" http://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[text()='Click me!'][@class='btn btn-default btn-lg']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][text()='Click for Prompt Box']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Roman");
        driver.switchTo().alert().accept();

        driver.quit();
    }
}
