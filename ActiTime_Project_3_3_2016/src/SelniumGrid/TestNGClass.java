package SelniumGrid;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

/*
 * 
 * Server
	java -jar selenium-server-standalone-2.48.2.jar -role hub
	http://localhost:4444/grid/console
	http://192.168.2.4:4444/grid/console
 * 
 * Client 
	java -jar selenium-server-standalone-2.48.2.jar -role webdriver -hub http://192.168.1.37:4444/grid/register -port 5566
	java -jar selenium-server-standalone-2.48.2.jar -role webdriver -hub http://192.168.1.37:4444/grid/register -port 5567 -Dwebdriver.chrome.driver=chromedriver.exe
	java -jar selenium-server-standalone-2.48.2.jar -role webdriver -hub http://192.168.1.37:4444/grid/register -port 5568 -Dwebdriver.ie.driver=IEDriverServer.exe

 * 
 * */

public class TestNGClass
{
   public WebDriver driver;
   public String URL, Node;
 //  protected ThreadLocal<RemoteWebDriver> threadDriver = null;
   //public RemoteWebDriver = null;
   
   @Parameters("browser")
   @BeforeTest
   public void launchapp(String browser) throws MalformedURLException 
   {
      String URL = "http://www.calculator.net";
      
      if (browser.equalsIgnoreCase("firefox"))
      {
         System.out.println(" Executing on FireFox");
         //String Node = "http://192.168.2.4:5566/wd/hub";
         String Node = "http://192.168.1.37:5566/wd/hub";
         DesiredCapabilities cap = DesiredCapabilities.firefox();         
         cap.setBrowserName("firefox");
         
         
         
         driver = new RemoteWebDriver(new URL(Node), cap);
         // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
      }
      else if (browser.equalsIgnoreCase("chrome"))
      {
         System.out.println(" Executing on CHROME");
//         File file = new File("D:/Projects/Java Project/ActiTime_Project/src/SelniumGrid/chromedriver.exe");
  //       System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
         //System.setProperty("webdriver.chrome.driver", "D:/Projects/Java Project/ActiTime_Project/src/SelniumGrid/chromedriver.exe");
         DesiredCapabilities cap = DesiredCapabilities.chrome();
         cap.setBrowserName("chrome");
         //String Node = "http://192.168.2.4:5567/wd/hub";
         String Node = "http://192.168.1.37:5567/wd/hub";
     	
		// driver = new ChromeDriver();
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
      }
      else if (browser.equalsIgnoreCase("ie"))
      {
         System.out.println(" Executing on IE");
       //  File file = new File("D:\\Projects\\Java Project\\ActiTime_Project\\src\\Browsers_CH_IE_09\\IEDriverServer.exe");
        // System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
       //  System.setProperty("webdriver.ie.driver", "");
         DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
         cap.setBrowserName("internet explorer");
         
         //String Node = "http://192.168.2.4:5568/wd/hub";
         String Node = "http://192.168.1.37:5568/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
      }
      else
      {
         throw new IllegalArgumentException("The Browser Type is Undefined");
      }
   }
   
   @Test
   public void calculatepercent()
   {
      // Click on Math Calculators
      driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();     	
      // Click on Percent Calculators
      driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
      // Get the Result Text based on its xpath
      String result = driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      if(result.equals("5"))
      {
         System.out.println(" The Result is Pass");
      }
      else
      {
         System.out.println(" The Result is Fail");
      }
   }
   
   @AfterTest
   public void closeBrowser()
   {
      driver.quit();
   }
}