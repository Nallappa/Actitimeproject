package Working_with_Elements_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * List of Elements 
		 * TextBox/Password -- done 
		 * Button -- done 
		 * Checkbox --done 
		 * Radio button -- Done 
		 * Weblist -- Done
		 * 		Dropdown - single 
		 * 		Dropdown - Multiple
		 *  
		 * Link -- done 
		 * WebText -- done 
		 * Table
		 * DatePicker
		 */

		WebDriver driver = new FirefoxDriver();
//		driver.get("http://localhost:89/login.do");
//
//		// Textbox -- Normal/ Password
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//
//		// CheckBox
//		driver.findElement(By.id("keepLoggedInCheckBox")).click();
//
//		// Link
//		driver.findElement(By.linkText("View License")).click();
//
//		// button // Click and Submit
//		driver.findElement(By.id("loginButton")).click();
//	//	driver.findElement(By.name("loginButton")).submit();
//
//		Thread.sleep(5000);
//		// WebText
//		String Str1 = driver.findElement(By.xpath(".//*[@id='enterTTMainContent']/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td")).getText();
//		System.out.println(Str1);

		// Facebook

		driver.get("https://www.facebook.com");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("David");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Morgan");
		driver.findElement(By.xpath("//input[@id='u_0_5']")).sendKeys("www.abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_8']")).sendKeys("www.abc@gmail.com");
		driver.findElement(By.id("u_0_a")).sendKeys("XYZ");
		
		WebElement objTextbox = driver.findElement(By.xpath("//input[@name='firstname']"));
		objTextbox.sendKeys("tesets");
		
		
		// WebList -- Single
		WebElement webmon = driver.findElement(By.id("month"));
		
		Select sel = new Select(webmon);
		sel.selectByVisibleText("May");
		
		
		WebElement webmon1 = driver.findElement(By.id("day"));
		Select sel1 = new Select(webmon1);
		sel1.selectByIndex(5);
				
		WebElement webmon2 = driver.findElement(By.id("year"));
		Select sel2 = new Select(webmon2);
		sel2.selectByValue("1985");
		
		
		// Radio button
		
		driver.findElement(By.id("u_0_d")).click();
		
		
		
		//driver.quit();

		//driver.findElement(By.id("loginButton")).click();

	}

}
