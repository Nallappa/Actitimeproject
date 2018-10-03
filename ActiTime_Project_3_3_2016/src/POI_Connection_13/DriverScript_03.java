package POI_Connection_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.sun.jna.platform.win32.Netapi32Util.User;



public class DriverScript_03 {
	
//	Page Factory is an inbuilt page object model concept for Selenium WebDriver but it is very optimized.
//	Here as well we follow the concept of separation of Page Object repository and Test methods. 
//	Additionally with the help of PageFactory class we use annotations @FindBy to find WebElement. 
//	We use intiElements method to initialize web elements
	
	// Declaring reference of page object
	Object_PO_Login_03 objLogin_Page ;
	Object_PO_Lending_Page_03 objLanding_Page;
	Object_Logout_Page_03 objLogout_Page;
	Users_Page objUserpage;
	public static WebDriver driver;
	
	
	DriverScript_03()
	{
		

		objLogin_Page = new Object_PO_Login_03();
		objLanding_Page = new Object_PO_Lending_Page_03();
		objLogout_Page = new Object_Logout_Page_03();
		objUserpage = new Users_Page();
				
	}
	
	
	public void TC_1() throws Exception
	{
		String path = Constant.Path_TestData + Constant.File_TestData;
		ExcelUtils.setExcelFile(path,"Login");
		
		String sUserName ;
		String sPassword ;
		try {
			//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
			sUserName = ExcelUtils.getCellData(1, 1);
			sPassword = ExcelUtils.getCellData(1, 2);
			
			Object_PO_Login_03.txt_username(driver).sendKeys(sUserName);
			Object_PO_Login_03.txt_password(driver).sendKeys(sPassword);
			Object_PO_Login_03.chk_KeepMe(driver).click();
			Object_PO_Login_03.btn_Login(driver).click();
			
			Thread.sleep(5000);			
		
		//	Object_Logout_Page_03.lnkLogut(driver).click();
			 
			ExcelUtils.setCellData("Pass", 1, 3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void TC_2() throws Exception
	{
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"CreateUsers");
		
		for (int i=1 ;i<=4;i++)
		{
			String sadmin = ExcelUtils.getCellData(i, 1);
			String sadminpass = ExcelUtils.getCellData(i, 2);
			String sFirstName = ExcelUtils.getCellData(i, 3);
			String sLastName = ExcelUtils.getCellData(i, 4);
			String sEmailid = ExcelUtils.getCellData(i, 5);
			String sUserName = ExcelUtils.getCellData(i, 6);
			String sPassword = ExcelUtils.getCellData(i, 7);
			String sretype = ExcelUtils.getCellData(i, 8);
			String sTimeZone = ExcelUtils.getCellData(i, 9);
			String sManageCustomerAndProject = ExcelUtils.getCellData(i, 10);
			String sManageType = ExcelUtils.getCellData(i, 11);
	
			Object_PO_Login_03.txt_username(driver).sendKeys(sadmin);
			Object_PO_Login_03.txt_password(driver).sendKeys(sadminpass);
			Object_PO_Login_03.chk_KeepMe(driver).click();
			Object_PO_Login_03.btn_Login(driver).click();
			
			
			Thread.sleep(5000);
			
			Object_PO_Lending_Page_03.mnuUsers(driver).click();
			Thread.sleep(5000);
			Users_Page.btn_User(driver).click();
			Thread.sleep(5000);
			Users_Page.txt_FirstName(driver).sendKeys(sFirstName);
			Users_Page.txt_LastName(driver).sendKeys(sLastName);
			Users_Page.txt_EmailId(driver).sendKeys(sEmailid);
			
			Users_Page.txt_UserName(driver).sendKeys(sUserName);
			Users_Page.txt_Password(driver).sendKeys(sPassword);
			Users_Page.txt_PasswordCopy(driver).sendKeys(sretype);
			
			Users_Page.drp_TimeZone(driver).click();
			Thread.sleep(5000);
			
			Users_Page.drp_lnk_TimeZone(driver, sTimeZone).click();
			
			if(sManageCustomerAndProject=="Yes")
			{
				if(!Users_Page.chk_ManageCustomerProjects(driver).isSelected())
				{
					Users_Page.chk_ManageCustomerProjects(driver).click();
				}
			}
			
			if(sManageType=="Yes")
			{
				if(!Users_Page.chk_ManageTasks(driver).isSelected())
				{
					Users_Page.chk_ManageCustomerProjects(driver).click();
				}
			}
			
			Users_Page.btn_CreateUser(driver).click();
			
			Thread.sleep(5000);
			
			Object_Logout_Page_03.lnkLogut(driver).click();
			Thread.sleep(5000);
		}
	}
	
//	public void TC_2() throws InterruptedException
//	{
//		
//		Object_PO_Login_03.txt_username(driver).sendKeys("admin");
//		Object_PO_Login_03.txt_password(driver).sendKeys("manager");
//		Object_PO_Login_03.chk_KeepMe(driver).click();
//		Object_PO_Login_03.btn_Login(driver).click();
//		
//		Thread.sleep(5000);
//		
//		Object_PO_Lending_Page_03.mnuTask(driver).click();;
//		Object_PO_Lending_Page_03.mnuTaskSubCompletedTasks(driver).click();
//		Object_PO_Lending_Page_03.mnuTaskSubProject_Customers(driver).click();
//		Object_PO_Lending_Page_03.mnuTaskSubArchives(driver).click();
//		Object_PO_Lending_Page_03.mnuTaskSubArchives(driver).click();
//		
//		Object_Logout_Page_03.lnkLogut(driver).click();
//		
//	}
//	
//	public void TC_3() throws InterruptedException
//	{
//		
//
//		Object_PO_Login_03.txt_username(driver).sendKeys("admin");
//		Object_PO_Login_03.txt_password(driver).sendKeys("manager");
//		Object_PO_Login_03.chk_KeepMe(driver).click();
//		Object_PO_Login_03.btn_Login(driver).click();
//		
//		Thread.sleep(5000);
//		
//		Object_PO_Lending_Page_03.mnuReport(driver).click();
//		
//		Object_Logout_Page_03.lnkLogut(driver).click();
//		
//	}
//	
//	public void TC_4() throws InterruptedException
//	{
//		
//
//		Object_PO_Login_03.txt_username(driver).sendKeys("admin");
//		Object_PO_Login_03.txt_password(driver).sendKeys("manager");
//		Object_PO_Login_03.chk_KeepMe(driver).click();
//		Object_PO_Login_03.btn_Login(driver).click();
//		
//		
//		Thread.sleep(5000);
//		
//		Object_PO_Lending_Page_03.mnuUsers(driver).click();
//		
//		Object_Logout_Page_03.lnkLogut(driver).click();
//		
//	}
//	
//	public void TC_5() throws InterruptedException
//	{
//		
//
//		Object_PO_Login_03.txt_username(driver).sendKeys("admin");
//		Object_PO_Login_03.txt_password(driver).sendKeys("manager");
//		Object_PO_Login_03.chk_KeepMe(driver).click();
//		Object_PO_Login_03.btn_Login(driver).click();
//		
//		Thread.sleep(5000);
//		
//		Object_PO_Lending_Page_03.mnuWorkSchedule(driver).click();
//		
//		Object_Logout_Page_03.lnkLogut(driver).click();
//		
//	}
	
	public static void main(String[] args) throws Exception {
	
		 
		
	
		String url = "http://localhost:89/login.do";
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		DriverScript_03 DS = new DriverScript_03();
		
		//System.out.println("======TC-1===========");
		//DS.TC_1();
		System.out.println("======TC-2===========");
		DS.TC_2();
//		System.out.println("======TC-3===========");
//		DS.TC_3();
//		System.out.println("======TC-4===========");
//		DS.TC_4();
//		System.out.println("======TC-5===========");
//		DS.TC_5();
		System.out.println("=========Completed========");
		driver.quit();
		
	}

}
