package WebDriver_Declaration_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class DriverScript_02 {
	
//	Page Factory is an inbuilt page object model concept for Selenium WebDriver but it is very optimized.
//	Here as well we follow the concept of separation of Page Object repository and Test methods. 
//	Additionally with the help of PageFactory class we use annotations @FindBy to find WebElement. 
//	We use intiElements method to initialize web elements
	
	// Declaring reference of page object
	Object_Class_2_PF_Login_Page objLogin_Page ;
	Object_Lending_Page_2 objLanding_Page;
	Object_Logout_2 objLogout_Page;
	
	
	
	DriverScript_02(WebDriver driver)
	{
		objLogin_Page = new Object_Class_2_PF_Login_Page();
		objLanding_Page = new Object_Lending_Page_2();
		objLogout_Page = new Object_Logout_2();
//		
//		Driver level
		objLogin_Page = PageFactory.initElements(driver, Object_Class_2_PF_Login_Page.class);
		objLanding_Page = PageFactory.initElements(driver, Object_Lending_Page_2.class);
		objLogout_Page = PageFactory.initElements(driver, Object_Logout_2.class);
		

		// Object class level
//		objLogin_Page = new Object_Class_2_PF_Login_Page(driver);
//		objLanding_Page = new Object_Lending_Page_2(driver);
//		objLogout_Page = new Object_Logout_2(driver);
				
	}
	
	
	public void TC_1() throws InterruptedException
	{
		
		objLogin_Page.setUsername("admin");
		objLogin_Page.setPassword("manager");
		objLogin_Page.checkCheckBox();
		objLogin_Page.LoginClick();
		
		Thread.sleep(5000);
		
		objLanding_Page.mnuTimeTrackClick();
		objLanding_Page.mnuTimeTrackSubEnterTimeTrackClick();
		objLanding_Page.mnuTimeTrackSubViewTimeTrackClick();
		
		objLogout_Page.LogOutClick();
		
	}
	
	public void TC_2() throws InterruptedException
	{
		
		objLogin_Page.setUsername("admin");
		objLogin_Page.setPassword("manager");
		objLogin_Page.checkCheckBox();
		objLogin_Page.LoginClick();
		
		Thread.sleep(5000);
		
		objLanding_Page.mnuTaskClick();
		objLanding_Page.mnuTaskSubCompletedTasksClick();
		objLanding_Page.mnuTaskSubProject_CustomersClick();
		objLanding_Page.mnuTaskSubArchivesClick();
		objLanding_Page.mnuTaskSubArchivesClick();
		
		objLogout_Page.LogOutClick();
		
	}
	
	public void TC_3() throws InterruptedException
	{
		
		objLogin_Page.setUsername("admin");
		objLogin_Page.setPassword("manager");
		objLogin_Page.checkCheckBox();
		objLogin_Page.LoginClick();
		
		Thread.sleep(5000);
		
		objLanding_Page.mnuReportClick();
		
		objLogout_Page.LogOutClick();
		
	}
	
	public void TC_4() throws InterruptedException
	{
		
		objLogin_Page.setUsername("admin");
		objLogin_Page.setPassword("manager");
		objLogin_Page.checkCheckBox();
		objLogin_Page.LoginClick();
		
		Thread.sleep(5000);
		
		objLanding_Page.mnuUsersClick();
		
		objLogout_Page.LogOutClick();
		
	}
	
	public void TC_5() throws InterruptedException
	{
		
		objLogin_Page.setUsername("admin");
		objLogin_Page.setPassword("manager");
		objLogin_Page.checkCheckBox();
		objLogin_Page.LoginClick();
		
		Thread.sleep(5000);
		
		objLanding_Page.mnuWorkScheduleClick();
		
		objLogout_Page.LogOutClick();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
	
		String url = "http://localhost:89/login.do";
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		Thread.sleep(5000);
		DriverScript_02 DS = new DriverScript_02(driver);
		
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
