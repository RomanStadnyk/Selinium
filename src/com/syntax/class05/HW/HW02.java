package com.syntax.class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    /*
    HRMS Application Negative Login:
    Open chrome browser
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    Enter valid username
    Leave password field empty
    Click on login button
    Verify error message with text “Password cannot be empty” is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        WebElement msg=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String text=msg.getText();
        if (text.equalsIgnoreCase("Password cannot be empty")){
            System.out.println("Message is displayed!");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
