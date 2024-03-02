package com.multiwindowshandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		String baseURL = "https://www.edureka.co/community/q1`";
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get(baseURL);
		
		String ParentPage = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//input[@class='qa-search-field form-control'])[1]")).sendKeys(Keys.SHIFT, Keys.ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		Iterator <String> itr = allWindows.iterator();
		
		while(itr.hasNext())
		{
			js.executeScript("window.scrollBy(0,400)");
			String child = itr.next();
			if(!ParentPage.equals(child))
			{
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
			}
			
		}
		driver.switchTo().window(ParentPage);

	}

}
