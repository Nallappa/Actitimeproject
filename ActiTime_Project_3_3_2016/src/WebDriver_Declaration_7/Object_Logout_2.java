package WebDriver_Declaration_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Logout_2 {
	
	
//	Object_Logout_2(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
	
	// logut
	@FindBy(linkText= "Logout")
	WebElement lnkLogut ;
	
	public void LogOutClick()
	{
		lnkLogut.click();
	}

}
