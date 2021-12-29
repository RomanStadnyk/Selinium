package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//
public class explicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().window().maximize();

        //locate the enable after 10 sec and click on it
         WebElement eneblbutn=driver.findElement(By.cssSelector("button#enable-button"));
         eneblbutn.click();

         // print the state of the button after it is enabled

        WebDriverWait wait=new WebDriverWait(driver, 20);
        //condition
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));

        WebElement btn=driver.findElement(By.cssSelector("button#disable"));
        boolean status=btn.isEnabled();
        System.out.println(status);

    }
}
