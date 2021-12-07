package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        Thread.sleep(5000);
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(url);
        System.out.println(title);
        driver.quit();

    }
}
