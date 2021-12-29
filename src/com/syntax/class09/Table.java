package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Table {
    public static String url = "https://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //print all the rows of the webtable in the console

        // locate the rows using xpath and save it to the variable

        List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println("The number of rows are "+tableRows.size());

        //get text from the rows and print it out
        for(WebElement row: tableRows){
            String text=row.getText();
            System.out.println(text);
        }

        //print all the headers
        List<WebElement> tableHead=driver.findElements(By.xpath("//*[@id='task-table']/thead/tr/th"));
        for(WebElement head: tableHead){
            String headText=head.getText();
            System.out.println(headText);
        }

        //print out second column
        List<WebElement> col2=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));

        for(WebElement col: col2){
            System.out.println(col.getText());
        }

    }
}