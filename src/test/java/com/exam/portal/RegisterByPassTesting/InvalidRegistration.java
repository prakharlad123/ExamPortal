package com.exam.portal.RegisterByPassTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class InvalidRegistration {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:9000/organiser/register");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement fullName = driver.findElement(By.name("name"));
        js.executeScript("document.getElementsByName('name')[0].required=false");
//        fullName.sendKeys("Prakhar Lad");

//        Thread.sleep(2500);

        WebElement email_field = driver.findElement(By.name("email"));
        js.executeScript("document.getElementsByName('email')[0].setAttribute('pattern', '(.*?)')");
        js.executeScript("document.getElementsByName('email')[0].setAttribute('type', 'text')");
        email_field.sendKeys("prakharlad123");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.name("password"));
        js.executeScript("document.getElementsByName('password')[0].setAttribute('pattern', '(.*?)')");
        password.sendKeys("prakharlad");

//        Thread.sleep(2500);

        WebElement agreeTerms = driver.findElement(By.id("agreeTerms"));
        js.executeScript("document.getElementById('agreeTerms').required=false");
//        agreeTerms.click(); //Click on the Agree Terms button

        Thread.sleep(2500);

        WebElement register_button = driver.findElement(By.id("register"));
        register_button.click(); //Clicking on the 'Register' button

        Thread.sleep(10000);
        driver.close();
    }
}
