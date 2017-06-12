package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminPageOrganization {

	// Organization setting
	@FindBy(xpath="//div[contains(text(),'Organization')]")
	public WebElement organizationSettingMenu;
	
	// Client sub menu
	@FindBy(xpath="//span[@class='label'][contains(text(),'Client')]")
	public WebElement clientSubMenu_Organization;	
	
	// Customer Project sub menu
	@FindBy(xpath="//span[@class='label'][contains(text(),'Customer')]")
	public WebElement customerProjectSubMenu_Organization;
	
	// Organization name
	//a[contains(text(),'feborgname')]
	
	// View Beneficiary 
	@FindBy(xpath="//i[contains(@class,'fa fa-users')]")
	public WebElement viewBeneficiaryBtn;
	
	// Add beneficiary button
	@FindBy(id="AddBtn")
	public WebElement addBtn_Beneficiary;
	
	// FirstName
	@FindBy(name="FirstName")
	public WebElement firstName_Beneficiary;
	
	// Middle Name
	@FindBy(name="MiddleName")
	public WebElement middleName_Beneficiary;
		
	// Last Name
	@FindBy(name="LastName")
	public WebElement lastName_Beneficiary;
	
	// Gender
	@FindBy(id="s2id_Gender")
	public WebElement gender_Beneficiary;
	
	// Official email id
	@FindBy(name="EmailId")
	public WebElement emailID_Beneficiary;
	
	// Employee number
	@FindBy(name="EmpNumber")
	public WebElement employeeNo_Beneficiary;
	
	// Claim
	@FindBy(id="s2id_Claim")
	public WebElement claim_Beneficiary;
	
	// Save button
	@FindBy(xpath="//button[@title='Save']")
	public WebElement saveBtn_Beneficiary;
	
	// Cancel button
	@FindBy(xpath="//a[@title='Cancel']")
	public WebElement cancelBtn_Beneficiary;
	
	//************* Customer Project Details Page ****************
	
	// Add button
	@FindBy(xpath="//button[contains(@title,'Add')]")
	public WebElement addBtn_CustomerProjectDetails_Organization;
	
	// Customer Name 
	@FindBy(name="CustomerName")
	public WebElement customerName_CustomerProjectDetails;
	
	// Address
	@FindBy(name="Address")
	public WebElement address_CustomerProjectDetails;
	
	// Base location
	@FindBy(id="s2id_BaseLocation")
	public WebElement baseLocationDropDown_CustomerProjectDetails;
	
	// state
	@FindBy(id="s2id_StateCode")
	public WebElement stateDropDown_CustomerProjectDetails;
	
	//city
	@FindBy(id="s2id_CityCode")
	public WebElement cityDropDown_CustomerProjectDetails;
	
	// postal code
	@FindBy(name="PostalCode")
	public WebElement postalCode_CustomerProjectDetails;
	
	// Account Manager Name
	@FindBy(name="AccountManagerName")
	public WebElement accountManagerName_CustomerProjectDetails;
	
	// Engagement manager name
	@FindBy(name="EngagementManagerName")
	public WebElement engagementManagerName_CustomerProjectDetails;
	
	// Save button 
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement saveBtn_CustomerProjectDetails;
	
	
	
	
	
	
	
	

}
