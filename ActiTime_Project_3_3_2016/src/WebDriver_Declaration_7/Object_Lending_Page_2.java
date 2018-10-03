package WebDriver_Declaration_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Lending_Page_2 {
	

//	Object_Lending_Page_2(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
	
	// Menu
	@FindBy(linkText = "Time-Track")
	WebElement mnuTimeTrack;
	
	
		@FindBy(linkText="View Time-Track") 
		WebElement mnuTimeTrackSubViewTimeTrack;
		
		@FindBy(linkText="Enter Time-Track")
		WebElement mnuTimeTrackSubEnterTimeTrack;
		
	
	@FindBy(linkText= "Tasks")
	WebElement mnuTask ;
	
	
		@FindBy(linkText="Open Tasks")
		WebElement mnuTaskSubOpenTasks;
		
		@FindBy(linkText="Completed Tasks")
		WebElement mnuTaskSubCompletedTasks;
		
		@FindBy(linkText="Projects & Customers")
		WebElement mnuTaskSubProject_Customers;
		
		@FindBy(linkText="Archives")
		WebElement mnuTaskSubArchives;
		
	
	@FindBy(linkText= "Reports")
	WebElement mnuReport ;
	
	
	@FindBy(linkText = "Users")
	WebElement mnuUsers;
	
	@FindBy(linkText = "Work Schedule")
	WebElement mnuWorkSchedule;
	

	// Methods
	
	public void mnuTimeTrackClick()
	{
		mnuTimeTrack.click();
	}	
	
		public void mnuTimeTrackSubViewTimeTrackClick()
		{
			mnuTimeTrackSubViewTimeTrack.click();
		}
		public void mnuTimeTrackSubEnterTimeTrackClick()
		{
			mnuTimeTrackSubEnterTimeTrack.click();
		}
	
	
	public void mnuTaskClick()
	{
		mnuTask.click();
	}
	
		public void mnuTaskSubOpenTasksClick()
		{
			mnuTaskSubOpenTasks.click();
		}
		
		public void mnuTaskSubCompletedTasksClick()
		{
			mnuTaskSubCompletedTasks.click();
		}
		
		public void mnuTaskSubProject_CustomersClick()
		{
			mnuTaskSubProject_Customers.click();
		}
		
		public void mnuTaskSubArchivesClick()
		{
			mnuTaskSubArchives.click();
		}
	
	public void mnuReportClick()
	{
		mnuReport.click();
	}
	
	public void mnuUsersClick()
	{
		mnuUsers.click();
	}

	public void mnuWorkScheduleClick()
	{
		mnuWorkSchedule.click();
	}

}
