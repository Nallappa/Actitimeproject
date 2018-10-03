package XPath_Functions_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Function_Example {

//	1.	text()
//	2.	normalize- space()
//	3.	contains()
//	4.	following- sibling()
//	5.	preceding – sibling()
//	6.	descendant()

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:89/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath(".//*[@id='loginButton']/div")).click(); // Clicking on Login

//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Users")).click(); // Click on users Menu
//		driver.findElement(By.id("ext-gen7")).click(); // Click on User button
//		
//		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Ram");		
//		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Kumar");
//		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("Ram@gmail.com");
//		
//		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("ramkumar");
//		
//		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("ramkumar");
//		driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("ramkumar");
//		
//		
//		driver.findElement(By.id("userDataLightBox_manageCustomersProjectsChBox")).click();
//		driver.findElement(By.id("userDataLightBox_generateTimeReportsChBox")).click();
//		driver.findElement(By.id("userDataLightBox_manageAccountsChBox")).click();
//		
//		driver.findElement(By.id("userDataLightBox_commitBtn")).click();
//		
		//driver.quit();
	
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]/img")).click();
		
		// Text()
		String ActualString = driver.findElement(By.xpath(".//td[text()='Leave Time Total:']")).getText();
		System.out.println("Actual String :" + ActualString);
		
		
//2.	normalize- space()
		
		driver.findElement(By.linkText("Tasks")).click();
		Thread.sleep(5000);
		
		
		String strOpentask1 = driver.findElement(By.xpath(".//td[normalize-space(text())='Open Tasks']")).getText();
		if(strOpentask1.equals("Open Tasks"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		//3.	contains()
		
		String strOpentask2 = driver.findElement(By.xpath(".//td[contains(text(),'Open')]")).getText();
		System.out.println(strOpentask2);
		

//		4.	following- sibling()
		
		driver.findElement(By.linkText("Tasks")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath(".//*[@id='customerNameCell8']/following-sibling::td[1]/a")).click();
		
		
//		5.	preceding – sibling()
		driver.findElement(By.linkText("Open Tasks")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath(".//*[@id='taskNameCell5']/preceding-sibling::td[1]")).getText());
			
	}

}
