package Working_with_Elements_2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Table_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com/automation-practice-table");
		
		//Here we are storing the value from the cell in to the string variable
		WebElement tabl = driver.findElement(By.className("tsc_table_s13"));
		List<WebElement> tableRows = tabl.findElements(By.tagName("tr"));
		

		for(int rnum=0;rnum<tableRows.size();rnum++)
		{
			List<WebElement> columns=tableRows.get(rnum).findElements(By.tagName("td"));
			System.out.println("Number of columns:"+columns.size());
			for(int cnum=0;cnum<columns.size();cnum++)
			{
				System.out.println(columns.get(cnum).getText());
							
			}
			System.out.println(" ");
		}
		
		
		
	}
}