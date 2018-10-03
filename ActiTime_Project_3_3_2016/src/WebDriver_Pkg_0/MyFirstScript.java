//working with web link
//1. navigate to gmail.com
//2. click on "need help?"

package WebDriver_Pkg_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com./");
		//driver.findElement(By.id("link-forgot-passwd")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Need help?')]")).click();
		driver.findElement(By.linkText("Need help?")).click();

		
		
		
	//	driver.quit();
		
	}

}
