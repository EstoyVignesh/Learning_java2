package task_18;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		 source1.sendKeys("Vignesh");
		 
		 act.moveToElement(source1).build().perform();
		 
		driver.findElement(By.name("lastname")).sendKeys("Palanisamy");
		
		driver.findElement(By.name("reg_email__")).sendKeys("vigneshpalanisamy1969@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vigneshpalanisamy1969@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("@Yonko4");
		
		Select sel = new Select(driver.findElement(By.name("birthday_day")));
		
		sel.selectByIndex(5);
		Thread.sleep(2000);
		
Select sel1 = new Select(driver.findElement(By.name("birthday_month")));
		
		sel1.selectByIndex(9);
		Thread.sleep(2000);
		
Select sel2 = new Select(driver.findElement(By.name("birthday_year")));
		
		sel2.selectByIndex(25);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
/*		driver.findElement(By.name("code")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Send Email Again']"));
		Thread.sleep(2000);
		
		driver.findElement(By.name("confirm")).click();
		
		*/ 
		
		Thread.sleep(10000);

		/*System.setProperty("webdriver.chrome.driver","path/to/driver/exe");
		
	    ChromeOptions options = new ChromeOptions();
	
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);      */
		

		
		//Thread.sleep(2000);
		/*Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.accept();*/
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		//Finding xpath and applying
		driver.findElement(By.xpath("(//span[@class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j'])[5]")).click();
		
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//span[text()='Log out']")).getText();
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
