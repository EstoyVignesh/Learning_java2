package task_21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_NestedFrames {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(2000);

		 driver.switchTo().frame("frame-top");
		 Thread.sleep(2000);
		 
		 driver.switchTo().frame("frame-left");
		 WebElement leftFrame = driver.findElement(By.tagName("body"));
	        String leftFrameText = leftFrame.getText();
	        System.out.println(leftFrameText);
	        Thread.sleep(2000);
	        
	        driver.switchTo().parentFrame();
			 Thread.sleep(2000);
	        	        
	       WebElement middleframe = driver.findElement(By.xpath("//frame[@src='/frame_middle']"));
	        driver.switchTo().frame(middleframe);
	        WebElement middle = driver.findElement(By.id("content"));
	        String middleFrameText = middle.getText();
	        System.out.println(middleFrameText);
	        Thread.sleep(2000);
	        
	        driver.switchTo().parentFrame();
			 Thread.sleep(2000);
	        
	       // driver.switchTo().frame(2);
			 driver.switchTo().frame("frame-right");
	        WebElement rightFrame2 = driver.findElement(By.tagName("body"));
	        String rightFrameText2 = rightFrame2.getText();
	        System.out.println(rightFrameText2);
	        Thread.sleep(2000);
	        
	        driver.switchTo().defaultContent();
			 Thread.sleep(2000);
	        
	        driver.switchTo().frame("frame-bottom");
	        WebElement bottomFrame3 = driver.findElement(By.tagName("body"));
	        String bottomFrameText3 = bottomFrame3.getText();
	        System.out.println(bottomFrameText3);
	        Thread.sleep(2000);
	        
	        
	        
	        driver.switchTo().defaultContent();
	        Thread.sleep(2000);
	        
	        driver.quit();

	}

}
