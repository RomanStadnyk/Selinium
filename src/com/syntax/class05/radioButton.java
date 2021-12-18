package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
       WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));


       boolean display=femaleRadioBtn.isDisplayed();
        System.out.println("The radio button is displayed on the page: "+display);

       boolean enabled=femaleRadioBtn.isEnabled();
        System.out.println("The radio button is enabled on the page: "+enabled);

        boolean selected=femaleRadioBtn.isSelected();
        System.out.println("The radio button is selected on the page: "+selected);

        if(enabled){
            femaleRadioBtn.click();
        }

        System.out.println("The radio button is selected on the page: "+selected);

    }
    }

