package WebDriver_Pkg_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:89/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement btnPassword = driver.findElement(By.name("pwd"));
		
		
		driver.findElement(By.className("initial")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Time-Track")).click();
		driver.findElement(By.linkText("Tasks")).click();
		driver.findElement(By.linkText("Reports")).click();
		
		driver.quit();
	}

}
