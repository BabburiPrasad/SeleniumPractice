package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntryAdd {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		String baseURL = "https://the-internet.herokuapp.com/";
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(baseURL);
		
		
		WebElement entryadd = driver.findElement(By.xpath("//a[@href='/entry_ad']"));
		
		entryadd.click();
//             org.openqa.selenium.ElementNotInteractableException
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Close']"))).click();
		
		
		Robot robot = new Robot();
		
		robot.mouseMove(690, 605);
		Thread.sleep(3000);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		System.out.println("Popup Closed");
		
		driver.close();
		
		System.out.println("Browser closed: ");

	}

}
