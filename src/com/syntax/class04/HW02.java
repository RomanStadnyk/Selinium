package com.syntax.class04;

/*
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
enter wrong password
Click on login button
Verify error message with text “Invalid Credentials” is displayed.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[contains(@id, 'User')]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("//div[contains(@id, 'Pass')]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("//div[@id='divLoginButton']/child::input")).click();
        String message=driver.findElement(By.xpath("//div[contains(@id, 'inB')]/child::span")).getText();
        if(message.equals("Invalid credentials")){
            System.out.println("The message with text “Invalid Credentials” is displayed.");
        } else{
            System.out.println("The message with text “Invalid Credentials” is NOT displayed.");
        }
        driver.quit();
    }
}
