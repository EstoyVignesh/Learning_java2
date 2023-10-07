package Dataprovide;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dataprovider {
	WebDriver driver;

 

@Test (dataProvider="dp")
  public void login (String email, String password) {

	WebElement a=driver.findElement(By.name("email"));
	  WebElement b =driver.findElement(By.name("pass")); 
	  WebElement c=driver.findElement(By.name("login"));
		
		
	
	  a.sendKeys(email);
	  a.clear();

	  b.sendKeys(password);
	  b.clear();
	  c.click();
	
  }
@DataProvider
public Object[][]dp(){
	return new Object[][] {
		new Object[] {"Vignesh000vky@gmail.com","@Lolaflan"},
		new Object[] {"Vigneh00","@lolaflan"}
	};
		
	}

  public void f() {
  }
  @BeforeTest
  public void beforeTest() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\arvin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
  }

  @AfterTest
  public void afterTest() {
  }

}
