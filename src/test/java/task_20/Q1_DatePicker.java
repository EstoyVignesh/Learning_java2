package task_20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1_DatePicker {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		  WebElement f = driver .findElement(By.xpath("//iframe[@class='demo-frame']"));
	      driver.switchTo().frame(f);
	      //identify element within frame
	      WebElement l = driver.findElement(By.id("datepicker"));
	      l.click();
	      //identify all td elements in list
	      List<WebElement> t =driver.findElements(By.xpath("//table/tbody/tr/td"));
	      Thread.sleep(3000);
	      //list traversal
	      for (int k = 0; k<t.size(); k++) {
	         //check date
	         String dt = t.get(k).getText();
	         if (dt.equals("22")) {
	            t.get(k).click();
	            //break;
	         }
	      }
	      //obtain selected date
	      String v = l.getAttribute("value");
	      Thread.sleep(5000);
	      System.out.print("Date selected by date picker: "+ v);
	      //close browser
	      Thread.sleep(5000);
	      driver.close();

		
		
		
		
		
/*	
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		
		  driver.findElement(By.id("datepicker")).click();
		

		
		 driver.findElement(By.id("datepicker")).clear();
		    driver.findElement(By.id("datepicker")).sendKeys("");    // This will add focus and open the Date picker
		    String Year = driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();       //This will give you Year 
		    String month = driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();      //This will give you Month

		    driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();   // Click for Next Month
		   // String SelectedDate = driver.findElement(By.cssSelector("ui-state-highlight")).getText();       // This will get you the selected Date 

		    driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-w")).click();      // Click for Previous Month
		    driver.findElement(By.linkText("22")).click();
		    
		    */
		
	}

}
