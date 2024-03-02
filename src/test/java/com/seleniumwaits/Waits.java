package com.seleniumwaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	public static WebDriver driver;
	public static WebElement fname;
	public static WebElement lname;
	public static WebElement forgotlink;

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		// Implicit Wait
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		// Fluent Waits
//		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(30))
//				.pollingEvery(Duration.ofSeconds(1))
//				.ignoring(NoSuchElementException.class);
		
		fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		sendKeys(driver, fname, 10, "Test");
		sendKeys(driver, lname, 15, "User");
		
		driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
		
		
		forgotlink = driver.findElement(By.linkText("Forgotten password?"));
		
		clickOn(driver, forgotlink, 10);
		
	}
	// Explicit Wait
	 public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value) {
	        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(timeout));
	        wait.until(ExpectedConditions.visibilityOf(element));
	        element.sendKeys(value);
	    }
	 
	 public static void clickOn(WebDriver driver1, WebElement element, int timeout)
	 {
		 WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(timeout));
		 wait.until(ExpectedConditions.elementToBeClickable(element));
		 element.click();
	 }
	
//	public static void sendKeys(WebDriver driver1, WebElement element, Duration timeout, String value)
//	{
//		WebDriverWait wiat = new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
//		element.sendKeys(value);	
//	}

	 
//	 WebElement forgotlink1 = new WebDriverWait(driver,Duration.ofSeconds(10))
//             .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Forgotten password?")));
//	 
	 
	 
	 
}
