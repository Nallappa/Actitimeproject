package alert_Windows_4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class AlertsCommands {

	
	WebDriver driver;
	
	// Alert types
	// 1. Simple alert
	// 2. Confirmation alert
	// 3. Prompt alert

	// methods
	// accept() To accept the alert
	// dismiss() To dismiss the alert
	// getText() To get the text of the alert
	// sendKeys() To write some text to the alert
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		AlertsCommands ac = new AlertsCommands();

		// 1. Simple alert
//		ac.ExampleForAlert();
//		 2. Confirmation Alert
//		ac.ExampleForConfirmBox();
//		// 3. Prompt Alerts
		ac.ExampleForPromptBox();
//		
		
		// WaitDriverExample
//		ac.WaitDriverExample();
	}

	public void ExampleForAlert() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium/ActiTime_Project/src/alert_Windows_4/Alert_example.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Thread.sleep(5000);
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("html/body/fieldset/p")).getText());
		driver.quit();
	}

	public void ExampleForConfirmBox() throws InterruptedException {
		

//		 System.setProperty("webdriver.ie.driver","D:\\SeleniumDrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		
		driver.get("file:///D:/Selenium/ActiTime_Project/src/alert_Windows_4/Confirmation.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(2000);
		driver.quit();
	}

	public void ExampleForPromptBox() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Selenium/ActiTime_Project/src/alert_Windows_4/Prompt.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Helllo");
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
	}
	
	public void WaitDriverExample() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file;///D:/Selenium/ActiTime_Project/src/alert_Windows_4.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Thread.sleep(5000);
		
		// Create new WebDriver wait
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Wait for Alert to be present
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());

		System.out.println("Either Pop Up is displayed or it is Timed Out");
		// Accept the Alert
		Thread.sleep(5000);
		myAlert.accept();

		System.out.println("Alert Accepted");

		// Close the main window
		driver.close();
	}
	
	

}
