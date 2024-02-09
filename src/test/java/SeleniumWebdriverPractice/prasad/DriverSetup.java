package SeleniumWebdriverPractice.prasad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_path");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement uName = driver.findElement(By.xpath("//div//input[@name='username']"));
		
		uName.clear();
		uName.sendKeys("Admin");
		
		
		WebElement passwd = driver.findElement(By.xpath("//div//input[@name = 'password']"));
		
		passwd.clear();
		passwd.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
		
		login.click();
		
		
	}

}
