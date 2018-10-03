package Action_6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;

public class HoverClass {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		HoverClass hc =  new HoverClass();
		//hc.hover_1();
		hc.hover_2();
	}
	
	public void hover_1() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.get("http://www.toolsqa.com/");

        Thread.sleep(5000);
        WebElement element = driver.findElement(By.linkText("TUTORIALS")); // difference b/w small and caps  
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Appium")).click();
        
        driver.quit();
	}
	
	public void hover_2() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        driver.get("http://www.toolsqa.com/");

        Thread.sleep(5000);
        WebElement element = driver.findElement(By.linkText("TUTORIALS"));

        //With some of the browser it happens that once mouse hover action is performed, 
        //the menu list disappear with in the fractions of seconds before Selenium identify the next submenu item and perform click action on it
        Actions action = new Actions(driver);
        action.moveToElement(element).moveToElement(driver.findElement(By.linkText("Appium"))).click().build().perform();

        Thread.sleep(5000);
        //  OTHER WAY
        WebElement element1 = driver.findElement(By.linkText("TRAININGS"));
        Actions action1 = new Actions(driver);
        action1.moveToElement(element1).perform();
        WebElement subElement = driver.findElement(By.linkText("Selenium Corporate Trainings"));
        action1.moveToElement(subElement);
        action1.click();
        action1.perform();
        
        driver.quit();
	}
	
	

}
