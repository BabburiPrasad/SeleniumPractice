package com.SeleniumQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateDropdownelement 
{
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://test.cascadetraining.com/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.xpath("//a[text()='Training Locations']"));
		dropdown.click();
			
		String ddown  = "//div[@id='training-dropdown']//a[@class='dropdown-item']";
		List<WebElement> elements = driver.findElements(By.xpath(ddown));
		
		for(WebElement evalues : elements)
		{		
			
			String text = evalues.getText();
			
			System.out.println(text);
		}

	}

}
