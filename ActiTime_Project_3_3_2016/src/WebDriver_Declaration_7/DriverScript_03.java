package WebDriver_Declaration_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class DriverScript_03 {
	
//	Page Factory is an inbuilt page object model concept for Selenium WebDriver but it is very optimized.
//	Here as well we follow the concept of separation of Page Object repository and Test methods. 
//	Additionally with the help of PageFactory class we use annotations @FindBy to find WebElement. 
//	We use intiElements method to initialize web elements
	
	// Declaring reference of page object
	Object_PO_Login_03 objLogin_Page ;
	Object_PO_Lending_Page_03 objLanding_Page;
	Object_Logout_Page_03 objLogout_Page;
	public static WebDriver driver;
	
	
	DriverScript_03()
	{
		objLogin_Page = new Object_PO_Login_03();
		objLanding_Page = new Object_PO_Lending_Page_03();
		objLogout_Page = new Object_Logout_Page_03();
				
	}	
	public void TC_1() throws InterruptedException
	{		
		Object_PO_Login_03.txt_username(driver).sendKeys("admin");
		Object_PO_Login_03.txt_password(driver).sendKeys("manager");
		Object_PO_Login_03.chk_KeepMe(driver).click();
		Object_PO_Login_03.btn_Login(driver).click();
		
		Thread.sleep(5000);
		
		Object_PO_Lending_Page_03.mnuTimeTrack(driver).click();
		Object_PO_Lending_Page_03.mnuTimeTrackSubEnterTimeTrack(driver).click();
		Object_PO_Lending_Page_03.mnuTimeTrackSubViewTimeTrack(driver).click();
		
		Object_Logout_Page_03.lnkLogut(driver).click();
		
	}
	
	public void TC_2() throws InterruptedException
	{
		
		Object_PO_Login_03.txt_username(driver).sendKeys("admin");
		Object_PO_Login_03.txt_password(driver).sendKeys("manager");
		Object_PO_Login_03.chk_KeepMe(driver).click();
		Object_PO_Login_03.btn_Login(driver).click();
		
		Thread.sleep(5000);
		
		Object_PO_Lending_Page_03.mnuTask(driver).click();;
		Object_PO_Lending_Page_03.mnuTaskSubCompletedTasks(driver).click();
		Object_PO_Lending_Page_03.mnuTaskSubProject_Customers(driver).click();
		Object_PO_Lending_Page_03.mnuTaskSubArchives(driver).click();
		Object_PO_Lending_Page_03.mnuTaskSubArchives(driver).click();
		
		Object_Logout_Page_03.lnkLogut(driver).click();
		
	}
	
	public void TC_3() throws InterruptedException
	{
		

		Object_PO_Login_03.txt_username(driver).sendKeys("admin");
		Object_PO_Login_03.txt_password(driver).sendKeys("manager");
		Object_PO_Login_03.chk_KeepMe(driver).click();
		Object_PO_Login_03.btn_Login(driver).click();
		
		Thread.sleep(5000);
		
		Object_PO_Lending_Page_03.mnuReport(driver).click();
		
		Object_Logout_Page_03.lnkLogut(driver).click();
		
	}
	
	public void TC_4() throws InterruptedException
	{
		

		Object_PO_Login_03.txt_username(driver).sendKeys("admin");
		Object_PO_Login_03.txt_password(driver).sendKeys("manager");
		Object_PO_Login_03.chk_KeepMe(driver).click();
		Object_PO_Login_03.btn_Login(driver).click();
		
		
		Thread.sleep(5000);
		
		Object_PO_Lending_Page_03.mnuUsers(driver).click();
		
		Object_Logout_Page_03.lnkLogut(driver).click();
		
	}
	
	public void TC_5() throws InterruptedException
	{
		

		Object_PO_Login_03.txt_username(driver).sendKeys("admin");
		Object_PO_Login_03.txt_password(driver).sendKeys("manager");
		Object_PO_Login_03.chk_KeepMe(driver).click();
		Object_PO_Login_03.btn_Login(driver).click();
		
		Thread.sleep(5000);
		
		Object_PO_Lending_Page_03.mnuWorkSchedule(driver).click();
		
		Object_Logout_Page_03.lnkLogut(driver).click();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
	
		String url = "http://localhost:89/login.do";
		driver = new FirefoxDriver();
		driver.get(url);
		Thread.sleep(5000);
		DriverScript_03 DS = new DriverScript_03();
		
		System.out.println("======TC-1===========");
		DS.TC_1();
		System.out.println("======TC-2===========");
		DS.TC_2();
		System.out.println("======TC-3===========");
		DS.TC_3();
		System.out.println("======TC-4===========");
		DS.TC_4();
		System.out.println("======TC-5===========");
		DS.TC_5();
		System.out.println("=========Completed========");
		driver.quit();
		
	}

}
