package Locator_Example_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:89/login.do");
		
//		1.	Id
		driver.findElement(By.id("username")).sendKeys("admin");		
		
//		2.	Name 
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
//		3.	Xpath— fire path—1 absolute xpath  2 relative xpath
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[3]/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click(); // Clicking on Login
		
		driver.findElement(By.xpath(".//*[@id='taskSearchControl_field']")).sendKeys("test"); // entering into add task by name 
		driver.findElement(By.xpath(".//*[@class='sortByTaskNameLink']")).click();  // Clicking on task Heading for sorting
		
//		4.	Css- select
		driver.findElement(By.cssSelector(".item")).click(); // Clicking on new Button 
		
//		5.	Links
		driver.findElement(By.linkText("Time-Track")).click(); // Clicking on time track on main Menu
				
//		6.	Partial link		
		driver.findElement(By.partialLinkText("Work")).click(); // CLicking on work Schedule on main Menu
		
//		7.	classname
		driver.findElement(By.className("logout")).click(); // Click on logout
		
		//.//*[@title='Do not select if this computer is shared' and @class='label']
		//.//*[@title='Do not select if this computer is shared' and @type='checkbox']
		
		// xpath 
	}

}
