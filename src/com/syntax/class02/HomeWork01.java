package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Roman");
        driver.findElement(By.id("customer.lastName")).sendKeys("Stadnyk");
        driver.findElement(By.id("customer.address.street")).sendKeys("7602 Bay Ridge Parkway apt #5L");
        driver.findElement(By.id("customer.address.city")).sendKeys("Brooklyn");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11208");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("34740125689");
        driver.findElement(By.name("customer.ssn")).sendKeys("125689475");
        driver.findElement(By.id("customer.username")).sendKeys("notefinger");
        driver.findElement(By.id("customer.password")).sendKeys("zxcbnb098");
        driver.findElement(By.id("repeatedPassword")).sendKeys("zxcbnb098");
        driver.findElement(By.className("button")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}