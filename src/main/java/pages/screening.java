package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class screening {

	// Advance search
	@FindBy(xpath="//span[contains(text(),'Advance Search')]")
	public WebElement advanceSearch;	

	// Expand option
	// small[contains(text(),'BeneficiaryFname')]/parent::span/parent::p/parent::div/parent::div/following-sibling::div/span/small/a[1]/span/i

	// Screening btn
	@FindBy(xpath = "//a[contains(text(),'Screening')]")
	public WebElement screeningBtn;
	
	
	//i[@class='fa fa-arrow-circle-right']
	
	// Questionnaire icon
	@FindBy(xpath = "//div[@id='Questionnaireclick']")
	public WebElement questionnaireSetting_Screening;
	
	// Questionnaire verified
	@FindBy(xpath="//a[@id='quesCompleted']")
	public WebElement questionVerifiedBtn_Screening;

	// Documents icon
	@FindBy(xpath = "//div[@id='Documentsclick']")
	public WebElement documentsSetting_Screening;
	
	// Documents verified
	@FindBy(xpath="//a[@id='docUploadCompleted']")
	public WebElement documentsVerified_Screening;

	// Case verification
	@FindBy(xpath = "//div[@id='CaseVerificationclick']")
	public WebElement caseVerificationSetting_Screening;
	
	// Action drop down case verification
	@FindBy(xpath="//div[@id='s2id_ddlCaseApprover']")
	public WebElement actionDropDown_CaseVerification_Screening;
	
	// Remarks case verification
	@FindBy(name="txtRemarks")
	public WebElement remarks_CaseVerification_Screening;
	
	// Save button case verification
	@FindBy(name="btnSave")
	public WebElement saveBtn_CaseVerification_Screening;

	
}
