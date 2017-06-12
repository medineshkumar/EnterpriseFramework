package admin;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericClasses.Browser;
import genericClasses.FileUpload;
import genericClasses.Login;
import pages.adminPageSystemSetting;
import testData.CreateServiceData;
import testData.createAssignmentRoleData;
import testData.createDocumentCategoryData;
import testData.createDocumentData;
import testData.createEducationEvaluatorData;
import testData.createImmigrationRoleData;
import testData.createLicenseVendorData;
import testData.createMasterLegalFormData;
import testData.createMileStoneFieldData;
import testData.createTravelPurposeData;
import testData.createTypeData;

public class SystemSettings {

	static WebDriver driver;

	String appURL = "http://10.0.5.80/EnterpriseQA/";
	ExtentReports report = new ExtentReports("Z:\\ImmidartEnterprise\\Automation\\Report\\report.html", true);
	ExtentTest test;	


	@Test(enabled = false,dataProvider="createMasterLegalForm",dataProviderClass=createMasterLegalFormData.class)
	public void addMasterLegalForm(String name, String description, String pdf, String template) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);

		loginObj.adminLogin();

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);
		
		test = report.startTest("Add master legal form", "Creates master legal form");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));

		adminPageObj.systemSettingMenu.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.masterLegalFormsSetting));

		adminPageObj.masterLegalFormsSetting.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addMasterLegalFormBtn));
				
		adminPageObj.addMasterLegalFormBtn.click();

	    //wait.until(ExpectedConditions.visibilityOf(adminPageObj.codeMasterForm));

		//adminPageObj.codeMasterForm.sendKeys("MLFCode" + RandomStringUtils.randomAlphabetic(5));

		adminPageObj.nameMasterForm.sendKeys(name);

		adminPageObj.descriptionMasterDescription.sendKeys(description);

		adminPageObj.pdfFileMasterDescription.click();

		Thread.sleep(1000);

		FileUpload.uploadFile(pdf);

		Thread.sleep(2500);

		adminPageObj.templateFileMasterDescription.click();

		Thread.sleep(1000);

		FileUpload.uploadFile(template);

		Thread.sleep(2500);

	//	adminPageObj.saveMasterLegalFormBtn.click();
		
		test.log(LogStatus.INFO, "Master legal form created successfully");
		
		System.out.println("Master legal form created succesfully");
		
		report.endTest(test);

	}
	
	@Test(enabled = false,dataProvider="createAssignmentRole",dataProviderClass=createAssignmentRoleData.class)
	public void addAssignmentRole(String Description) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);
		
		test = report.startTest("Add assignment role", "Creates master assignment role");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));
		adminPageObj.systemSettingMenu.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.assignmentRoleSetting));
		adminPageObj.assignmentRoleSetting.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addAssignmentRoleBtn));
		Thread.sleep(2000);
		adminPageObj.addAssignmentRoleBtn.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.assignmentDescription));
		adminPageObj.assignmentDescription.sendKeys(Description);

