package WebDriver_Declaration_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main_Class_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Object_Class_01 objObject_Class_01 = new Object_Class_01();
		WebDriver d = new FirefoxDriver();
		
		d.get(objObject_Class_01.url);
		
		// Login
		d.findElement(By.id(objObject_Class_01._idtxtUsername)).sendKeys("admin");
		d.findElement(By.name(objObject_Class_01._nametxtPassword)).sendKeys("manager");
		d.findElement(By.id(objObject_Class_01.chkkeepMe)).click();
		d.findElement(By.id(objObject_Class_01.btnLogin)).click();
		
		Thread.sleep(5000);
		// Navigate Menu
		d.findElement(By.linkText(objObject_Class_01.mnuTask)).click();
		Thread.sleep(2000);
			d.findElement(By.linkText(objObject_Class_01.mnuTaskSubCompletedTasks)).click();
			d.findElement(By.linkText(objObject_Class_01.mnuTaskSubProject_Customers)).click();
			d.findElement(By.linkText(objObject_Class_01.mnuTaskSubArchives)).click();
			d.findElement(By.linkText(objObject_Class_01.mnuTaskSubOpenTasks)).click();
			
		d.findElement(By.linkText(objObject_Class_01.mnuTimeTrack)).click();
		Thread.sleep(2000);
			d.findElement(By.linkText(objObject_Class_01.mnuTimeTrackSubViewTimeTrack)).click();
			d.findElement(By.linkText(objObject_Class_01.mnuTimeTrackSubEnterTimeTrack)).click();
		d.findElement(By.linkText(objObject_Class_01.mnuReport)).click();
		Thread.sleep(2000);
		d.findElement(By.linkText(objObject_Class_01.mnuUsers)).click();
		Thread.sleep(2000);
		d.findElement(By.linkText(objObject_Class_01.mnuWorkSchedule)).click();
		Thread.sleep(2000);
		d.findElement(By.linkText(objObject_Class_01.lnkLogut)).click();
		
		d.quit();
	}

}
