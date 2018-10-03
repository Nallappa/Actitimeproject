package POI_Connection_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Object_PO_Lending_Page_03 {

	private static WebElement element = null;

	public static WebElement mnuTimeTrack(WebDriver d) {
		element = d.findElement(By.linkText("Time-Track"));
		return element;
	}

	public static WebElement mnuTimeTrackSubViewTimeTrack(WebDriver d) {
		element = d.findElement(By.linkText("View Time-Track"));
		return element;
	}

	public static WebElement mnuTimeTrackSubEnterTimeTrack(WebDriver d) {
		element = d.findElement(By.linkText("Enter Time-Track"));
		return element;
	}

	public static WebElement mnuTask(WebDriver d) {
		element = d.findElement(By.linkText("Tasks"));
		return element;
	}

	public static WebElement mnuTaskSubOpenTasks(WebDriver d) {
		element = d.findElement(By.linkText("Open Tasks"));
		return element;
	}

	public static WebElement mnuTaskSubCompletedTasks(WebDriver d) {
		element = d.findElement(By.linkText("Completed Tasks"));
		return element;
	}

	public static WebElement mnuTaskSubProject_Customers(WebDriver d) {
		element = d.findElement(By.linkText("Projects & Customers"));
		return element;
	}

	public static WebElement mnuTaskSubArchives(WebDriver d) {
		element = d.findElement(By.linkText("Archives"));
		return element;
	}

	public static WebElement mnuReport(WebDriver d) {
		element = d.findElement(By.linkText("Reports"));
		return element;
	}

	public static WebElement mnuUsers(WebDriver d) {
		element = d.findElement(By.linkText("Users"));
		return element;
	}

	public static WebElement mnuWorkSchedule(WebDriver d) {
		element = d.findElement(By.linkText("Work Schedule"));
		return element;
	}

}
