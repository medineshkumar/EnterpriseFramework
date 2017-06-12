package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class beneficiaryLandingPage {

	//  Apply for visa setting
	@FindBy(xpath="//*[contains(text(),'APPLY FOR VISA')]")
	public WebElement applyForVisaSetting_Dashboard;
	
	// My records setting
	@FindBy(xpath="//*[contains(text(),'MY RECORDS')]")
	public WebElement myRecordsSetting_Dashboard;
	
	// My profile setting
	@FindBy(xpath="//*[contains(text(),'MY PROFILE')]")
	public WebElement myProfileSetting_Dashboard;
	
	
	
	
}
