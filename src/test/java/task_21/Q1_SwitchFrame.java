package task_21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1_SwitchFrame {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Method 1
		//driver.switchTo().frame("mce_0_ifr");
		
		// Method 2
		WebElement text = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
		driver.switchTo().frame(text);
		
		driver.findElement(By.id("tinymce")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("tinymce")).sendKeys("Hello People");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
