package task_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1_PhpTravels_Sum {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Opening Chrome Driver
		driver = new ChromeDriver(); 
		
		//Navigate to Snapdeal website
		driver.get("https://phptravels.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//WebElement name1 = driver.findElement(By.name("first_name"));
		//name1.sendKeys("Vignesh");
		Thread.sleep(2000);
				
		driver.findElement(By.name("first_name")).sendKeys("Vignesh");
		
		driver.findElement(By.name("last_name")).sendKeys("Palanisamy");
		
		driver.findElement(By.name("business_name")).sendKeys("VigneshPhp");
		
		driver.findElement(By.xpath("//input[@class='email form-control']")).sendKeys("Vigneshphptravels@gmail.com");	
		
		
		String num1 = driver.findElement(By.id("numb1")).getText();
		
		String num2 = driver.findElement(By.id("numb2")).getText();
		
		int no1 =Integer.parseInt(num1);
		
		int no2 =Integer.parseInt(num2);
		
		int result1 = no1+no2;
		
		String result =Integer.toString(result1);
		
		driver.findElement(By.id("number")).sendKeys(result);
		Thread.sleep(2000);
		
		driver.findElement(By.id("demo")).click();
		
		String notification = driver.findElement(By.xpath("//strong[text()=' Thank you!']")).getText();
		String msg =notification;
		System.out.println(msg);
		
		String notification1 = driver.findElement(By.id("colored")).getText();
		String msg1 =notification1;
		System.out.println(msg1);
		
		System.out.println("The Process Of Registration is Successful, "+msg1);
		
		
	}

}
