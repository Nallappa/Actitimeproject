package Working_with_Elements_2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Dynamic_Table_2 {

//	Launch new Browser
//	Open URL “http://www.toolsqa.com/automation-practice-table/”
//	Get the value from cell ‘Dubai’ and print it on the console
//	Click on the link ‘Detail’ of the first row and last column
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com/automation-practice-table");
		
		//Here we are storing the value from the cell in to the string variable
		String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(sCellValue);
		
		// Here we are clicking on the link of first row and the last column
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
		driver.close();
		
	}

}
