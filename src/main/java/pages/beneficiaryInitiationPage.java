package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class beneficiaryInitiationPage {

	// Apply for visa menu
	@FindBy(xpath = "//div[contains(text(),'Apply For Visa')]")
	public WebElement applyForVisaMenu;

	// Residing country
	@FindBy(id = "s2id_ddlSource")
	public WebElement residingCountryDropDown;

	// Country, purpose of request, type
	@FindBy(name = "txtServiceTypeSearch")
	public WebElement destinationCountry;

	// Travel purspose drop down
	@FindBy(id = "s2id_ddlTravelPrupose")
	public WebElement travelPurposeDropDown;

	// Travel purpose Description
	@FindBy(name = "txtTravelDescription")
	public WebElement travelPurposeDescription;

	// Initiate button
	@FindBy(name = "btnInitiate")
	public WebElement initiateBtn;

	// Submit case initiation page
	@FindBy(name = "btnRuleCheckSubmitCase")
	public WebElement submitCase_Initial;

	// Modal OK button
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement okModalBtn;

	// Summary tab
	@FindBy(xpath = "//li[contains(text(),'Summary')]")
	public WebElement summaryTab;

	// Questionnaire tab
	@FindBy(xpath = "//li[contains(text(),' Questionnaire')]")
	public WebElement questionnaireTab;
	
	// Questionnaire completed button
	@FindBy(xpath="//a[@id='quesCompleted']")
	public WebElement questionnaireCompletedBtn;

	// Documents tab
	@FindBy(xpath = "//li[contains(text(),'Documents')]")
	public WebElement documentsTab;
	
	// Document uploaded button
	@FindBy(xpath="//a[@id='docUploadCompleted']")
	public WebElement documentsUploadedBtn;
	
	// Submit case summary page
	@FindBy(xpath="//a[@id='updateStatus']")
	public WebElement submitCase_Summary;
	
	
	
	

}
