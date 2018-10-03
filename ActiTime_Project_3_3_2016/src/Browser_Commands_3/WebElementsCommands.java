package Browser_Commands_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * Clear() command
		 * SendKeys()
		 * click()
		 * IsDisplay()
		 * IsEnable()
		 * IsSelected()
		 * Submit()
		 * GetText()
		 * getTagName()
		 * getCssValue()
		 * getAttribute()
		 * getSize()
		 * getLocation()
		 * 
		 * */ 
		
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.facebook.com");
		
		// clear()
		d.findElement(By.id("u_0_1")).sendKeys("Selenium automation");
		Thread.sleep(5000);
		d.findElement(By.id("u_0_1")).clear();
		
		
		//SendKeys()
		//other way to use webelement
		WebElement txtLogin = d.findElement(By.id("u_0_1"));
		txtLogin.sendKeys("Selenium Automation");
		
		// isDisplayed()
		boolean tfound = txtLogin.isDisplayed();
		System.out.println("isDisplayed : " + tfound);
		
		
		// isEnabled()
		boolean xloginFound = txtLogin.isEnabled();
		System.out.println("isEnabled : " + tfound);
		if(xloginFound){
			txtLogin.sendKeys("selenium testing");
		}
		
		
		
		// IsSelected()
		//Checkboxes, Select Options and Radio Buttons. 
		WebElement chkKeepMe = d.findElement(By.id("persist_box"));
		boolean status = chkKeepMe.isSelected();
		if(status == false)
		{
			System.out.println("isSelected: " + status);
			chkKeepMe.click();
		}
		
		
		
		// getText()
		WebElement lnkCreate = d.findElement(By.xpath(".//*[@id='reg_pages_msg']/a"));
		String s = lnkCreate.getText();
		System.out.println("getText - Link text : " + s);
		
		//getTagName()
		System.out.println("Tag name : "+ lnkCreate.getTagName());
		
		
		// getCssValue()
		WebElement eleCreateAccount = d.findElement(By.xpath(".//*[@id='u_0_i']"));
		String cssvalue = eleCreateAccount.getCssValue("font-family");
		System.out.println("Css value:" + cssvalue);
		
		// getAttribute()
		System.out.println("Attribute id : " + eleCreateAccount.getAttribute("id"));
		
		
		// getSize()
		WebElement eleCreateAccountSize = d.findElement(By.id("u_0_i"));
		Dimension dimensions = eleCreateAccountSize.getSize();
		System.out.println("Height :" + dimensions.height + "Width : "+ dimensions.width);


		//getLocation()
		WebElement eleCreateAccountLocation = d.findElement(By.id("u_0_i"));
		Point point = eleCreateAccountLocation.getLocation();
		System.out.println("X cordinate : " + point.x + "Y cordinate: " + point.y);
		
		
		//Submit()
		WebElement btnSignUp = d.findElement(By.id("u_0_v"));
		btnSignUp.submit(); 	
		
		
	}

}
