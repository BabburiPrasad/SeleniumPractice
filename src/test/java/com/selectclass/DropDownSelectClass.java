package com.selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelectClass 
{
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practice.expandtesting.com/dropdown");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel = new Select(dropdown);
		sel.selectByIndex(2);
		
		Thread.sleep(3000);
		
		sel.selectByValue("BW");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("India");
		Thread.sleep(3000);

		driver.close();
	}

}
