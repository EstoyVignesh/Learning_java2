package task_17;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
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
		
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		
		driver.switchTo().frame("loginIframe");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userName")).sendKeys("vigneshsnapdeal@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='continue']")).click();
		Thread.sleep(1000);
		
		/*driver.findElement(By.name("j_number")).sendKeys("7092909386");
		
		driver.findElement(By.id("j_name")).sendKeys("Vignesh");
		Thread.sleep(1000);
		
		driver.findElement(By.id("j_password")).sendKeys("@Arvick123");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("userSignup")).click();   */
		
		
		
		//driver.switchTo().frame("loginIframe");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame("loginIframe");
		
		driver.findElement(By.xpath("//input[@class='otpValueCode']"));
		Thread.sleep(7000);
		
		driver.findElement(By.id("loginUsingOtp")).click();
		Thread.sleep(2000);
		
		//Finding xpath and applying
				WebElement source3 = driver.findElement(By.xpath("//div[@class='accountInner']"));
				//moving the Cursor to "Sign In" Element
				act.moveToElement(source3).build().perform();
				//To Hold the Mouse at the "Sign Inner" Element for 3 Seconds
				Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//a[text()='Logout']")).getText();
		String text1 =text;
		System.out.println(text);
		
		if(text==text1)
		{
			System.out.println("The Login is Success");
		}
		else
			System.out.println("The Login is UnSuccessful");
		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			

	
	
		
	}

}
