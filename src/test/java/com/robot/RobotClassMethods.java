package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/* Robot class is used to generate system native input events where the control of mouse
 * and keyboard is needed. 
 *
 * This Class provides control over the mouse and keyboard devices
 * Robot Class can handle the pop-ups during the execution
 * Can handle file upload operations
 * 
 * 
 * METHODS UNDER ROBOT CLASS
 * 
 * KeyPress(): robot.KeyPress(KeyEvent.VK_DOWN)
 * 	Used to press any key on the keyboard
 * 
 * KeyRelease(): robot.KeyRelease(KeyEvent.VK_DOWN)
 * 	Used to release the press key of the keyboard
 * 
 * MousePress(): robot.MousePress(InputEvent.BUTTON_DOWN_MASK)
 * 	User to press the left button of the mouse
 * MouseRelease(): robot.MouseRelease(InputEvent.BUTTON_DOWN_MASK)
 * 	Helps releasing the pressed button of the mouse
 * 
 * MouseMove(): robot.MouseMove(point.getX(), point.getY())
 * 	Used to move the mouse to the given X and Y coordinates
 * */

public class RobotClassMethods {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		String baseUrl = "https://www.edureka.co/";
		
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[@class='ga_courses_click']")).click();
		
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		System.out.println("a");
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		System.out.println("B");
		
		robot.mouseMove(30, 100);
		
		System.out.println("C");
		
		driver.quit();
	}

}
