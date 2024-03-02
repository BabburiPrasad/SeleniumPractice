package com.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames 
{
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		
		for(WebElement noofframes : frames)
		{
			System.out.println(noofframes);
		}
		
		driver.switchTo().frame("frame-bottom");
		
		WebElement framename = driver.findElement(By.tagName("body"));
		System.out.println(framename.getText());
		
		driver.switchTo().defaultContent(); // Switch back to main/default page
	}

}
