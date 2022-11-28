package com.exam.portal.RegisterByPassTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class ValidRegistration {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:9000/organiser/register");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement fullName = driver.findElement(By.id("name"));
        fullName.sendKeys("Prakhar Lad");

        Thread.sleep(2500);

        WebElement email_field = driver.findElement(By.id("email"));
        email_field.sendKeys("prakharlad123@gmail.com");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Prakharlad@123");

        Thread.sleep(2500);

        WebElement agreeTerms = driver.findElement(By.id("agreeTerms"));
        agreeTerms.click(); //Click on the Agree Terms button

        Thread.sleep(2500);

        WebElement register_button = driver.findElement(By.id("register"));
        register_button.click(); //Clicking on the 'Register' button

        Thread.sleep(10000);
        driver.close();
    }
}
