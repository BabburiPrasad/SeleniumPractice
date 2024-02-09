package com.selectors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		// CSSSELECTOR with ID possible in 3 ways:
		
		
		// Syntax: #IDValue or | <tagname>#<IDvalue> | <tagname>[<ID = 'ID Value'] |
		
//		WebElement CssIdSelector = driver.findElement(By.cssSelector(null));
		
//		CssIdSelector.click();
		
		
		
		// CSSSELECTOR with Class name is possible in 3 ways
		
		// <tagname>.<Class Value> | .Class Value | <tagname>[Class = 'Class Value']
		// tag Name = input, and Class Value = oxd-input oxd-input--active oxd-input--error
		
//		WebElement CssClassSelector = driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active.oxd-input--error"));
		
//		driver.findElement(By.cssSelector(".oxd-input oxd-input--active.oxd-input--error"));
//		driver.findElement(By.cssSelector("input[Class = 'oxd-input.oxd-input--active.oxd-input--error']"));
		
//		CssClassSelector.sendKeys("Admin");
		
		// Attribute Syntax: <tagname>[href=’<href value>’]
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		
		
		
		// CSSSELECTOR Combining Attributes
		
		// Class and Attribute Syntax: <tagname>#<class value>[attribute=’<attribute value>’]
		// Class and Attribute example Syntax: <tagname>.<class value>[attribute=’<attribute value>’]
		
		driver.findElement(By.cssSelector("input.oxd-input.oxd-input--active[name='password']")).sendKeys("admin123");
		
		
		
		// CSSSELECTOR with SubString
		
		
		// Matching a prefix (Starts with: ^): <tagname>[<attribute>^=’prefix of the string’]
		// button[class^='oxd-button']
		// Class Value = oxd-button oxd-button--medium oxd-button--main orangehrm-login-button
		
		
		// Matching a suffix (Ends with: $) | Syntax: <attribute>^=’prefix of the string’]
		// Class Value = oxd-button oxd-button--medium oxd-button--main orangehrm-login-button
		driver.findElement(By.cssSelector("button[class$='login-button']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		

//		driver.findElement(By.cssSelector("button[class='oxd-dialog-close-button.oxd-dialog-close-button-position']")).click();
		
		// Matching a substring (contains: *): <tagname>[<attribute>*=’substring’]
		
		driver.findElement(By.cssSelector("img[class*='oxd']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a[href$='logout']")).click();
		
		
		

	}

}
