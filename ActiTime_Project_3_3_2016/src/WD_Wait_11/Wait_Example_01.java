package WD_Wait_11;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Example_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d = new FirefoxDriver();
		
		
		d.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		d.get("http://localhost:89/login.do");
		
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.MINUTES);
		// Implicit wait
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Explicit Wait
		// Launch the web browser and open url
		// Enter a valid username
		// Enter a valid password
		// Click on the login in button
		// Wait for element to be visible after page load

		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.id("loginButton")).click();
	
		Thread.sleep(5000);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Tasks")));
		
		// click on the compose button as soon as the "compose" button is
		// visible

		d.findElement(By.linkText("Tasks")).click();
		
		
		


	}

}
