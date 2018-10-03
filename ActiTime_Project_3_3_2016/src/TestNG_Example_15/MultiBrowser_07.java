package TestNG_Example_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_07 {

	public WebDriver driver;

	//Passing Browser parameter from TestNG xml
	@Parameters("browser")
	@BeforeClass 
	public void beforeTest(String browser) {

		
		// If the browser is Firefox, then do this
		if(browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

			// If browser is IE, then do this	  
		}else if (browser.equalsIgnoreCase("ie")) { 
			
			// Here I am setting up the path for my IEDriver
			System.setProperty("webdriver.ie.driver", "D:/Selenium/ActiTime_Project/src/Browsers_CH_IE_09/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else if (browser.equalsIgnoreCase("chrome")) { 
			// Here I am setting up the path for my chrome
			System.setProperty("webdriver.chrome.driver", "D:/Selenium/ActiTime_Project/src/Browsers_CH_IE_09/chromedriver.exe");
			driver = new ChromeDriver();

		} 
		
		// Doesn't the browser type, lauch the Website
		driver.get("http://localhost/login.do"); 

	}

	// Once Before method is completed, Test method will start
	@Test 
	public void login() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login success");

	}  

	@AfterClass public void afterTest() {

		driver.quit();

	}

}