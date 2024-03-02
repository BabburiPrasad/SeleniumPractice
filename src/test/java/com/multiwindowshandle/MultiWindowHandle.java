package com.multiwindowshandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* MULTI WINDOW HANDLE
 * 
 * 1. get.WindowHandle(): gets the details of current widow of current window and return String
 * 2. get.WindowHandles(): gets the details of all the windows and returns Alpah-Numaric String
 * 3. Set <String> Command = driver.get.WindowHandles()
 * 
 * 4. SwitchTo(): helps switching between the windows
 * 5. Action(): command used to perform actions on the current window
 * 
 * */

public class MultiWindowHandle {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		String baseURL ="https://demoqa.com/browser-windows";
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	WebElement newtabEutton = driver.findElement(By.xpath("//button[@id='tabButton']"));
		
		WebElement newWindowButton = driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		// Using for loop to open same page in multiple windows
		
		for(int i =0 ; i<=2 ; i++)
		{
			newWindowButton.click();
			Thread.sleep(3000);
		}
		
		

	}

}
