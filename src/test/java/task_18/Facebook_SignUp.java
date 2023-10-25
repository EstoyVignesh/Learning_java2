package task_18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook_SignUp {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Opening Chrome Driver
		driver = new ChromeDriver(); 
		
		//Navigate to Facebook website
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
Actions act = new Actions(driver);
		
		//Finding xpath and applying
		WebElement source = driver.findElement(By.xpath("//a[text()='Create new account']"));
		//moving the Cursor to "Create New Account" Element
		act.moveToElement(source).build().perform();
		//To Hold the Mouse at the "Create New Account" Element for 3 Seconds
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		 WebElement source1 = driver.findElement(By.name("firstname"));  //.sendKeys("Luffy");
		 source1.sendKeys("Luffy");
		 
		 act.moveToElement(source1).build().perform();
		 
		driver.findElement(By.name("lastname")).sendKeys("kaizoku");
		
		driver.findElement(By.name("reg_email__")).sendKeys("Haralddas@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Haralddas@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("@Yonko4");
		
		Select sel = new Select(driver.findElement(By.name("birthday_day")));
		
		sel.selectByIndex(15);
		Thread.sleep(2000);
		
Select sel1 = new Select(driver.findElement(By.name("birthday_month")));
		
		sel1.selectByIndex(8);
		Thread.sleep(2000);
		
Select sel2 = new Select(driver.findElement(By.name("birthday_year")));
		
		sel2.selectByIndex(25);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
	}

}
