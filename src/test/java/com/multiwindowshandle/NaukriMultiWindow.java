package com.multiwindowshandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NaukriMultiWindow 
{
	public static WebDriver driver;
	
	@Test
	public void testMultiWindow()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			String childWindow = itr.next();
			
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		
	}

}
