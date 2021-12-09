package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class advancexpath {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("Admin");
        driver.findElement(By.xpath("//div[@id='divPassword']/child::input")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//div[@id='divLoginButton']/child::input")).click();
    }
}