package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	public WebDriver driver;
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	@Parameters("browser")
	public void browserSetup(String browser) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
//		String browser = "firefox";
//		String browser2 = "chrome";
//		String browser3 = "edge";
		
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else
		{
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	@Parameters("browser")
	public void login() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(baseUrl);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();
	}
}
