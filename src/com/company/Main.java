package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Best Phuthanarat\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("Phuthanarat");
        driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("Kongkietvanitch");
        driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("59070134@it.kmitl.ac.th");

        Select sel_month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        sel_month.selectByValue("4");

        Select sel_day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
        sel_day.selectByValue("8");

        Select sel_year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        sel_year.selectByVisibleText("1998");

        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();

        //driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();

        //driver.navigate().back();


        //*[@id="content"]/div/div/div/div/div[2]/div[1]/div[1]

    }
}
