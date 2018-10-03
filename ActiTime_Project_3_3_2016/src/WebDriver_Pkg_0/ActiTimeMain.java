package WebDriver_Pkg_0;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// open url -----

///////////
// enter usernamev
// pass
// click login button
//////////////

// verify title

public class ActiTimeMain {

//	WebDriver driver = new FirefoxDriver();	
	
	 
	 WebDriver driver;
	 
	 
	
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
	}
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}
	
	public void verify_Title()	
	{
		String pageTitel = driver.getTitle();
		System.out.println(pageTitel);
		String expvalue = "actiTIME - Enter Time-Track".trim().toLowerCase();
		if("actiTIME - Enter Time-Track".equals(pageTitel))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	public void closeBroser()
	{
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ActiTimeMain objActiTimeMain = new ActiTimeMain();
		objActiTimeMain.openURL();
		objActiTimeMain.login();
		objActiTimeMain.verify_Title();
		objActiTimeMain.closeBroser();
	}

}
