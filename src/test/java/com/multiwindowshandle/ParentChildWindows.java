package com.multiwindowshandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindows {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		String baseURL = "https://demoqa.com/browser-windows";
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent WindowHandle id - " +parentwindow);
		
		WebElement newWindowButton = driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		// Using for loop to open same page in multiple windows
		
				for(int i =0 ; i<=2 ; i++)
				{
					newWindowButton.click();
					Thread.sleep(3000);
				}
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String Handle: allWindowHandles)
		{
			System.out.println("Window Handle - " +Handle);
		}
		
		

	}

}
