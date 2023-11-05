package task_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_Element_Name {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Opening Chrome Driver
		driver = new ChromeDriver(); 
		
		//Navigate to Guvi website
		driver.get("https://www.guvi.in/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//Locators for Name
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("Vignesh vky"); // Locating Element Using ID
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Vignesh vky"); // Locating Element Using XPath
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Vignesh vky"); // Locating Element Using XPath with Position
		
		Thread.sleep(2000);
		
		// Using ClassName locator
         driver.findElement(By.className("form-control")).sendKeys("Vignesh vky");
		
		Thread.sleep(2000);
        
        // Using TagName locator
        driver.findElement(By.tagName("input")).sendKeys("Vignesh vky");
     
        

        
		
	}

}
