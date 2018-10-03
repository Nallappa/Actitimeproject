package Frame_Handling_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		We can use the switchTo().frame() in three ways:
//
//			switchTo.frame(int frameNumber): Pass the frame index and driver will switch to that frame.
//			switchTo.frame(string frameNameOrId): Pass the frame element Name or ID and driver will switch to that frame.
//			switchTo.frame(WebElement frameElement): Pass the frame web element and driver will switch to that frame.
		
		Iframe_Example ie = new Iframe_Example();
//		ie.FindNoOfFrame();
		ie.FrameByIDExample();
	//	ie.FrameByIndexExample();
	//	ie.FrameByNameExample();

		
	}
	
	public void FindNoOfFrame()
	{
		System.out.println("=========FindNoOfFrame=========");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com/iframe-practice-page/");
 
 
		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);
 
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());
		driver.quit();
		
	}
	
	public void FrameByIndexExample()
	{
		System.out.println("=========FrameByIndexExample=========");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com/iframe-practice-page/");
		System.out.println("Main driver : " + driver.getTitle());
		//Switch by Index
		driver.switchTo().frame(0);
		System.out.println("Frame 0 : " + driver.getTitle());
		driver.quit();
	}

	public void FrameByNameExample()
	{
	
		System.out.println("=========FrameByNameExample=========");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com/iframe-practice-page/");
		System.out.println("Main driver : " + driver.getTitle());
		
		//Switch by frame name
		driver.switchTo().frame("iframe1");
		System.out.println("iframe1 : " + driver.getTitle());
		driver.quit();
	
	}
	
	public void FrameByIDExample()
	{
		System.out.println("=========FrameByIDExample=========");
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\Java Project\\ActiTime_Project\\src\\Browsers_CH_IE\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com/iframe-practice-page/");
		System.out.println("Default frame value: "+ driver.findElement(By.xpath(".//*[@id='content']/h2")).getText());
		
		// before switching to frame 2
		try {
			System.out.println("Frame 2 value : "+driver.findElement(By.xpath(".//*[@id='post-9']/header/h1")).getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Switch by frame ID
		driver.switchTo().frame("iframe2");
		System.out.println("In New Frame 2 value : "+driver.findElement(By.xpath(".//*[@id='post-9']/header/h1")).getText());
		
		// printing value from main frame
		try {
			System.out.println("Accessing in frame 2 - Default frame value: "+ driver.findElement(By.xpath(".//*[@id='content']/h2")).getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().defaultContent();		
		System.out.println("After coming to main frame value: "+ driver.findElement(By.xpath(".//*[@id='content']/h2")).getText());
		driver.quit();

	}
	

}
