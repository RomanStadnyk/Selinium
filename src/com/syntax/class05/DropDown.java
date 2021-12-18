package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//option[@value='Sunday']")).click();
        WebElement days=driver.findElement(By.cssSelector("select#select-demo"));

        Select select=new Select(days);

        select.selectByIndex(1); // select by index
        
        Thread.sleep(2000);

        select.selectByIndex(2);
    }
}
