package task_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_Element_Number {
static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Opening Chrome Driver
		driver = new ChromeDriver(); 
		
		//Navigate to Guvi website
		driver.get("https://www.guvi.in/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//Locators for Number
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("0213564654"); // Locating Element Using ID
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@class='form-control countrycode-left']")).sendKeys("0213564654"); // Locating Element Using XPath
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@style='padding-left: 85px;']")).sendKeys("0213564654"); // Locating Element Using XPath with Unique "Style" Attribute
		       
		Thread.sleep(2000);
        // Using ClassName locator
         driver.findElement(By.className("form-control countrycode-left")).sendKeys("0213564654");
     
        

	}

}
