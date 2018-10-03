package POI_Connection_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Users_Page {

	private static WebElement element = null;
	
	public static WebElement btn_User(WebDriver d)
	{
		element = d.findElement(By.xpath(".//span[text()='User']"));
		return element;
	}
	public static WebElement txt_FirstName(WebDriver d)
	{
		element = d.findElement(By.name("firstName"));
		return element;
	}
	
	
	public static WebElement txt_LastName(WebDriver d)
	{
		element = d.findElement(By.name("lastName"));
		return element;
	}
	
	public static WebElement txt_EmailId(WebDriver d)
	{
		element = d.findElement(By.name("email"));
		return element;
	}
	
	public static WebElement txt_UserName(WebDriver d)
	{
		element = d.findElement(By.name("username"));
		return element;
	}
	
	public static WebElement txt_Password(WebDriver d)
	{
		element = d.findElement(By.name("password"));
		return element;
	}

	public static WebElement txt_PasswordCopy(WebDriver d)
	{
		element = d.findElement(By.name("passwordCopy"));
		return element;
	}
	
	public static WebElement drp_TimeZone(WebDriver d)
	{
		element = d.findElement(By.xpath(".//button[contains(text(),'Default Time Zone')]"));
		return element;
	}
	
	public static WebElement drp_lnk_TimeZone(WebDriver d,String value)
	{
		element = d.findElement(By.linkText(value));
		return element;
	}
	
	public static WebElement chk_ManageCustomerProjects(WebDriver d)
	{
		element = d.findElement(By.id("userDataLightBox_manageCustomersProjectsChBox"));
		return element;
	}
	
	public static WebElement chk_ManageTasks(WebDriver d)
	{
		element = d.findElement(By.id("userDataLightBox_manageTasksChBox"));
		return element;
	}
	
	public static WebElement btn_CreateUser(WebDriver d)
	{
		element = d.findElement(By.id("userDataLightBox_commitBtn"));
		return element;
	}
	
	
}
