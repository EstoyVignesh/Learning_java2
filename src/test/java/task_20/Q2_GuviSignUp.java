package task_20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_GuviSignUp {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Opening Chrome Driver
		driver = new ChromeDriver(); 
		
		//Navigate to Snapdeal website
		driver.get("https://www.guvi.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Vignesh");
		
		driver.findElement(By.id("lastName")).sendKeys("Palanisamy");
		
		driver.findElement(By.id("emailInput")).sendKeys("vigneshpalanisamy1969@gmail.com");
		
		driver.findElement(By.id("passwordInput")).sendKeys("@Arvind123");
		
		driver.findElement(By.id("mobileNumberInput")).sendKeys("7092909386");
		Thread.sleep(2000);
		
		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[text()='Proceed to Sign-in']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_email")).sendKeys("vigneshpalanisamy1969@gmail.com");
		
		driver.findElement(By.id("login_password")).sendKeys("@Arvind123");
		
		driver.findElement(By.id("login_button")).click();
		
		System.out.println(driver.getTitle());
		
		WebElement title = driver.findElement(By.id("title"));
		
		String text = driver.findElement(By.xpath("//p[text()='Please Consider Activating Your Guvi Account.']")).getText();
		
		System.out.println(title.getText());
		
		System.out.println(text);
		
	}

}
