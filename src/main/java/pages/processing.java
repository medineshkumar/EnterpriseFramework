package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class processing {

	// Advance search
	@FindBy(xpath="//span[contains(text(),'Processing Tracker')]")
	public WebElement processingTracker;	

	// Expand option
	// small[contains(text(),'BeneficiaryFname')]/parent::span/parent::p/parent::div/parent::div/following-sibling::div/span/small/a[1]/span/i

	// Processing btn
	@FindBy(xpath = "//a[contains(text(),'Processing')]")
	public WebElement processingBtn;	
	
	
	// Questionnaire icon
	@FindBy(xpath = "//div[@id='Questionnaireclick']")
	public WebElement questionnaireSetting_Processing;
	
	// Questionnaire verified
	@FindBy(xpath="//a[@id='quesCompleted']")
	public WebElement questionVerifiedBtn_Processing;

	// Documents icon
	@FindBy(xpath = "//div[@id='Documentsclick']")
	public WebElement documentsSetting_Processing;
	
	// Documents verified
	@FindBy(xpath="//a[@id='docUploadCompleted']")
	public WebElement documentsVerified_Processing;

	// Case verification
	@FindBy(xpath = "//div[@id='CaseVerificationclick']")
	public WebElement caseVerificationSetting_Processing;
	
	// Action drop down case verification
	@FindBy(xpath="//div[@id='s2id_ddlCaseApprover']")
	public WebElement actionDropDown_CaseVerification_Processing;
	
	// Remarks case verification
	@FindBy(name="txtRemarks")
	public WebElement remarks_CaseVerification_Processing;
	
	// Save button case verification
	@FindBy(name="btnSave")
	public WebElement saveBtn_CaseVerification_Processing;

	


}
