package task_21;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_OpenNewWindow {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String eachWindow :allWindows)
		{
			Thread.sleep(2000);
			driver.switchTo().window(eachWindow);
		}
		

		String childWindow = driver.findElement(By.xpath("//div[@class='example']")).getText();
		System.out.println(childWindow);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		
		String parentWindowText = driver.findElement(By.id("content")).getText();
		System.out.println(parentWindowText);

	}

}
