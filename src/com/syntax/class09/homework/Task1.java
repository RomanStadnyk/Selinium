package com.syntax.class09.homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    public static void main(String[] args) {
        /*
        goto https://chercher.tech/practice/explicit-wait
        1.click on open an alert after 5 sec and then using explicit wait manage that alert
        2.click on display button after 10 sec and once the button is displayed  print the status of isDisplayed() (edited)
         */
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("button#alert")).click();

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alrt=driver.switchTo().alert();
        alrt.dismiss();

        driver.findElement(By.cssSelector("button#display-other-button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#hidden")));

        boolean status=driver.findElement(By.cssSelector("button#hidden")).isDisplayed();
        System.out.println(status);
    }
}
