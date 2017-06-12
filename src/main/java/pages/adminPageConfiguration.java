package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminPageConfiguration {

	// Configuration Menu

	@FindBy(xpath = "//div[contains(text(),'Configuration')]")
	public WebElement configurationSetting;
	
	
	// ********************  Country type **********************
	
	// Country type setting
	@FindBy(xpath="//strong[contains(text(),'Country Type')]")
	public WebElement countryTypeSetting;
	
	// source country drop down
	@FindBy(id="s2id_SourceCountryCode")
	public WebElement sourceCountryDropDown_CountryType;
	
	// destination country drop down
	@FindBy(id="s2id_DestinationCountryCode")
	public WebElement destinationCountryDropDown_CountryType;
	
	// service code
	@FindBy(id="s2id_ServiceCode")
	public WebElement serviceDropDown_CountryType;
	
	// search button
	@FindBy(id="btnSearch")
	public WebElement searchBtn_CountryType;
	
	// clear button
	@FindBy(id="clearSearch")
	public WebElement clearcBtn_CountryType;
	
	
	// check box;
	//td[contains(text(),'Parent Visa')]/preceding-sibling::td/div
	
	
	// save button
	@FindBy(id="btnSave")
	public WebElement saveBtn_CountryType;
	
	// cancel button
	@FindBy(xpath="//button[contains(@title,'Cancel')][@onclick='cancelCountryType()']")
	public WebElement cancelBtn_CountryType;
	
	
	
	

	// ******************* Country Mapping ************************

	// Country Mapping setting
	@FindBy(xpath = "//strong[contains(text(),'Country Mapping')]")
	public WebElement countryMappingSetting;

	// Add country Mapping button
	@FindBy(xpath = "//button[contains(@title,'Add')]")
	public WebElement addCountryMappingBtn;

	// Source Country Drop Down
	@FindBy(id = "s2id_ddlSourceCountry")
	public WebElement countryMapping_SourceCountry_DropDown;

	// Source Country Drop Down input box
	@FindBy(xpath = "//input[@id='s2id_autogen5_search']")
	public WebElement countryMapping_SourceCountry_DropDownInputBox;

	// Search box
	@FindBy(xpath = "//input[@aria-controls='tblAddCountryMapping']")
	public WebElement countryMapping_DataTableSearchBox;

	// Save country mapping button
	@FindBy(id = "btnSaveCountryMapping")
	public WebElement saveCountryMappingBtn;

	// Cancel country mapping button
	@FindBy(xpath = "//button[contains(@title,'Cancel')]")
	public WebElement cancelCountryMappingBtn;

	// ************************ Country Assignment Role
	// ****************************

	// Country Assignment Role setting
	@FindBy(xpath = "//strong[contains(text(),'Country Assignment Roles')]")
	public WebElement countryAssignmentRoleSetting;

	// Country Assignment Role input search box
	@FindBy(xpath = "//div[@id='ms-AssignmentSelect']/div[@class='ms-selectable']/input")
	public WebElement countryAssignmentRole_DataTableSearchBox;

	// td[contains(text(),'United States')]/following-sibling::td[3]/div/button

	// Country Assignment selectSearchBox
	@FindBy(xpath = "//div[@id='ms-AssignmentSelect']/div[@class='ms-selectable']/input")
	public WebElement selectSearchBoxCountryAssignmentRole;

	// div[@id='ms-AssignmentSelect']/div[@class='ms-selectable']/ul/li/span[contains(text(),'A1')]

	// Save country assignment role setting
	@FindBy(id = "btnSave")
	public WebElement saveCountryAssignmentRole;

	// Cancel country assignment role setting
	@FindBy(xpath = "//button[@title='Cancel']")
	public WebElement cancelCountryAssignmentRole;

	// ************************ Country Immigration Role
	// *********************************

	// Country Immigration Role Setting
	@FindBy(xpath = "//strong[contains(text(),'Country Immigration Roles')]")
	public WebElement countryImmigrationRoleSetting;

	// Country Immigration Role input search box
	@FindBy(xpath = "//div[@id='ms-ImmigrationSelect']/div[@class='ms-selectable']/input")
	public WebElement countryImmigrationRole_DataTableSearchBox;

	// td[contains(text(),'United States')]/following-sibling::td[3]/div/button

	// Country Immigration select search box
	@FindBy(xpath = "//div[@id='ms-ImmigrationSelect']/div[@class='ms-selectable']/input")
	public WebElement selectSearchBoxCountryImmigrationRole;

	// div[@id='ms-ImmigrationSelect']/div[@class='ms-selectable']/ul/li/span[contains(text(),'System
	// Analyst')]

	// Save country immigration role setting
	@FindBy(id = "btnSave")
	public WebElement saveCountryImmigrationRole;

	// Cancel country immigration role setting
	@FindBy(xpath = "//button[@title='Cancel']")
	public WebElement cancelCountryImmigrationRole;

	// ***************************** Country Travel Purpose  ***********************

	// Country Travel Purpose setting
	@FindBy(xpath = "//strong[contains(text(),'Country Travel Purpose')]")
	public WebElement countryTravelPurposeSetting;

	// Add country travel purpose
	@FindBy(id = "btnAddCountryTravelPurpose")
	public WebElement addCountryTravelPurpose;

	// Country travel purpose drop down
	@FindBy(id = "s2id_ddlCountryCode")
	public WebElement countryDropDown_TravelPurpose;

	// Country travel purpose drop down input box
	@FindBy(id = "s2id_autogen3_search")
	public WebElement countryDropDownInputBox_TravelPurpose;

	// Save country travel purpose
	@FindBy(id = "btnSave")
	public WebElement saveCountryTravelPurpose;

	// Cancel country travel purpose
	@FindBy(xpath = "//button[@title='Cancel']")
	public WebElement cancelCountryTravelPurpose;

	//input[@value='Proposal Presentations']/following-sibling::label

	// *********************** Assignment Immigration Role ********************************

	// Assignment Immigration Role
	@FindBy(xpath = "//strong[contains(text(),'Assignment Immigration Role Mapping')]")
	public WebElement assignmentImmigrationRoleSetting;

	// Data table search box
	@FindBy(xpath = "//input[@aria-controls='MIRTable']")
	public WebElement assignmentImmigrationRole_DataTableSearchBox;

	// td[contains(text(),'A1')]/following-sibling::td[3]/div/button

	// Assignment Role Search box
	@FindBy(xpath = "//div[@id='ms-AssignmentImmigrationSelect']/div[@class='ms-selectable']/input")
	public WebElement searchAssignmentRole_AssignmentImmigrationRole;

	//div[@id='ms-AssignmentImmigrationSelect']/div[@class='ms-selectable']/ul/li/span[contains(text(),'System Analyst')]

	// Save button
	@FindBy(id = "btnSave")
	public WebElement saveBtn_AssignmentImmigrationRole;

	// Cancel Button
	@FindBy(xpath = "//button[contains(@title,'Cancel')]")
	public WebElement cancelBtn_AssignmentImmigrationRole;

	// ************************** Country Type Form  *******************************

	// Country Type Form setting
	@FindBy(xpath = "//strong[contains(text(),'Country Type Form')]")
	public WebElement countryTypeFormSetting;

	// Source Country
	@FindBy(id = "s2id_SourceCountry")
	public WebElement sourceCountryDropDown_CountryTypeForm;

	// Destination Country
	@FindBy(id = "s2id_DestinationCountry")
	public WebElement destinationCountryDropDown_CountryTypeForm;

	// Service drop down
	@FindBy(id = "s2id_Service")
	public WebElement serviceDropDown_CountryTypeForm;

	// Type drop down
	@FindBy(id = "s2id_Type")
	public WebElement typeDropDown_CountryTypeForm;

	// Search button
	@FindBy(id = "btnSearch")
	public WebElement searchBtn_CountryTypeForm;

	// Clear button
	@FindBy(xpath = "//button[contains(@title,'Clear')]")
	public WebElement clearBtn_CountryTypeForm;

	// Add country type form button
	@FindBy(xpath = "//a[@id='btnAdd']/div")
	public WebElement addBtn_CountryTypeForm;

	// select check box
	// td[contains(text(),'masterlegalform-name')]/preceding-sibling::td/div/label

	// select dependents
	// td[contains(text(),'masterlegalform-name')]/following-sibling::td/div[@title='select
	// dependents']

	// Save button
	@FindBy(id = "btnSave")
	public WebElement saveBtn_CountryTypeForm;

	// Cancel button
	@FindBy(xpath = "//button[@type='reset'][@onclick='cancelCountryTypeForm()']")
	public WebElement cancelBtn_CountryTypeForm;

	// ***************************** Support Letter ***********************

	// Support letter setting
	@FindBy(xpath = "//strong[contains(text(),'Support Letter')]")
	public WebElement supportLetterSetting;
	
	// Add support letter
	@FindBy(xpath="//button[contains(@title,'Add SupportLetter')]")
	public WebElement addBtn_SupportLetter;
	
	// Source Country Drop Down
	@FindBy(id="s2id_SourceCountry")
	public WebElement sourceCountry_SupportLetter;
	
	// Destination Country Drop Down
	@FindBy(id="s2id_DestinationCountry")
	public WebElement destinationCountry_SupportLetter;
	
	// Service Drop Down
	@FindBy(id="s2id_Service")
	public WebElement service_SupportLetter;
	
	// Type Drop Down
	@FindBy(id="s2id_Type")
	public WebElement type_SupportLetter;
	
	// Document Name
	@FindBy(id="DocumentName")
	public WebElement documentName_SupportLetter;
	
	// Display Name
	@FindBy(id="DisplayName")
	public WebElement displayName_SupportLetter;
	
	// Description
	@FindBy(id="Description")
	public WebElement description_SupportLetter;
	
	// Save Button
	@FindBy(id="Save")
	public WebElement saveBtn_SupportLetter;
	
	// Cancel Button
	@FindBy(id="Close")
	public WebElement cancelBtn_SupportLetter;
	
	//************************** Deputation Letter *******************************
	
	// Deputation letter setting
	@FindBy(xpath="//strong[contains(text(),'Deputation Letter')]")
	public WebElement deputationLetterSetting;
	
	
	// Add depuation letter drop down
	@FindBy(id="depushow")
	public WebElement addBtn_DeputationLetter;
	
	// Source country drop down
	@FindBy(id="s2id_SourceCountry")
	public WebElement sourceCountryDropDown_DepuationLetter;
	
	// Destination Country drop down
	@FindBy(id="s2id_DestinationCountry")
	public WebElement destinationCountryDropDown_DepuationLetter;
	
	// Service drop down
	@FindBy(id="s2id_Service")
	public WebElement serviceDropDown_DeputationLetter;
	
	// Type drop down
	@FindBy(id="s2id_Type")
	public WebElement typeDropDown_DepuationLetter;	
	
	// Document Name
	@FindBy(name="DocumentName")
	public WebElement documentName_DeputationLetter;
	
	// Display Name
	@FindBy(name="DisplayName")
	public WebElement displayName_DeputationLetter;
	
	// Description 
	@FindBy(name="Description")
	public WebElement description_DepuatationLetter;
	
	//Save button
	@FindBy(id="Save")
	public WebElement saveBtn_DepuatationLetter;
	
	//Cancel button
	@FindBy(id="close")
	public WebElement cancelBtn_DepuationLetter;
	
	
	
	// ****************************** User Defined Keyword ****************

	// User defined keyword setting
	@FindBy(xpath = "//strong[contains(text(),'User Defined Keyword')]")
	public WebElement userDefinedKeywordSetting;

	// Add button
	@FindBy(xpath = "//button[contains(@title,'Add')]")
	public WebElement addBtn_UserDefinedKeyword;

	// Text
	@FindBy(name = "Text")
	public WebElement text;

	// Value
	@FindBy(name = "Value")
	public WebElement value;

	// Save button
	@FindBy(id = "btnSave")
	public WebElement saveBtn_UserDefinedKeyword;

	// Cancel button
	@FindBy(xpath = "//button[contains(@title,'Cancel')]")
	public WebElement cancelBtn_UserDefinedKeyword;

	//*************************** Education Evaluation ***********************
	
	// Education Evaluation Setting
	@FindBy(xpath="//strong[contains(text(),'Education Evaluation')]")
	public WebElement educationEvaluationSetting;
	
	// Source Country
	@FindBy(id="s2id_country")
	public WebElement sourceCountryDropDown_EducationEvaluation;
	
	// Destination Country
	@FindBy(id="s2id_dcountry")
	public WebElement destinationCountryDropDown_EducationEvaluation;
	
	// Service
	@FindBy(id="s2id_service")
	public WebElement service_EducationEvaluation;
	
	// Type
	@FindBy(id="s2id_type")
	public WebElement type_EducationEvaluation;
	
	// Search button
	@FindBy(id="searchDocument")
	public WebElement searchBtn_EducationEvaluation;
	
	// Cancel button
	@FindBy(xpath="//button[contains(@title,'Clear')]")
	public WebElement cancelBtn_EducationEvaluation;	
	
	// Add button
	@FindBy(xpath="//button[@id='show']")
	public WebElement addBtn_EducationEvaluation;
	
	//************************* Authorized signatory **********************************
	
	// Authorized signatory setting
	@FindBy(xpath="//strong[contains(text(),'Authorized Signatory')]")
	public WebElement authorizedSignatorySetting;
	
	// Add button
	@FindBy(xpath="//button[@title='Add']")
	public WebElement addBtn_AuthorizedSignatory;
	
	// Is employe drop down
	@FindBy(id="s2id_is-employ")
	public WebElement isEmployeeDropDown_AuthorizedSignatory;
	
	// Name
	@FindBy(name="FirstName")
	public WebElement firstName_AuthorizedSignatory;
	
	// Middle Name
	@FindBy(name="MiddleName")
	public WebElement middleName_AuthorizedSignatory;
	
	// Last Name
	@FindBy(name="LastName")
	public WebElement lastName_AuthorizedSignatory;
	
	// Designation
	@FindBy(name="Designation")
	public WebElement designation_AuthorizedSignatory;
	
	// Phone Number
	@FindBy(name="PhoneNumber")
	public WebElement phoneNumber_AuthorizedSignatory;
	
	// Email id
	@FindBy(name="EmailID")
	public WebElement emailId_AuthorizedSignatory;
	
	// Company Name
	@FindBy(name="CompanyName")
	public WebElement companyName_AuthorizedSignatory;
	
	// Postal Code
	@FindBy(name="PostalCode")
	public WebElement postalCode_AuthorizedSignatory;
	
	//Country Drop Down
	@FindBy(id="s2id_Country")
	public WebElement countryDropDown_AuthorizedSignatory;
	
	// State Drop Down
	@FindBy(id="s2id_State") 
	public WebElement stateDropDown_AuthorizedSignatory;
	
	// City Drop Down
	@FindBy(id="s2id_City")
	public WebElement cityDropDown_AuthorizedSignatory;
	
	// Address 1 
	@FindBy(name="AddressLine1")
	public WebElement addressLine1_AuthorizedSignatory;
	
	// Address 2
	@FindBy(name="AddressLine2")
	public WebElement addressLine2_AuthorizedSignatory;
	
	// Signature
	@FindBy(id="btnSaveImage")
	public WebElement uploadBtn_AuthorizedSignatory;
	
	// Save button
	@FindBy(id="saveSignatory")
	public WebElement saveBtn_AuthorizedSignatory;
	
	// Cancel Button
	@FindBy(xpath="//button[contains(@title,'Cancel')]")
	public WebElement cancelBtn_AuthorizedSignatory;
		
	
	//***********************  Claim menu mapping ********************
	
	// claim menu mapping setting
	@FindBy(xpath="//strong[contains(text(),'Claim Menu Mapping')]")
	public WebElement claimMenuMappingSetting;
	
	// add button
	@FindBy(id="btnAddNewMapping")
	public WebElement addBtn_ClaimMenuMapping;
	
	// claim drop down
	@FindBy(id="s2id_ddlClaim")
	public WebElement claimDropDown_ClaimMenuMapping;
	
	// Non selected search input box
	@FindBy(xpath="//input[contains(@class,'filterunSelected')]")
	public WebElement inputSearchBoxNonSelected;
	
	// Move all button
	@FindBy(xpath="//button[contains(@title,'Move all')]")
	public WebElement moveAll;
	
	// save button
	@FindBy(id="btnSave")
	public WebElement saveBtn_ClaimMenuMapping;
	
	// cancel button
	@FindBy(xpath="//button[contains(@title,'Cancel')]")	
	public WebElement cancelBtn_ClaimMenuMapping;
	
	
	//************************ Workflow ***************************
	
	// Workflow setting
	@FindBy(xpath="//strong[contains(text(),'Workflow')]")
	public WebElement workFlowSetting;
	
}
