package com.syntax.class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class HW01 {
    /*
    Amazon link count:
    Open chrome browser
    Go to “https://www.amazon.com/”
    Get all links
    Get number of links that has text
    Print to console only the links that has text
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        List<WebElement> links=driver.findElements(By.tagName("a"));
        int counter=0;


        for (WebElement linksTex:links){
            String lnktxt=linksTex.getText();
            if (!lnktxt.isEmpty()){
                counter=counter+1;
                System.out.println(lnktxt);
                String atrb=linksTex.getAttribute("href");
                System.out.println(atrb);
                System.out.println("-------------------");

            }
        }
        System.out.println("There are "+counter+" links with text");

        Thread.sleep(2000);
        driver.quit();

    }
}
