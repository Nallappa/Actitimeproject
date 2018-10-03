package File_Upload_Download_10;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Upload_Example {

	static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		File_Upload_Example upDown = new File_Upload_Example();
			upDown.upload();
		
		/// Download
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();

		 try {
			Process pb=new ProcessBuilder("D:\\Projects\\Java Project\\ActiTime_Project\\src\\File_Upload_Download_10\\Downloading_File.exe","firefox","D:\\Projects\\Java Project\\ActiTime_Project\\src\\File_Upload_Download_10\\new.txt","10").start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void download()
	{
		driver.get("http://the-internet.herokuapp.com/download");
		
		try {
			Runtime.getRuntime().exec("D:\\selenium\\ActiTime_Project\\src\\File_Upload_Download_10\\Download.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public void upload()
	{
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("D:\\selenium\\ActiTime_Project\\src\\File_Upload_Download_10\\Upload_Files.txt");		
		driver.findElement(By.id("file-submit")).click();
		
	}

}
