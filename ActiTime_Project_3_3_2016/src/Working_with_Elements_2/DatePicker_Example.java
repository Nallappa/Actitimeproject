package Working_with_Elements_2;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class DatePicker_Example {
	WebDriver driver;
	public void DatePicker_01() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://jqueryui.com/datepicker/"); 
		Thread.sleep(5000);
		driver.switchTo().frame(0); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		//Click on textbox so that datepicker will come 
		driver.findElement(By.id("datepicker")).click(); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		//Click on next so that we will be in next month 
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click(); 

		/*DatePicker is a table.So navigate to each cell  
		 * If a particular cell matches value 13 then select it 
		 */ 
		WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div")); 
		List<WebElement> rows = dateWidget.findElements(By.tagName("tr")); 
		List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 

		for (WebElement cell: columns){ 
			//Select 13th Date  
			if (cell.getText().equals("13")){ 
				cell.findElement(By.linkText("13")).click(); 
				break; 
			} 

		}
	}

		public void DatePicker_02(String date) throws InterruptedException 
		{

			 System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://way2automation.com/way2auto_jquery/datepicker.php");
				
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Thread.sleep(2000);
//				driver.switchTo().frame(0);
				driver.findElement(By.id("datepicker")).click();
				
				WebElement wtb = driver.findElement(By.className("ui-datepicker-calendar"));
				
				List<WebElement> wtbrows = wtb.findElements(By.tagName("tr"));
				List<WebElement> wtbcols = wtb.findElements(By.tagName("td"));
				
				for(WebElement w:wtbcols)
				{
					System.out.println(w.getText());
					w.findElement(By.linkText(date)).click();
				}
				
//			driver.get("http://www.makemytrip.com/"); 
//			Thread.sleep(5000);
//			//     driver.switchTo().frame(0); 
//			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
//			//Click on textbox so that datepicker will come 
//			driver.findElement(By.id("start_date_sec")).click(); 
//			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
//			
//			/*DatePicker is a table.So navigate to each cell  
//			 * If a particular cell matches value 13 then select it 
//			 */ 
//			WebElement dateWidget = driver.findElement(By.className("ui-datepicker-calendar")); 
//			List<WebElement> rows = dateWidget.findElements(By.tagName("tr")); 
//			List<WebElement> columns=dateWidget.findElements(By.tagName("td")); 
//
//			for (WebElement cell: columns){ 
//				//Select 13th Date  
//				if (cell.getText().equals(date)){ 
//					System.out.println("Date Found");
//					cell.findElement(By.linkText(date)).click(); 
//					break; 
//				} 
//			}
		}

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			DatePicker_Example dp = new DatePicker_Example();
//			dp.DatePicker_01();
			dp.DatePicker_02("13");
			
		}
	}

