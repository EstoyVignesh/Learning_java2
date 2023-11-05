package task_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_Element_Email {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Opening Chrome Driver
		driver = new ChromeDriver(); 
		
		//Navigate to Guvi website
		driver.get("https://www.guvi.in/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//Locators for Email
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("vigneshguvi@gmail.com"); // Locating Element Using ID
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vigneshguvi@gmail.com"); // Locating Element Using XPath
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("vigneshguvi@gmail.com"); // Locating Element Using XPath with Position
		
		Thread.sleep(2000);
		
		// Using ClassName locator
        driver.findElement(By.className("form-control")).sendKeys("vigneshguvi@gmail.com");
		
		Thread.sleep(2000);
        
        // Using CSS Selector locator
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("vigneshguvi@gmail.com");
     
        

	}

}
