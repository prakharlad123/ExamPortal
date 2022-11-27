package com.exam.portal.LoginByPassTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class InvalidLogin {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:9000/organiser/login");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement email_field = driver.findElement(By.name("email"));
        js.executeScript("document.getElementsByName('email')[0].setAttribute('pattern', '(.*?)')");
        js.executeScript("document.getElementsByName('email')[0].setAttribute('type', 'text')");
        email_field.sendKeys("prakharlad");

        Thread.sleep(2500);

        WebElement password = driver.findElement(By.name("password"));
        js.executeScript("document.getElementsByName('password')[0].setAttribute('pattern', '(.*?)')");
        password.sendKeys("prakharlad");


        WebElement login_button = driver.findElement(By.id("login"));
        login_button.click(); //Clicking on the 'Login' button

//        driver.close();
    }
}
