package task_18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2_Droppable {

static WebDriver driver = null;
	
	public static void main(String args[])
	{
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("iframe");
		
		//There is no ID or Name in the Iframe so, I created a WebElement and subnstituted in the "Switch to frame()"
		
        WebElement webFrame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(webFrame);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		//act.dragAndDrop(source, target).build().perform();
		
		act.moveToElement(source).dragAndDrop(source, target).build().perform();
		
		String text= target.getText();
		
		if(text.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("The element has been dropped");
		}
		else
		{
			System.out.println("The element was not dragged");
		}


	}

}
