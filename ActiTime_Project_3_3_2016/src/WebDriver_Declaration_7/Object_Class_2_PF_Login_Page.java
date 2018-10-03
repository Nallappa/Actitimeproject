package WebDriver_Declaration_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.jna.platform.win32.OaIdl.TYPEDESC._TYPEDESC;

public class Object_Class_2_PF_Login_Page {

	// Object class Level
//	Object_Class_2_PF_Login_Page(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}


	
//	public Object_Class_2_PF_Login_Page(WebDriver d) {
//		// TODO Auto-generated constructor stub
//		driver = d;
//	}
//	
	// Login page
	@FindBy( id = "username")
	WebElement _idtxtUsername;
	
	@FindBy(name= "pwd")
	WebElement _nametxtPassword ;
	
	@FindBy(id= "keepLoggedInCheckBox")
	WebElement chkkeepMe ;
	
	@FindBy(id= "loginButton")
	WebElement btnLogin ;
	
	

	public void setUsername(String username) {
			_idtxtUsername.sendKeys(username);

	}

	public void setPassword(String Password) {
		_nametxtPassword.sendKeys(Password);
	}

	public void checkCheckBox()
	{
		chkkeepMe.click();
		
	}
	public void LoginClick()
	{
		btnLogin.click();
	}
	
}
