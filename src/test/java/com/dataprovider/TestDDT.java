package com.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDDT 
{
	public static WebDriver driver;
	String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@SuppressWarnings("deprecation")
	@Test(dataProvider = "testdata")
	public void login(String username, String password)
	{
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(baseURL);
		
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.clear();
		uname.sendKeys(username);
		
		WebElement passwd = driver.findElement(By.xpath("//input[@name='password']"));
		passwd.clear();
		passwd.sendKeys(password);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] testDataFeed()
	{
		Object [][] testdata = new Object[2][2];
		
		testdata [0][0] = "Admin";
		testdata [0][1] = "admin123";
		
		testdata [1][0] = "admin";
		testdata [1][1] = "admin123";
		
		return testdata;
	}

}
