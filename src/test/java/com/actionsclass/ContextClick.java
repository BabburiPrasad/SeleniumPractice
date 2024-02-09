package com.actionsclass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://practice.expandtesting.com/");
		
		
		
		Actions act = new Actions(driver);
		WebElement contextelement = driver.findElement(By.xpath("(//a[@href='/context-menu'])[1]"));
		
		
		act.moveToElement(contextelement).click().perform();
		
		WebElement cclick = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		
		act.moveToElement(cclick).contextClick().perform();
		
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		// Tried Explicit wait below
		
//		clickOn(driver, cclick, 10);
		
	}
	
//	public static void clickOn(WebDriver driver1, WebElement element, int timeout)
//	{
//		WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(timeout));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//	}

}
