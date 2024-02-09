package com.actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOperations {
	public static WebDriver driver;
	public static String baseUrl = "https://www.myntra.com/";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement women = driver.findElement(By.xpath("//div[@data-reactid='179']"));
		WebElement fj = driver.findElement(By.xpath("//a[@data-reactid='180']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(women).build().perform();
		Thread.sleep(3000);
		
		act.moveToElement(fj).click().build().perform();
		
//		act.moveToElement(womensEthnic).build().perform();
//		Thread.sleep(5000);
//		act.moveToElement(womenSaree).build().perform();
		
	}

}
