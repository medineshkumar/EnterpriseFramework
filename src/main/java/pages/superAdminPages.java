package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class superAdminPages {

	// Master Modules Menu

	@FindBy(xpath = "//div[contains(text(),'Master Modules')]")
	public WebElement masterModuleSetting;

	// *****************************************************************

	// License Module
	@FindBy(xpath = "//strong[contains(text(),'License')]")
	public WebElement licenseSetting;

	// Add License Button
	@FindBy(xpath = "//button[@id='show']")
	public WebElement addLicenseBtn;

	// Product Type Drop Down
	@FindBy(id = "s2id_ddlProductType")
	public WebElement productTypeDropDown;

	// Product Type Drop Down Input Box
	@FindBy(id = "s2id_autogen1_search")
	public WebElement producTypeDropDownInputBox;

	// Stream Type Drop Down
	@FindBy(id = "s2id_ddlStreamType")
	public WebElement streamTypeDropDown;

	// Stream Type Drop Down Input Box
	@FindBy(id = "s2id_autogen2_search")
	public WebElement streamTypeDropDownInputBox;

	// Organization Name
	@FindBy(name = "Name")
	public WebElement organizationName;

	// Contact First Name
	@FindBy(name = "ContactName")
	public WebElement contactFirstName;

	// Contact Last Name
	@FindBy(name = "ContactLastName")
	public WebElement contactLastname;

	// Contact Email
	@FindBy(name = "ContactEmail")
	public WebElement contactEmail;

	// Contact Number
	@FindBy(name = "ContactPhone")
	public WebElement contactNumber;

	// Alternate Contact Number
	@FindBy(name = "AlternatePhone")
	public WebElement alternateContactNumber;

	// Validity Start Date
	@FindBy(id = "ValidityStartDate")
	public WebElement validityStartDate;

	// Validity End Date
	@FindBy(id = "ValidityEndDate")
	public WebElement validityEndDate;

	// URL
	@FindBy(name = "URL")
	public WebElement URL;

	// Input Date Format Drop Down
	@FindBy(id = "s2id_inputDate")
	public WebElement inputDateFormatDropDown;

	// Input Date Format Drop Down Input Box
	@FindBy(id = "s2id_autogen3_search")
	public WebElement inputDateFormatDropDownInputBox;

	// Display Date Format Drop Down
	@FindBy(id = "s2id_outputDate")
	public WebElement displayDateFormatDropDown;

	// Display Date Format Drop Down Input Box
	@FindBy(id = "s2id_autogen4_search")
	public WebElement displayDateFormatInputBox;

	// Domain
	@FindBy(name = "domain")
	public WebElement domain;

	// Time Zone Drop Down
	@FindBy(id = "s2id_timeZone")
	public WebElement timeZoneDropDown;

	// Time Zone Drop Down Input Box
	@FindBy(id = "s2id_autogen5_search")
	public WebElement timeZoneDropDownInputBox;

	// Save License Button
	@FindBy(id = "btnSave")
	public WebElement saveLicenseBtn;

	// Cancel License Button
	@FindBy(id = "btnCancel")
	public WebElement cancelLicenseBtn;


	// Xpath for edit-
	// //td[contains(text(),'new@updated.com')]/following-sibling::td/div/button[1]
	
	// Xpath for delete-
	// //td[contains(text(),'new@updated.com')]/following-sibling::td/div/button[2]
	
	// Xpath for Subscription-
	// //td[contains(text(),'new@updated.com')]/following-sibling::td/div/button[3]
	
	// Xpath for Users-
	// //td[contains(text(),'new@updated.com')]/following-sibling::td/div/a

	//********************************************************************
	

	//Embassy Master Setting
	@FindBy(xpath="//img[contains(@src,'embassy')]")
	public WebElement embassyMasterSetting;
	
		//Add button
		@FindBy(id="btnEmbassyMaster")
		public WebElement addEmbassyMasterBtn;
		
		//Source Country Drop Down
		@FindBy(id="s2id_embassySourceCountryCode")
		public WebElement sourceCountryEmbassyMaster;
		
		//Source Country Drop Down input box
		@FindBy(id="s2id_autogen15_search")
		public WebElement sourceCountryDropDownInputBoxEmbassyMaster;		
		
		//Destination Country Drop Down
		@FindBy(id="s2id_embassyDestinationCountryCode")
		public WebElement destinationCountryEmbassyMaster;
				
		//Destination Country Drop Down input box
		@FindBy(xpath="//div[@id='s2id_embassyDestinationCountryCode']/a/following::input[1]")
		public WebElement destinationCountryDropDownInputBoxEmbassyMaster;
		
		//Sample destination drop down input
		@FindBy(xpath="//div[@id='select2-drop']/div/input")
		public WebElement destinationCountryDropDownInputBoxEmbassyMaster1;
				
		//Type Drop Down
		@FindBy(id="s2id_ddlType")
		public WebElement typeDropDownEmbassyMaster;
				
		//Type Drop Down input box
		@FindBy(id="s2id_autogen3_search")
		public WebElement typeDropDownInputBoxEmbassyMaster;
		
		//title
		@FindBy(name="txtembassytitle")
		public WebElement titleEmbassy;
		
		//officer in charge
		@FindBy(name="txtembassyoffice")
		public WebElement officerInChargeEmbassyMaster;
		
		//Address1
		@FindBy(name="txtembassyAddress1")
		public WebElement address1EmbassyMaster;
		
		//Address 2
		@FindBy(name="txtembassyAddress2")
		public WebElement address2EmbassyMaster;
		
		//State Drop Down
		@FindBy(id="s2id_ddlembassystate")
		public WebElement stateDropDownEmbassyMaster;
				
		//State Drop Down input box
		@FindBy(id="s2id_autogen13_search")
		public WebElement stateDropDownInputBoxEmbassyMaster;
		
		//State drop down input box sample 
		@FindBy(xpath="//div[@class='select2-search']/input")
		public WebElement stateDropDownInputBoxEmbassyMaster1;
		
		//City Drop Down
		@FindBy(id="s2id_ddlembassyCity")
		public WebElement cityDropDownEmbassyMaster;
						
		//City Drop Down input box
		@FindBy(id="s2id_autogen14_search")
		public WebElement cityDropDownInputBoxEmbassyMaster;
		
		//State jurisdiction
		@FindBy(id="s2id_ddljurisdiction")
		public WebElement stateJurisdictionEmbassyMaster;				
		
		//Postal Code 
		@FindBy(name="txtembassyZip")
		public WebElement postalCodeEmbassyMaster;
		
		//Save button
		@FindBy(id="btnembassySave")
		public WebElement saveEmbassyMasterBtn;
		
		//Cancel Button
		@FindBy(xpath="//button[contains(@title,'Cancel')]")
		public WebElement cancelEmbassyMasterBtn;	
	
}
