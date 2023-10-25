package task_17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal_Login {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Opening Chrome Driver
		driver = new ChromeDriver(); 
		
		//Navigate to Snapdeal website
		driver.get("http://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		
		//Finding xpath and applying
		WebElement source = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//moving the Cursor to "Sign In" Element
		act.moveToElement(source).build().perform();
		//To Hold the Mouse at the "Sign In" Element for 3 Seconds
		Thread.sleep(3000);
		
	}

}