/*		Actions action = new Actions(driver);
		action.moveToElement(adminPageObj.saveAssignmentRoleBtn).click().build().perform();*/
		Thread.sleep(2000);
		//adminPageObj.saveAssignmentRoleBtn.click();
		
		test.log(LogStatus.INFO, "Assignment role created successfully");
		
		System.out.println("Assignment role created succesfully");
		
		report.endTest(test);

	}
	
	@Test(enabled = false,dataProvider="createImmigrationRole",dataProviderClass=createImmigrationRoleData.class)
	public void addImmigrationRole(String Description) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);
		
		test = report.startTest("Add immigration role", "Creates master immigration role");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));
		adminPageObj.systemSettingMenu.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.immigrationRoleSetting));
		adminPageObj.immigrationRoleSetting.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addImmigrationRoleBtn));
		Thread.sleep(2000);
		adminPageObj.addImmigrationRoleBtn.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.immigrationDescription));
		adminPageObj.immigrationDescription.sendKeys(Description);

		Thread.sleep(2000);
	//	adminPageObj.saveImmigrationRoleBtn.click();
		
		test.log(LogStatus.INFO, "Immigration role is created successfully");
		
		System.out.println("Immigration role created succesfully");
		
		report.endTest(test);

	}
	
	@Test(enabled = false,dataProvider="createDocumentCategory", dataProviderClass=createDocumentCategoryData.class)
	public void addDocumentCategory(String name, String description) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);
		
		test = report.startTest("Add document category", "Creates master document category");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));
		adminPageObj.systemSettingMenu.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.documentCategorySetting));

		adminPageObj.documentCategorySetting.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addDocumentCategoryBtn));

		adminPageObj.addDocumentCategoryBtn.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.documentCategoryName));

		adminPageObj.documentCategoryName.sendKeys(name);

		adminPageObj.documentCategoryDescription.sendKeys(description);

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.saveDocumentCategoryBtn));
		//adminPageObj.saveDocumentCategoryBtn.click();
		
		test.log(LogStatus.INFO, "Document category created successfully");
		
		System.out.println("Document category created succesfully");
		
		report.endTest(test);

	}
	
	@Test(enabled = false,dataProvider="createDocument",dataProviderClass=createDocumentData.class,dependsOnMethods={"addDocumentCategory"}	)
	public void addDocument(String documentCategory,String name,String description,String displayName) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);
		
		test = report.startTest("Add document", "Create master document");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.systemSettingMenu));
		adminPageObj.systemSettingMenu.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.documentsSetting));
		Thread.sleep(2000);
		adminPageObj.documentsSetting.click();

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addDocumentBtn));
		adminPageObj.addDocumentBtn.click();

		//wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.documentCategoryDropDown));
		
		Thread.sleep(2000);

	/*	adminPageObj.documentCategoryDropDown.click();
		
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.documentCategoryDropDownInputBox));
		adminPageObj.documentCategoryDropDownInputBox.sendKeys(documentCategory, Keys.ENTER);*/

		adminPageObj.documentName.sendKeys(name);

		adminPageObj.documentDescription.sendKeys(description);

		adminPageObj.documentDisplayName.sendKeys(displayName);
				
		adminPageObj.beneficiaryApplicable.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.saveDocumentBtn));
		//adminPageObj.saveDocumentBtn.click();
		
		test.log(LogStatus.INFO, "Document created successfully");
		
		System.out.println("Document created succesfully");
		
		report.endTest(test);
	}
	
	@Test(enabled = false,dataProvider="createTravelPurpose",dataProviderClass=createTravelPurposeData.class)
	public void addTravelPurpose(String name, String description) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);
		
		test = report.startTest("Add travel purpose", "Creates master travel purpose");

		WebDriverWait wait = new WebDriverWait(driver, 30);		
		
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));		
		adminPageObj.systemSettingMenu.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.travelPurposeSetting));
		adminPageObj.travelPurposeSetting.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addTravelPurposeBtn));

		adminPageObj.addTravelPurposeBtn.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.travelPurposeName));

		adminPageObj.travelPurposeName.sendKeys(name);

		adminPageObj.travelPurposeDescription.sendKeys(description);

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.saveTravelPurposeBtn));
	//	adminPageObj.saveTravelPurposeBtn.click();
		
		test.log(LogStatus.INFO, "Travel purpose created succesfully");
		
		System.out.println("Travel purpose created succesfully");
		
		report.endTest(test);

	}
	
	
	
	
	@Test(enabled = false,dataProvider="createMileStoneField", dataProviderClass=createMileStoneFieldData.class)
	public void addMileStoneField(String name, String description) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Add milestone", "Creates master milestone");

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));
		adminPageObj.systemSettingMenu.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", adminPageObj.milestoneFieldsSetting);
		
		Thread.sleep(1000);

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.milestoneFieldsSetting));
		adminPageObj.milestoneFieldsSetting.click();
		
		Thread.sleep(1000);

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addMileStoneFieldBtn));
		adminPageObj.addMileStoneFieldBtn.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.nameMileStoneField));

		adminPageObj.nameMileStoneField.sendKeys(name);
		adminPageObj.descriptionMileStoneField.sendKeys(description);

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.saveMileStoneFieldBtn));
		//adminPageObj.saveMileStoneFieldBtn.click();
		
		test.log(LogStatus.INFO, "Milestone is created successfully");
		
		System.out.println("Milestone created succesfully");
		
		report.endTest(test);

	}	
	
	
	@Test(enabled=false,dataProvider="createLicenseVendor",dataProviderClass=createLicenseVendorData.class)
	public void addLicenseVendor(String vendorType, String vendorName, String vendorContactPerson,
			String vendorContactEmail, String vendorContactNumber,
			String validityStartDate, String validityEndDate, String URL ) throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Add milestone", "Creates master milestone");

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));
		adminPageObj.systemSettingMenu.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", adminPageObj.licenseVendorSetting);
		
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.licenseVendorSetting));
		adminPageObj.licenseVendorSetting.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addLicenseVendorBtn));
		Thread.sleep(2000);
		adminPageObj.addLicenseVendorBtn.click();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(adminPageObj.vendorTypeDropDown).click();		
		act.sendKeys(vendorType,Keys.ARROW_DOWN,Keys.ENTER);
		act.build().perform();
		
		adminPageObj.vendorName.sendKeys(vendorName);
		adminPageObj.contactPerson_LicenseVendor.sendKeys(vendorContactPerson);
		adminPageObj.contactPersonEmailID_LicenseVendor.sendKeys(vendorContactEmail);
		adminPageObj.contactNumber_LicenseVendor.sendKeys(vendorContactNumber);
		adminPageObj.validityStartDate_LicenseVendor.sendKeys(validityStartDate);
		adminPageObj.validityEndDate_LicenseVendor.sendKeys(validityEndDate);
		adminPageObj.url_LicenseVendor.sendKeys(URL);
		
		//adminPageObj.saveBtn_LicenseVendor.click();
			
		
	}
	
	

		/*
		 * 
		 * feature removed as on 25 may 2017
		 * 
		 * 
	
	@Test(enabled = false,dataProvider="createService",dataProviderClass=CreateServiceData.class)
	public void addService(String serviceCode, String description) {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();
		
		test = report.startTest("CreateService", "Create Master Service");

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));
		adminPageObj.systemSettingMenu.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.serviceSetting));
		adminPageObj.serviceSetting.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addServiceBtn));
		adminPageObj.addServiceBtn.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.serviceCode));
		adminPageObj.serviceCode.sendKeys(serviceCode);

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.serviceDescription));
		adminPageObj.serviceDescription.sendKeys(description);

		// adminPageObj.saveServiceBtn.click();
		
		test.log(LogStatus.INFO,"Service created successfully");
		
		System.out.println("Service created succesfully");
		
		report.endTest(test);

	}
	
	@Test(enabled = false,dataProvider="createType",dataProviderClass=createTypeData.class)
	public void addType(String service, String typeCode, String typeDescription, String category) throws InterruptedException{

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();
		
		test = report.startTest("CreateType","Create Master Type");

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));
		
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));
		adminPageObj.systemSettingMenu.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.typeSetting));
		adminPageObj.typeSetting.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addTypeBtn));
		adminPageObj.addTypeBtn.click();
		
		Thread.sleep(1000);
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(adminPageObj.serviceDropDown_Type).click();
		act1.sendKeys(service,Keys.ARROW_DOWN,Keys.ENTER);
		act1.build().perform();
		
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.typeCode));
		adminPageObj.typeCode.sendKeys(typeCode);		

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.typeDescription));
		adminPageObj.typeDescription.sendKeys(typeDescription);
		
		Thread.sleep(1000);
		
		Actions act2 = new Actions(driver);
		act2.moveToElement(adminPageObj.categoryDropDown_Type).click();
		act2.sendKeys(category,Keys.ARROW_DOWN,Keys.ENTER);
		act2.build().perform();
		
		Thread.sleep(1000);

		//adminPageObj.saveTypeBtn.click();
		
		test.log(LogStatus.INFO,"Service created successfully");
		
		System.out.println("Type created succesfully");
		
		report.endTest(test);

	}

	@Test(enabled = false)
	public void addProgressTrackerCategory() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPages adminPageObj = PageFactory.initElements(driver, adminPages.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));

		adminPageObj.systemSettingMenu.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.progressTrackerCategorySetting));

		adminPageObj.progressTrackerCategorySetting.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.addProgresstrackerCategoryBtn));

		adminPageObj.addProgresstrackerCategoryBtn.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.progressTrackerCategoryDescription));

		adminPageObj.progressTrackerCategoryDescription.sendKeys("PTCDesc" + RandomStringUtils.randomAlphabetic(20));

		adminPageObj.saveProgressTrackerCategoryBtn.click();

	}

	@Test(enabled = false)
	public void addProgressTrackerFields() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPages adminPageObj = PageFactory.initElements(driver, adminPages.class);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));

		adminPageObj.systemSettingMenu.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.progressTrackerFieldsSetting));

		adminPageObj.progressTrackerFieldsSetting.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.addProgressTrackerFieldBtn));

		adminPageObj.addProgressTrackerFieldBtn.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.progressTrackerFieldsDropDown));

		adminPageObj.progressTrackerFieldsDropDown.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.progressTrackerFieldsDropDownInputBox));
		adminPageObj.progressTrackerFieldsDropDownInputBox.sendKeys("PTCDesc", Keys.ENTER);

		adminPageObj.progressTrackerFieldsDescription.sendKeys("PTFDesc" + RandomStringUtils.randomAlphabetic(20));

		adminPageObj.saveProgressTrackerFieldsBtn.click();

	}

	@Test(enabled = false)
	public void addSystemDefinedKeyword() throws InterruptedException, AWTException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPages adminPageObj = PageFactory.initElements(driver, adminPages.class);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));

		adminPageObj.systemSettingMenu.click();

		Thread.sleep(2500);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", adminPageObj.systemDefinedKeywordSetting);

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemDefinedKeywordSetting));
		adminPageObj.systemDefinedKeywordSetting.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.addSystemDefinedKeywordBtn));

		adminPageObj.addSystemDefinedKeywordBtn.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.keyword));

		adminPageObj.keyword.sendKeys("SDk" + RandomStringUtils.randomAlphabetic(5));

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemDefinedKeywordDescription));
		adminPageObj.systemDefinedKeywordDescription.sendKeys("SDKDesc" + RandomStringUtils.randomAlphabetic(20));

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.sourceTableDropDown));

		adminPageObj.sourceTableDropDown.click();
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.sourceTableDropDownInputBox));
		adminPageObj.sourceTableDropDownInputBox.sendKeys("educationcategory", Keys.ENTER);

		Thread.sleep(2500);

		adminPageObj.sourceColumnDropDown.click();
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.sourceColumnDropDownInputBox));
		adminPageObj.sourceColumnDropDownInputBox.sendKeys("description", Keys.ENTER);

		adminPageObj.saveSystemDefinedKeywordBtn.click();

	}
	

	@Test(enabled = false,dataProvider="createEducationEvaluator",dataProviderClass=createEducationEvaluatorData.class)
	public void addeducationEvaluator(String fname, String mname, String lname, String emailid, String educationCategory) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageSystemSetting adminPageObj = PageFactory.initElements(driver, adminPageSystemSetting.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		test = report.startTest("Add education evaluator", "Creates education evaluator");
		
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));
		adminPageObj.systemSettingMenu.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", adminPageObj.educationEvaluatorSetting);

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.educationEvaluatorSetting));
		adminPageObj.educationEvaluatorSetting.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.addEducationEvaluationBtn));
		adminPageObj.addEducationEvaluationBtn.click();

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.firstNameEducationEvaluation));
		
		adminPageObj.firstNameEducationEvaluation.sendKeys(fname);
		adminPageObj.middleNameEducationEvaluation.sendKeys(mname);
		adminPageObj.lastNameEducationEvaluation.sendKeys(lname);

		adminPageObj.emailIdEducationEvaluation.sendKeys(emailid);

		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.evaluationCategoryDropDown));
		adminPageObj.evaluationCategoryDropDown.click();
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.evaluationCategoryDropDownInputBox));
		adminPageObj.evaluationCategoryDropDownInputBox.sendKeys(educationCategory, Keys.ENTER);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(adminPageObj.evaluationCategoryDropDown));
		//adminPageObj.saveEducationEvaluationBtn.click();
		
		test.log(LogStatus.INFO, "Education evalator created successfully");
		
		System.out.println("Education evaluator created succesfully");
		
		report.endTest(test);

	} */

	
