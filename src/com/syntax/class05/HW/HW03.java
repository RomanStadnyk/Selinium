package com.syntax.class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW03 {
    /*
    Go to facebook
    click on create new account  page
    Fill out the whole form
    Click signup
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("James");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("smithjames123@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("smithjames123@yahoo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("QwerOoty126783$$");
        driver.findElement(By.name("birthday_month")).sendKeys("Sep");
        driver.findElement(By.name("birthday_day")).sendKeys("27");
        driver.findElement(By.name("birthday_year")).sendKeys("1983");
        driver.findElement(By.xpath("//label[@class='_58mt'][text()='Male']")).click();
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
