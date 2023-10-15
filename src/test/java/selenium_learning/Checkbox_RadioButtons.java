package selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_RadioButtons {

	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='vfb-7-3']")).click();
		
		driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='checkbox2']")).click();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='checkbox1']"));
		checkbox.click();
		Thread.sleep(2000);
		
		if(checkbox.isSelected())
		{
			System.out.println("The First Checkbox is selected");
			
		}else
			System.out.println("First Checkbox is not Selected");
			
			driver.close();
		
	}

}
