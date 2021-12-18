package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://ebay.com/");
        driver.manage().window().maximize();

        //get all the links that are on eBay.com

        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //print all text in links

        for (WebElement link:links) {
            // get the text out of the webElement link
            String linkText = link.getText();
            if (!linkText.isEmpty()) {
                System.out.println(linkText);
                String atrb=link.getAttribute("href");
                System.out.println(atrb);
                System.out.println("-------------------");

            }
        }
        }




    }

