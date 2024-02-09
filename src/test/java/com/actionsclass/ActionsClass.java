package com.actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	public static WebDriver driver;
	public static String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement uName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(uName).click().sendKeys("Admin").perform();
		
		act.moveToElement(password).click().sendKeys("admin123").build().perform();
		
		act.moveToElement(login).click().perform();
		
		

	}

}
