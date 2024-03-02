package com.frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames 
{
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		WebElement nframes = driver.findElement(By.name("frame-top"));
		
		driver.switchTo().frame(nframes);
		
		List<WebElement> nestedframes = driver.findElements(By.tagName("frame"));

		for(WebElement nesframes : nestedframes )
		{
			System.out.println(nesframes);
			System.out.println(nesframes.getSize());
			
			System.out.println(nesframes.getText());
			
		}
		System.out.println(); // new line
		System.out.println(); // new line
		
// switching to middle frame with index 1 | Left - Middle - Right | --> top-frame is parent frame for this tested frames
		System.out.println("Swithced from Parent-frame to Middle Frame: ");
		driver.switchTo().frame(1);
		WebElement middleframename = driver.findElement(By.tagName("body"));
		System.out.println("Middle frame Name: "+middleframename.getText());

		System.out.println(); // new line
		
		
		// Switching back to parent frame i.e, top-frame
		driver.switchTo().parentFrame();
		System.out.println("Swithced back to Parent Frame i.e, frame-top: ");
		System.out.println(); // new line
		
		
		//Switching from parent frame to left frame with 0 index
		System.out.println("Swithced from Parent-frame to Left Frame: ");
		driver.switchTo().frame(0);
		WebElement leftframename = driver.findElement(By.tagName("body"));
		System.out.println("Left frame Name: "+leftframename.getText());
		System.out.println(); // new line
		
		
		// Switching back to parent frame i.e, top-frame
		driver.switchTo().parentFrame();
		System.out.println("Swithced back to Parent Frame i.e, frame-top: ");
		System.out.println(); // new line
				
				
		// Switching from Parent frame to Right frame with index 2
		driver.switchTo().frame("frame-right");
		System.out.println("Swithced Parent Frame to Right Frame: ");
		WebElement rigtframename = driver.findElement(By.tagName("body"));
		System.out.println("Right frame Name: "+ rigtframename.getText());
		
		System.out.println(); // new line
	}

}
