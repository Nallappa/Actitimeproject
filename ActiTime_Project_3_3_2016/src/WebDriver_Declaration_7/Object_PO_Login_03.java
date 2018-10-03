package WebDriver_Declaration_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Object_PO_Login_03 {

	private static WebElement element = null;
	
	public static WebElement txt_username(WebDriver d)
	{
		element = d.findElement(By.id("username"));
		element.clear();
		return element;
	}
	
	
	public static WebElement txt_password(WebDriver d)
	{
		element = d.findElement(By.name("pwd"));
		element.clear();
		return element;
	}
	
	public static WebElement chk_KeepMe(WebDriver d)
	{
		element = d.findElement(By.id("keepLoggedInCheckBox"));
		//element.click(); // do not click here
		return element;
	}
	
	public static WebElement btn_Login(WebDriver d)
	{
		element = d.findElement(By.id("loginButton"));
		return element;
	}
	
	
}
