package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminPageSystemSetting {

	/* System Settings */

	// System Setting Menu
	@FindBy(xpath = "//div[contains(text(),'System Settings')]")
	public WebElement systemSettingMenu;
	
	//-----------------------------------------------------------
	
	//Master Legal Forms Setting
	@FindBy(xpath="//strong[contains(text(),'Master Legal Form')]")
	public WebElement masterLegalFormsSetting;
	
		//Add button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addMasterLegalFormBtn;
		
		//Code
		@FindBy(name="FormCode")
		public WebElement codeMasterForm;
		
		//Name
		@FindBy(name="Name")
		public WebElement nameMasterForm;
		
		//Description
		@FindBy(name="Description")
		public WebElement descriptionMasterDescription;
		
		//PDF File
		@FindBy(id="btnAttachPdf")
		public WebElement pdfFileMasterDescription;
		
		//Template File
		@FindBy(id="btnAttachTemplate")
		public WebElement templateFileMasterDescription;
		
		//Save Master legal form button
		@FindBy(id="btnSave")
		public WebElement saveMasterLegalFormBtn;
		
		//Cancel Master legal form button
		@FindBy(id="btnClose")
		public WebElement cancelMasterLegalFormBtn;		
		
	//-----------------------------------------------------------
	
	
	// Service Setting
	@FindBy(xpath = "//img[contains(@src,'service')]")
	public WebElement serviceSetting;
	
		//Add Service button
		@FindBy(id="btnAddService")
		public WebElement addServiceBtn;
		
		//Service code
		@FindBy(name="txtSerCode")
		public WebElement serviceCode;
		
		//Service description
		@FindBy(name="txtSerDesc")
		public WebElement serviceDescription;
		
		//Save service button
		@FindBy(id="btnServiceSave")
		public WebElement saveServiceBtn;
		
		//Cancel service button
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelServiceBtn;
				
		
	//-----------------------------------------------------------

	// Type Setting
	@FindBy(xpath = "//img[contains(@src,'type')]")
	public WebElement typeSetting;
	
		//Add Type button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addTypeBtn;
	
		//Service Drop Down
		@FindBy(xpath="//span[@id='select2-chosen-2']")
		public WebElement serviceDropDown;
		
		// ServiceDrop Down
		@FindBy(id="s2id_Service")
		public WebElement serviceDropDown_Type;
			
		//Service Drop down input box
		@FindBy(xpath="//input[@id='s2id_autogen2_search']")
		public WebElement serviceDropDownInputBox;
		
		//Type code
		@FindBy(name="TypeCode")
		public WebElement typeCode;
		
		// Type Description
		@FindBy(name="TypeDescription")
		public WebElement typeDescription;		
		
		//Category Drop Down
		@FindBy(xpath="//span[@id='select2-chosen-3']")
		public WebElement categoryDropDown;
		
		//Category drop down
		@FindBy(id="s2id_ddlCategory")
		public WebElement categoryDropDown_Type;
		
		// Category Drop down input box
		@FindBy(xpath="//input[@id='s2id_autogen3_search']")
		public WebElement categoryDropDownInputBox;
		
		//Save type button
		@FindBy(id="btnSave")
		public WebElement saveTypeBtn;
		
		//Cancel type button
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelTypeBtn;
		
	
	//-----------------------------------------------------------	

	// Assignment Role Setting
	@FindBy(xpath = "//img[contains(@src,'assignment')]")
	public WebElement assignmentRoleSetting;
	
		//Add Assignment Role
		@FindBy(id="btnAddLicenseAssignment")
		public WebElement addAssignmentRoleBtn;
		
		//Description
		@FindBy(xpath="//label[text()='Description']/following-sibling::input")
		public WebElement assignmentDescription;
		
		//Save Assignment Role
		@FindBy(id="btnLicenseAssignSave")
		public WebElement saveAssignmentRoleBtn;
		
		//Cancel Assignment Role
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelAssignmentRoleBtn;
		
	
	//-----------------------------------------------------------

	// Immigration Role Setting
	@FindBy(xpath = "//img[contains(@src,'immigration')]")
	public WebElement immigrationRoleSetting;
	
		//Add immigration role button
		@FindBy(id="btnAddImmigrationRole")
		public WebElement addImmigrationRoleBtn;
		
		//Description
		@FindBy(name="txtImmiRoleDescription")
		public WebElement immigrationDescription;
		
		//Save Immigration 
		@FindBy(id="btnSaveImmigrationRole")
		public WebElement saveImmigrationRoleBtn;
		
		//Cancel Immigration 
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelImmigrationRoleBtn;
	
	
	//-----------------------------------------------------------

	// Document Category Setting
	@FindBy(xpath="//img[contains(@src,'document')]")
	public WebElement documentCategorySetting;
		
		//Add Document Category Button
		@FindBy(id="btnAddDocumentCategory")
		public WebElement addDocumentCategoryBtn;
		
		//Document Name
		@FindBy(name="txtDocumentName")
		public WebElement documentCategoryName;
		
		//Document Description
		@FindBy(name="txtDocuemtDescription")
		public WebElement documentCategoryDescription;
			
		//Save Document 
		@FindBy(id="btnSaveDocumentCategory")
		public WebElement saveDocumentCategoryBtn;
		
		//Cancel Document 
		@FindBy(id="btnDocumentCancel")
		public WebElement cancelDocumentCategoryBtn;
		
		
	
	//-----------------------------------------------------------
	
	//Documents Setting
	@FindBy(xpath="//img[contains(@src,'legal')]")
	public WebElement documentsSetting;
	
		//Add button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addDocumentBtn;
		
		//Document Category drop down
		@FindBy(id="s2id_DocumentCategory")
		public WebElement documentCategoryDropDown;
		
		//Document Category drop down input box
		@FindBy(id="s2id_autogen4_search")
		public WebElement documentCategoryDropDownInputBox;
		
		//Document Name 
		@FindBy(name="DocumentName")
		public WebElement documentName;
		
		//Document Name Description
		@FindBy(name="Description")
		public WebElement documentDescription;
		
		//Document Display Name
		@FindBy(name="DisplayName")
		public WebElement documentDisplayName;	
		
		
		// Document applicable beneficiary
		@FindBy(xpath="//label[@for='benichk']")
		public WebElement beneficiaryApplicable;
		
		// Document applicable spouse
		@FindBy(xpath="//label[@for='spousechk']")
		public WebElement spouseApplicable;
		
		// Document applicable child
		@FindBy(xpath="//label[@for='childchk']")
		public WebElement chileApplicable;
		
		//Document Save Button
		@FindBy(id="MDocbtnSave")
		public WebElement saveDocumentBtn;
		
		//Document Cancel Button
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement documentCancelButton;
		
		
	
	//-----------------------------------------------------------
	
	//Progress Tracker Category Setting
	@FindBy(xpath="//img[contains(@src,'progress-tracker-category')]")
	public WebElement progressTrackerCategorySetting;
	
		//Add button
		@FindBy(xpath="//i[contains(@class,'icon-plus')]")
		public WebElement addProgresstrackerCategoryBtn;
		
		//Progress tracker category description
		@FindBy(name="Description")
		public WebElement progressTrackerCategoryDescription;
		
		//Save button
		@FindBy(id="btnSave")
		public WebElement saveProgressTrackerCategoryBtn;
		
		//Cancel Button
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelProgressTrackerCategoryBtn; 
		
		
	//-----------------------------------------------------------
	
	//Progress Tracker Fields Setting
	@FindBy(xpath="//strong[contains(text(),'Progress Tracker Field')]")
	public WebElement progressTrackerFieldsSetting;
	
		//Add button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addProgressTrackerFieldBtn;
	
		//Progress Tracker Fields Drop Down
		@FindBy(id="select2-chosen-1")
		public WebElement progressTrackerFieldsDropDown;
		
		//Progress Tracker Fields Drop Down Input box
		@FindBy(id="s2id_autogen1_search")
		public WebElement progressTrackerFieldsDropDownInputBox;
		
		//Progress Tracker Fields Description
		@FindBy(name="Description")
		public WebElement progressTrackerFieldsDescription;
		
		//Progress tracker fields save button
		@FindBy(id="btnSave")
		public WebElement saveProgressTrackerFieldsBtn;
		
		
		
			
	//--------------------------------------------------------------
	
	//Travel Purpose Setting
	@FindBy(xpath="//img[contains(@src,'country-travel-purpose')]")
	public WebElement travelPurposeSetting;
	
		//Add button
		@FindBy(id="btnAddTravel")
		public WebElement addTravelPurposeBtn;
	
		//travel purpose name
		@FindBy(name="txtdTravelName")
		public WebElement travelPurposeName;
		
		//Travel purpose description
		@FindBy(name="txtdTravelDescription")
		public WebElement travelPurposeDescription;
		
		//Save travel purpose
		@FindBy(id="btnSave")
		public WebElement saveTravelPurposeBtn;
		
		//Cancel travel purpose
		@FindBy(xpath="//button[@title='Cancel']")
		public WebElement cancelTravelPurposeBtn;
		
			
	//---------------------------------------------------------------
	
	//System Defined Keyword Setting
	@FindBy(xpath="//img[contains(@src,'keywords')]")
	public WebElement systemDefinedKeywordSetting;
	
		//Add button
		@FindBy(id="btnAdd")
		public WebElement addSystemDefinedKeywordBtn;		
	
		//Name 
		@FindBy(name="Keyword")
		public WebElement keyword;
		
		//Description
		@FindBy(name="Description")
		public WebElement systemDefinedKeywordDescription;
		
		//Source Table drop down
		@FindBy(xpath="//div[@id='s2id_SourceTable']")
		public WebElement sourceTableDropDown;
		
		//Source Table drop down inputBox
		@FindBy(id="s2id_autogen1_search")
		public WebElement sourceTableDropDownInputBox;
		
		//Source Column drop down
		@FindBy(xpath="//div[@id='s2id_SourceColumn']")
		public WebElement sourceColumnDropDown;
				
		//Source Table drop down inputBox
		@FindBy(id="s2id_autogen2_search")
		public WebElement sourceColumnDropDownInputBox;
		
		//Save system defined keyword
		@FindBy(id="btnSave")
		public WebElement saveSystemDefinedKeywordBtn;
		
		//Cancel System defined Keyword
		@FindBy(id="btnCancel")
		public WebElement cancelSystemDefinedKeywordBtn;
	
	//---------------------------------------------------------------
	
	
	//Education Evaluator Setting
	@FindBy(xpath="//img[contains(@src,'education')]")
	public WebElement educationEvaluatorSetting;
	
		//Add education evaluator button
		@FindBy(xpath="//button[@title='Add']")
		public WebElement addEducationEvaluationBtn;		
		
		//First Name
		@FindBy(name="FirstName")
		public WebElement firstNameEducationEvaluation;
		
		//Middle Name
		@FindBy(name="MiddleName")
		public WebElement middleNameEducationEvaluation;
		
		//Last Name
		@FindBy(name="LastName")
		public WebElement lastNameEducationEvaluation;
	
		//Email id
		@FindBy(name="EmailID")
		public WebElement emailIdEducationEvaluation;
		
		//Evaluation category Drop Down
		@FindBy(xpath="//div[@id='s2id_EducationEvaluationCategory']")
		public WebElement evaluationCategoryDropDown;
		
		//Evaluation Category Drop down input box
		@FindBy(id="s2id_autogen1_search")
		public WebElement evaluationCategoryDropDownInputBox;
		
		//Save button
		@FindBy(id="audit_submit")
		public WebElement saveEducationEvaluationBtn;
		
		//Cancel button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelEducationEvaluationBtn;
		
	
	//----------------------------------------------------------
	

	//Milestone Fields Setting
	@FindBy(xpath="//strong[contains(text(),'Mile Stone Fields')]")
	public WebElement milestoneFieldsSetting;
	
		//Add button
		@FindBy(xpath="//i[contains(@class,'icon-plus')]")
		public WebElement addMileStoneFieldBtn;
		
		//Name
		@FindBy(name="Name")
		public WebElement nameMileStoneField;
		
		//Description
		@FindBy(name="Description")
		public WebElement descriptionMileStoneField;
		
		//Is auto updated
		@FindBy(xpath="//label[contains(@for,'is')]")
		public WebElement isAutoUpdated;
		
		//Save button
		@FindBy(id="btnSave")
		public WebElement saveMileStoneFieldBtn;
		
		//Cancel Button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelMileStoneFieldBtn;
	
	
	//---------------------------------------------------------
	
		
	// License vendor setting
		@FindBy(xpath="//strong[contains(text(),'License Vendor')]")
		public WebElement licenseVendorSetting;
		
		
		// add license vendor button
		@FindBy(id="btnAddVendor")
		public WebElement addLicenseVendorBtn;
		
		// vendor type drop down
		@FindBy(id="s2id_ddlvendortype")
		public WebElement vendorTypeDropDown;
		
		// vendor name 
		@FindBy(name="txtvendorname")
		public WebElement vendorName;
		
		// contact person name
		@FindBy(name="txtcontactperson")
		public WebElement contactPerson_LicenseVendor;
		
		// contact person email id
		@FindBy(name="txtcontactpersonmail")
		public WebElement contactPersonEmailID_LicenseVendor;
		
		// contact number
		@FindBy(name="txtcontactnumber")
		public WebElement contactNumber_LicenseVendor;
		
		// validity start date
		@FindBy(name="txtstartdate")
		public WebElement validityStartDate_LicenseVendor;
		
		// validity end date
		@FindBy(name="txtenddate")
		public WebElement validityEndDate_LicenseVendor;
		
		// url
		@FindBy(name="txturl")
		public WebElement url_LicenseVendor;
		
		// save button
		@FindBy(id="btnvendorsave")
		public WebElement saveBtn_LicenseVendor;
		
		// cancel button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelBtn_LicenseVendor;
		
		
		
}
