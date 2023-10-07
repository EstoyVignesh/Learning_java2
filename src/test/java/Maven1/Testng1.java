package Maven1;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Testng1 {
	WebDriver driver;
	
  @Test(priority=2)
  public void f() throws IOException {
	  driver.get("https://www.google.com/photos/gallery-go/");
	  TakesScreenshot cap=(TakesScreenshot)driver;
		File scr=cap.getScreenshotAs(OutputType.FILE);
		File scr1=new File(".\\Googlehomepage\\Googlehome.png");
		Files.copy(scr,scr1);
	
  }
  
  @Test (enabled=false)//(priority=1)
		  public void hello() {
	  driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement obj1=driver.findElement(By.id("draggable"));
		WebElement obj2=driver.findElement(By.id("droppable"));
		Actions builder =new Actions(driver);
		Action obj4 =builder.clickAndHold(obj1).moveToElement(obj2).release(obj2).build();
		obj4.perform();
	  
	  
  }
  @BeforeTest
  public void beforeTest(){
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\arvin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
		
		 
		
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	 
	
	
	

}
}