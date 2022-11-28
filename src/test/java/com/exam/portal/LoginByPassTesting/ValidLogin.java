package com.exam.portal.LoginByPassTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class ValidLogin {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:9000/organiser/login");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement fullName = driver.findElement(By.id("email"));
        fullName.sendKeys("prakharlad123@gmail.com");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Prakharlad@123");

        Thread.sleep(2500);

        WebElement login_button = driver.findElement(By.id("login"));
        login_button.click(); //Clicking on the 'Login' button

        Thread.sleep(10000);
        driver.close();
    }
}
