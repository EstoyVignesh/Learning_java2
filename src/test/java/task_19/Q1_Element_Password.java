package task_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_Element_Password {
static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Opening Chrome Driver
		driver = new ChromeDriver(); 
		
		//Navigate to Guvi website
		driver.get("https://www.guvi.in/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//Locators for Password
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("@Guvi112"); // Locating Element Using ID
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='form-control password-err']")).sendKeys("@Guvi112"); // Locating Element Using XPath
		Thread.sleep(2000);
				        
        // Using CSS Selector locator
         driver.findElement(By.cssSelector("input[type='password']")).sendKeys("@Guvi112");
     
        

	}


}
