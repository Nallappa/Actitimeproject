package TestNG_Example_15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TC_01 {
	
	WebDriver d; 
	
  @Test(priority=1)
  public void login() {
	  System.out.println("===loging=====");
//	  d.findElement(By.id("username")).sendKeys("admin");
//	  d.findElement(By.name("pwd")).sendKeys("manager");
//	  d.findElement(By.id("loginButton")).click();
  }
  
  @Test(priority=2)
  public void TimeTrack()
  {
	  System.out.println("===timetrack=====");
//	  d.findElement(By.linkText("Time-Track")).click();
//	  String s = d.findElement(By.xpath("//*[@id='enterTTMainContent']/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td")).getText();
//	  Assert.assertEquals("Enter Time-Track", s);
	  
  }
  
  @Test(priority=3)
  public void Logout()
  {
	  System.out.println("===logout=====");
//	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  d.findElement(By.linkText("Logout")).click();
  }
  
  @BeforeClass
  public void beforeClass() {
	 /* d = new FirefoxDriver();
	  d = new ChromeDriver();
	 
	  d.get("http://localhost/login.do");
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	  System.out.println("Test");
  }

  @AfterClass
  public void afterClass() {
//	  d.quit();
	  System.out.println("logout");
  }

}
