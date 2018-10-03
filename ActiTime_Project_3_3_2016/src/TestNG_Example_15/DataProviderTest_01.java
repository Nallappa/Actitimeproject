package TestNG_Example_15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest_01 {
	
	private static WebDriver driver;
	
	  @DataProvider(name = "Login")
	  public static Object[][] credentials() {
	 
	        // The number of times data is repeated, test will be executed the same no. of times	 
	        // Here it will execute two times	 
	        return new Object[][] { { "admin", "manager" }, { "admin", "manager" }};
	  }
	  
	  //@Test(enabled = false) 
	  @Test(dataProvider = "Login")
	  public void test(String sUsername, String sPassword) {
	 
		  System.setProperty("webdriver.chrome.driver", "D:/Selenium/ActiTime_Project/src/Browsers_CH_IE_09/chromedriver.exe");
		  driver = new ChromeDriver();
	      //driver = new FirefoxDriver();	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 
	      driver.get("http://localhost/login.do");
	      driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
			
	      driver.quit();
	  }
	 
}

