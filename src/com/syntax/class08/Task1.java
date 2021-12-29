package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("button#startButton")).click();

        Thread.sleep(6000);

        String text=driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
        System.out.println(text);
}
    }