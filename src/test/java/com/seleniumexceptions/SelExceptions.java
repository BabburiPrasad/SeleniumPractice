package com.seleniumexceptions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelExceptions {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        try {
            driver.findElement(By.id("fake")).click();
        }catch (Exception e) {
            if (e instanceof NoSuchElementException) {
                System.out.println("Element is not found");
            } else {
                System.out.println("Element is not found: " + e.getMessage());
                
                throw(e); // throwing exception
            }
        }

        System.out.println("Exception handled");
    }
}