/*
	@Test(enabled = false)
	public void addEmbassyMaster() throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPages adminPageObj = PageFactory.initElements(driver, adminPages.class);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(adminPageObj.systemSettingMenu));

		adminPageObj.systemSettingMenu.click();

		Thread.sleep(2500);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", adminPageObj.embassyMasterSetting);

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.embassyMasterSetting));

		adminPageObj.embassyMasterSetting.click();

		wait.until(ExpectedConditions.visibilityOf(adminPageObj.addEmbassyMasterBtn));

		adminPageObj.addEmbassyMasterBtn.click();

		Thread.sleep(2000);

		adminPageObj.sourceCountryEmbassyMaster.click();
		Thread.sleep(1500);
		adminPageObj.sourceCountryDropDownInputBoxEmbassyMaster.sendKeys("india", Keys.ARROW_DOWN, Keys.ENTER);

		Thread.sleep(3000);

		adminPageObj.destinationCountryEmbassyMaster.click();
		Thread.sleep(2500);
		adminPageObj.destinationCountryDropDownInputBoxEmbassyMaster1.sendKeys("united states", Keys.ARROW_DOWN,
				Keys.ENTER);

		Thread.sleep(2000);

		adminPageObj.typeDropDownEmbassyMaster.click();
		adminPageObj.typeDropDownInputBoxEmbassyMaster.sendKeys("embassy", Keys.ENTER);

		adminPageObj.titleEmbassy.sendKeys("ETitle" + RandomStringUtils.randomAlphabetic(4));

		adminPageObj.officerInChargeEmbassyMaster.sendKeys("EOFICharge" + RandomStringUtils.randomAlphabetic(5));

		adminPageObj.address1EmbassyMaster.sendKeys("EAdd1" + RandomStringUtils.randomAlphabetic(20));
		adminPageObj.address2EmbassyMaster.sendKeys("EAdd2" + RandomStringUtils.randomAlphabetic(20));

		adminPageObj.stateDropDownEmbassyMaster.click();
		Thread.sleep(1500);

		new Actions(driver).sendKeys("tamil nadu", Keys.ARROW_DOWN, Keys.ENTER).perform();

		// adminPageObj.stateDropDownInputBoxEmbassyMaster1.sendKeys("tamil
		// nadu", Keys.ENTER);

		Thread.sleep(2500);

		adminPageObj.cityDropDownEmbassyMaster.click();

		// adminPageObj.cityDropDownInputBoxEmbassyMaster.sendKeys("chennai",
		// Keys.ENTER);

		new Actions(driver).sendKeys("chennai", Keys.ARROW_DOWN, Keys.ENTER).perform();

		adminPageObj.postalCodeEmbassyMaster.sendKeys("12345");

		Thread.sleep(2500);

		/*
		 * adminPageObj.stateJurisdictionEmbassyMaster.click();
		 * adminPageObj.stateJurisdictionEmbassyMaster.sendKeys("tamil nadu",
		 * Keys.ENTER, "karnataka", Keys.ENTER);
		 */
/*
		Actions action = new Actions(driver);
		action.moveToElement(adminPageObj.stateJurisdictionEmbassyMaster);
		action.click();
		action.sendKeys("tamil nadu", Keys.ENTER);
		action.build().perform();

	}
	*/

	@AfterMethod(enabled = true)
	public void clean() {
		driver.close();
		driver.quit();
	}
	
	@AfterTest
	public void flush(){
		report.flush();
	}

}
