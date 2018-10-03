package alert_Windows_4;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {

//	1) Launch new Browser
//	2) Open URL “http://www.toolsqa.com/automation-practice-switch-windows/”
//	3) Get Window name (Use GetWindowHandle command)
//	4) Click on Button “New Message Window”, it will open a Pop Up Window
//	5) Get all the Windows name ( Use GetWindowHandles command)
//	6) Close the Pop Up Window (Use Switch Command to shift window)
	
	
	
//	GetWindowHandle Command
//	Purpose: To get the window handle of the current window.
//	
//	GetWindowHandles Command
//	Purpose: To get the window handle of all the current windows.
//	
//	SwitchTo Window Command
//	Purpose: WebDriver supports moving between named windows using the “switchTo” method.
//	
//	SwitchTo Frame Command
//	Purpose: WebDriver supports moving between named frames using the “switchTo” method.
//	
//	
//	SwitchTo PopUp Command
//	Purpose: WebDriver supports moving between named PopUps using the “switchTo” method. 
//	After you’ve triggered an action that opens a popup, you can access the alert and it will return the currently open alert object. 
//	With this object you can now accept, dismiss, read its contents or even type into a prompt. 
//	This interface works equally well on alerts, confirms, and prompts.
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Create a new instance of the Firefox driver
		 
        WebDriver driver = new FirefoxDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL
        driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");

        // Store and Print the name of the First window on the console
        String handle= driver.getWindowHandle();
        System.out.println(" First Window: "+ handle);

        // Click on the Button "New Message Window"
        driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();

        // Store and Print the name of all the windows open	              
        Set handles = driver.getWindowHandles();
        System.out.println("All windows: " + handles);

        // Pass a window handle to the other window
        for (String handle1 : driver.getWindowHandles()) {
        	System.out.println(handle1);
        	driver.switchTo().window(handle1);        	
        	}

        // Closing Pop Up window
        driver.close();

        // Close Original window
        driver.quit();

	}

}
