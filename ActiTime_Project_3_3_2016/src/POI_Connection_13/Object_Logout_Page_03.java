package POI_Connection_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Object_Logout_Page_03 {

		private static WebElement element = null;

		public static WebElement lnkLogut(WebDriver d) {
			element = d.findElement(By.linkText("Logout"));
			return element;
		}
}
