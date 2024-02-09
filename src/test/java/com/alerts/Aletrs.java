package com.alerts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aletrs {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Handeling Simple Alert
		
		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		// Swithcing control from driver to alert
		Alert alert = driver.switchTo().alert();
		// Getting alert text
		String alertMessage = driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		
		Thread.sleep(3000);
		// clicking on Ok(accepting the alert)
		alert.accept();
		
		
		Thread.sleep(3000);
		
		
		// Handeling the confirm alert
		
		
		driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
		
		Robot robot = new Robot();
		
		robot.mouseMove(850, 158); // to move mouse in this direction
		Thread.sleep(2000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // to click on the spot
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // to release the the mouse
		

	}

}
