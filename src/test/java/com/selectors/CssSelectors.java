package com.selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors {
	public static WebDriver driver;
	public static WebElement text;

	public static void main(String[] args) {
		// Css selector syntax tag_name[attribute='value'] | tag_name[#id] | tag_name[.class] | 
		// Multiple Css Selector "tag_name[attribute='value'] [attribute='value']"
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		//Css Selector by Id
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("OnePlus6T");
		
		
		//Css Selector with tag Id
		driver.findElement(By.cssSelector("input[id='gh-btn']")).click();
		
		//Scrolling through the webpage using JavascriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // linking driver to JSE interface
		
		js.executeScript("window.scrollBy(0,300)");
		
		// locating element using cssSelector partial text
		// Element <div class="s-item__detail s-item__detail--primary"><span class="s-item__price">
		
		//String text = driver.findElement(By.cssSelector("span[class*='item__price']")).getText();
		String text = driver.findElement(By.cssSelector("span[class*='item__price']")).getText();
		
		System.out.println(text);
		
		
		
		
		

	}

}
