package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotations {
	
	public WebDriver driver;
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void login() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
