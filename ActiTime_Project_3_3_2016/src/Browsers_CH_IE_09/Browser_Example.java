package Browsers_CH_IE_09;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.Version;

public class Browser_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Browser_Example Be = new Browser_Example();
		Be.ChromeBrowser();
		Be.IEBrowser();
		
		
	}
	
	public void ChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java Project\\ActiTime_Project\\src\\Browsers_CH_IE_09\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("http://google.com");
		 
		 driver.quit();
		
	}
	
	public void IEBrowser()
	{
		// Method and Description - static DesiredCapabilities internetExplorer()
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		 
		 //Method and Description - void setCapability(java.lang.String capabilityName, boolean value)
		 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);		 
		 //Among the facilities provided by the System class are standard input, standard output, and error output streams; access to externally defined "properties"; a means of loading files and libraries; and a utility method for quickly copying a portion of an array.
		 System.setProperty("webdriver.ie.driver", "D:\\Projects\\Java Project\\ActiTime_Project\\src\\Browsers_CH_IE_09\\IEDriverServer.exe");
		 
		 //InternetExplorerDriver(Capabilities capabilities)
		 WebDriver driver = new InternetExplorerDriver(capabilities);
		 
		 driver.manage().window().maximize();
		 driver.get("http://google.com");
		 
		 driver.quit();
	}

}
