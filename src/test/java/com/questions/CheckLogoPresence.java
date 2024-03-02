package com.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckLogoPresence 
{
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		boolean logo = driver.findElement(By.xpath("//img[@title='Flipkart']")).isDisplayed();
		System.out.println(logo);
		
		if(logo = true)
		{
			System.out.println("Logo is available: ");
		}
		else
		{
			System.out.println("logo is not available: ");
		}
	}

}
