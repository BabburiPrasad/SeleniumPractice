package com.actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String baseURL = "https://practice.expandtesting.com/";
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//a[@href='/drag-and-drop']")).click();
		
		WebElement d_scource_element = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement target_element = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		//WebElement r_text = driver.findElement(By.xpath("//h4[text() = 'Automation Testing Practice Website']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(d_scource_element, target_element).perform();
		
		
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		
		
		
		
		

	}

}
