package SSL_PopUp_08;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SSL_Example {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		try {
			Process pb=new ProcessBuilder("D:\\selenium\\ActiTime_Project\\src\\File_Upload_Download_10\\SSL_auth.exe").start();
		} catch (IOException e1) {
//			D:\Selenium\ActiTime_Project\src\File_Upload_Download_10
			
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
//		WinWaitActive("Authentication Required");
//		Send("admin");
//		Send("{TAB}");
//		Send("admin");
//		Send("{TAB}");
//		Send("{ENTER}");
		
		
		
		
		
//		//upDown.download();
		 
		
	}

}
