package task_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_Element_SignUp {
static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Opening Chrome Driver
		driver = new ChromeDriver(); 
		
		//Navigate to Guvi website
		driver.get("https://www.guvi.in/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//Locators for SignUp Button
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("signup-btn")).click(); // Locating Element Using ID
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@class='btn signup-btn']")).click(); // Locating Element Using XPath
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click(); //// Locating Element Using XPath with Link Text
		        
      
          
     
        

	}

}
