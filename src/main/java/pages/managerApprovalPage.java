package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class managerApprovalPage {

	// Approval menu
	@FindBy(xpath="//div[text()='Approval']")
	public WebElement approvalMenu;
	
	// Awaiting for approval sub menu
	@FindBy(xpath="//span/i[@class='fa fa-hourglass-start']")
	public WebElement awaitingForApprovalSubMenu;
	
	// Rejected cases
	@FindBy(xpath="//span/i[@class='fa fa-square']")
	public WebElement rejectedCases;
	
	// Approved cases
	@FindBy(xpath="//span/i[@class='fa fa-check-square-o']")
	public WebElement approvedCases;
	
	// Remarks page
	@FindBy(xpath="//textarea[@id='remarks']")
	public WebElement remarks;
	
	// Save button
	@FindBy(id="btnsave")
	public WebElement saveBtn_ApprovedCases;
	
	

	
	
}
