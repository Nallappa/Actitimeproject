package TestNG_Example_15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TC_03 {
	WebDriver d; 
	
	  @Test(priority=1)
	  public void login() {
		  System.out.println("===loging=====");
		  d.findElement(By.id("username")).sendKeys("admin");
		  d.findElement(By.name("pwd")).sendKeys("manager");
		  d.findElement(By.id("loginButton")).click();
	  }
	  
	  @Test(priority=2)
	  public void Users()
	  {
		  System.out.println("===Users=====");
		  d.findElement(By.linkText("Users")).click();
		  String s = d.findElement(By.xpath(".//*[@id='pageBody']/tbody/tr[1]/td[1]/div")).getText();
		  Assert.assertEquals("User List", s);
	  }
	  
	  @Test(priority=3)
	  public void Logout()
	  {
		  System.out.println("===logout=====");
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  d.findElement(By.linkText("Logout")).click();
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  d = new FirefoxDriver();
		  d.get("localhost:89/login.do");
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterClass
	  public void afterClass() {
		  d.quit();
	  }

	}
