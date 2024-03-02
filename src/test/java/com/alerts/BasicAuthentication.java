package com.alerts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {

	public static WebDriver driver;
	public static String baseURL ="https://the-internet.herokuapp.com/";
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(baseURL);
		
//      To Handle BASIC AUTHENTICARION POPUP		
		//driver.get("http://admin:admin@the-internet.herokuapp.com//basic_auth"); // To Handle BASIC AUTHENTICARION POPUP
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
		
		Robot robot = new Robot();
		
		robot.mouseMove(800, 259);
		
		Thread.sleep(3000);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
	
//		
//		Thread.sleep(3000);
//		
//		robot.mouseMove(750, 215);

	}

}
