package Working_with_Elements_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectCommands {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/Projects/Java Project/ActiTime_Project/src/Working_with_Elements_2/Example/Multi_Select.html");
		
		WebElement element=driver.findElement(By.name("Mobdevices"));
		Select se=new Select(element);
		
		
		se.selectByVisibleText("Nokia");
		se.selectByVisibleText("HTC");
		
		//To get all the options present in the dropdown
		List<WebElement> allOptions = se.getOptions();
		for (WebElement webElement : allOptions)
		{
			System.out.println(webElement.getText());
		}
		
		//To get all the options that are selected in the dropdown.
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
			System.out.println("You have selected::"+ webElement.getText());
		}
		 
		//To get the first selected option in the dropdown
		WebElement firstOption = se.getFirstSelectedOption();
		System.out.println("The First selected option is::" +firstOption.getText());
		
		if(se.isMultiple())
		{
		System.out.println("Select tag allows multiple selection");	
		}
		else
		{
			System.out.println("No multiple selection");
		}
	}

}
