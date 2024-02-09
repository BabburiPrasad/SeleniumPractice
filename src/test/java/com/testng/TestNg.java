package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	
	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void login() throws InterruptedException
	{
		String baseurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(baseurl);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

}
