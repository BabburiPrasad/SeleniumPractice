package com.multiwindowshandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		String baseURL = "https://demoqa.com/browser-windows";

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseURL);
		String ParentPage = driver.getWindowHandle();
		
		System.out.println("Parent window handle - " +ParentPage);
		 
		 WebElement clickElement = driver.findElement(By.xpath("//button[@id='windowButton']"));
		 
		 for(int i = 0 ; i<=2 ; i++)
		 {
			 clickElement.click();
			 Thread.sleep(2000);
		 }
		
		 Set<String> allwindowHandles = driver.getWindowHandles();
		 
		 String lastwindowhandle = "";
		 
		 for(String handle : allwindowHandles)
		 {
			 System.out.println("Switching to window - " +handle);
			 System.out.println("Navigating to google.com");
			 driver.switchTo().window(handle); // Switch to desired window first and 
			 driver.get("https://www.google.com/");
			 lastwindowhandle = handle;
		 }
		 
		 // Switch to parent window and close the parent window
		 driver.switchTo().window(ParentPage);
		 driver.close();
		 
		 // Switch to last window and open demoqa.com
		 driver.switchTo().window(lastwindowhandle);
		 driver.get("https://demoqa.com/");
	}

}
