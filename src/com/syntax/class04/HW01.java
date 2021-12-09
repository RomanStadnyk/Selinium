package com.syntax.class04;

/*
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.


 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        String msg=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
        if(msg.equals("Password cannot be empty")){
            System.out.println("The mission is complete");
        } else{
            System.out.println("The mission is incomplete");
        }
        driver.quit();



















    }
}
