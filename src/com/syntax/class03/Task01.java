package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(@id,'btn_b')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//label[text()='Enter message']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("batch11");
        driver.findElement(By.xpath("//button [text()='Show Message']")).click();
        driver.quit();
    }
}