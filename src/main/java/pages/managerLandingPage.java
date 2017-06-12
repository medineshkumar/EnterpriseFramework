package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class managerLandingPage {

	// My records setting
	@FindBy(xpath = "//*[contains(text(),'MY RECORDS')]")
	public WebElement myRecordsSetting_Dashboard;

	// Apply for visa
	@FindBy(xpath = "//*[contains(text(),'APPLY FOR VISA')]")
	public WebElement applyForVisaSetting_Dashboard;

	// Approval
	@FindBy(xpath = "//*[contains(text(),'APPROVAL')]")
	public WebElement approvalSetting_Dashboard;

	// My profile
	@FindBy(xpath = "//*[contains(text(),'MY PROFILE')]")
	public WebElement myProfileSetting_Dashboard;
	
	

}
