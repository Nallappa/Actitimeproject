package WebDriver_Pkg_0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver Obj1 = new FirefoxDriver();
		Obj1.get("http://localhost:89/login.do");
		Obj1.findElement(By.id("username")).sendKeys("admin");
		Obj1.findElement(By.name("pwd")).sendKeys("manager");
		Obj1.findElement(By.linkText("Login")).click();
	}

}
