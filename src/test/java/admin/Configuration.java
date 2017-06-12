package admin;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import genericClasses.Browser;
import genericClasses.FileUpload;
import genericClasses.Login;
import pages.adminPageConfiguration;
import testData.addAuthorizedSignatoryData;
import testData.assignmentImmigrationRoleMappingData;
import testData.countryAssignmentRoleData;
import testData.countryImmigrationRoleData;
import testData.countryTravelPurpose;
import testData.countryTypeData;
import testData.countryTypeForm;
import testData.createCountryMappingData;
import testData.createUserDefindedKeywordData;
import testData.deputationLetterData;
import testData.educationEvaluationData;
import testData.supportLetterData;

public class Configuration {

	
	
	static WebDriver driver;

	String appURL = "http://10.0.5.80/EnterpriseQA/";
	
	ATUTestRecorder recorder ;
	
	ExtentReports report = new ExtentReports("Z:\\ImmidartEnterprise\\Automation\\Report\\configurationReport.html", true);
	ExtentTest test;

	@Test(enabled = false, dataProvider = "createCountryMapping", dataProviderClass = createCountryMappingData.class)
	public void createCountryMapping(String srcCountry, String destCountry) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();
		
		test = report.startTest("Create country mapping", "Map destination countries to source country");

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryMappingSetting.click();

		Thread.sleep(2000);

		configurationObj.addCountryMappingBtn.click();

		Thread.sleep(2000);

		configurationObj.countryMapping_SourceCountry_DropDown.click();
		Thread.sleep(1000);
		configurationObj.countryMapping_SourceCountry_DropDownInputBox.sendKeys(srcCountry, Keys.ARROW_DOWN,
				Keys.ENTER);

		Thread.sleep(2000);

		String[] destinationCountry = destCountry.split(",");

		for (int i = 0; i < destinationCountry.length; i++) {
			configurationObj.countryMapping_DataTableSearchBox.clear();
			configurationObj.countryMapping_DataTableSearchBox.sendKeys(destinationCountry[i]);
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//td[contains(text(),'" + destinationCountry[i] + "')]/preceding-sibling::td/div"))
					.click();
			Thread.sleep(1000);
		}

		Thread.sleep(2000);

		 configurationObj.saveCountryMappingBtn.click();
		
		test.log(LogStatus.INFO, "Country mapped successfully");
		
		System.out.println("Country mapping created succesfully");
		
		report.endTest(test);
	}
	
	@Test(enabled=false,dataProvider="createCountryType",dataProviderClass=countryTypeData.class
			,dependsOnMethods={"createCountryMapping"}
			)
	public void countryType(String srcCountry, String destCountry, String service,String type) throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();
		
		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test = report.startTest("Create country type", "Country type is mapped");
		
		configurationObj.configurationSetting.click();
		
		Thread.sleep(2000);
		
		configurationObj.countryTypeSetting.click();
		
		Thread.sleep(2000);
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(configurationObj.sourceCountryDropDown_CountryType).click();
		act1.sendKeys(srcCountry,Keys.ARROW_DOWN,Keys.ENTER);
		act1.build().perform();
		
		Actions act2 = new Actions(driver);
		act2.moveToElement(configurationObj.destinationCountryDropDown_CountryType).click();
		act2.sendKeys(destCountry,Keys.ARROW_DOWN,Keys.ENTER);
		act2.build().perform();
		
		Actions act3 = new Actions(driver);
		act3.moveToElement(configurationObj.serviceDropDown_CountryType).click();
		act3.sendKeys(service,Keys.ARROW_DOWN,Keys.ENTER);
		act3.build().perform();
		
		configurationObj.searchBtn_CountryType.click();
		
		Thread.sleep(2000);
		/*
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//td[contains(text(),'Regular L1A - Premium')]/preceding-sibling::td/div")));
		
		Thread.sleep(1500);*/
		
		String[] countrytype = type.split(",");
		
		for(int i=0; i<countrytype.length;i++ ){
		
		driver.findElement(By.xpath("//td[contains(text(),'"+countrytype[i]+"')]/preceding-sibling::td/div")).click();
		}
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",configurationObj.saveBtn_CountryType);
		
		Thread.sleep(1500);
		
		//configurationObj.saveBtn_AssignmentImmigrationRole.click();
		test.log(LogStatus.INFO, "Country type mapped successfully");
				
		System.out.println("Country type created succesfully");
		
		report.endTest(test);
		
	}
	
	
	@Test(enabled = false, dataProvider = "countryAssignmentRole", dataProviderClass = countryAssignmentRoleData.class
			,dependsOnMethods={"createCountryMapping","countryType"})
	public void countryAssignmentRole(String country, String assignmentRole) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test = report.startTest("Country Assignment Role", "Assignment role is mapped to country");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryAssignmentRoleSetting.click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-controls='MIRTable']")).sendKeys(country);
		
		Thread.sleep(1500);

		driver.findElement(By.xpath("//td[contains(text(),'" + country + "')]/following-sibling::td[3]/div/button"))
				.click();

		Thread.sleep(2000);

		String[] countryAssignmentRole = assignmentRole.split(",");

		for (int i = 0; i < countryAssignmentRole.length; i++) {

			configurationObj.countryAssignmentRole_DataTableSearchBox.clear();
			configurationObj.countryAssignmentRole_DataTableSearchBox.sendKeys(countryAssignmentRole[i]);

			Thread.sleep(1000);

			driver.findElement(
					By.xpath("//div[@id='ms-AssignmentSelect']/div[@class='ms-selectable']/ul/li/span[contains(text(),'"
							+ countryAssignmentRole[i] + "')]"))
					.click();

		}

		configurationObj.saveCountryAssignmentRole.click();
		test.log(LogStatus.INFO, "Assignment Role mapped successfully");
		
		System.out.println("Country assignment role created succesfully");
		
		report.endTest(test);

	}

	@Test(enabled = false, dataProvider = "countryImmigrationRole", dataProviderClass = countryImmigrationRoleData.class
			,dependsOnMethods={"createCountryMapping","countryType","countryAssignmentRole"})
	
	public void countryImmigrationRole(String country, String immigrationRole) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test = report.startTest("Country Immigration Role", "Immigration role is mapped to country");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryImmigrationRoleSetting.click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-controls='MIRTable']")).sendKeys(country);
		
		Thread.sleep(1500);

		driver.findElement(By.xpath("//td[contains(text(),'" + country + "')]/following-sibling::td[3]/div/button"))
				.click();

		Thread.sleep(2000);

		String[] countryImmigrationRole = immigrationRole.split(",");
		
		Thread.sleep(1500);

		for (int i = 0; i < countryImmigrationRole.length; i++) {

			configurationObj.countryImmigrationRole_DataTableSearchBox.clear();
			configurationObj.countryImmigrationRole_DataTableSearchBox.sendKeys(countryImmigrationRole[i]);

			Thread.sleep(2000);

			driver.findElement(By
					.xpath("//div[@id='ms-ImmigrationSelect']/div[@class='ms-selectable']/ul/li/span[contains(text(),'"
							+ countryImmigrationRole[i] + "')]"))
					.click();
			
			Thread.sleep(2000);

		}

		configurationObj.saveCountryImmigrationRole.click();
		
		System.out.println("Country immigration role created succesfully");
		
		test.log(LogStatus.INFO, "Immigration role is mapped to country");

		// It work without selecting from search box also.

		report.endTest(test);
		
	}
	
	@Test(enabled = false, dataProvider = "assignmentImmigrationRoleMapping", dataProviderClass = assignmentImmigrationRoleMappingData.class
			,dependsOnMethods={"createCountryMapping","countryType","countryAssignmentRole","countryImmigrationRole"})
			
	public void assignmentImmigrationRoleMapping(String assignmentRole, String immigrationRole)
			throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test = report.startTest("Assignment Immigration Role", "Immigration role is mapped to assignment role");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.assignmentImmigrationRoleSetting.click();

		Thread.sleep(1500);

		configurationObj.assignmentImmigrationRole_DataTableSearchBox.clear();
		configurationObj.assignmentImmigrationRole_DataTableSearchBox.sendKeys(assignmentRole);

		Thread.sleep(1000);

		driver.findElement(
				By.xpath("//td[contains(text(),'" + assignmentRole + "')]/following-sibling::td[3]/div/button"))
				.click();

		Thread.sleep(1500);

		String[] countryAssignmentImmigrationRole = immigrationRole.split(",");

		for (int i = 0; i < countryAssignmentImmigrationRole.length; i++) {

			configurationObj.searchAssignmentRole_AssignmentImmigrationRole.clear();
			configurationObj.searchAssignmentRole_AssignmentImmigrationRole
					.sendKeys(countryAssignmentImmigrationRole[i]);

			Thread.sleep(1000);

			driver.findElement(By
					.xpath("//div[@id='ms-AssignmentImmigrationSelect']/div[@class='ms-selectable']/ul/li/span[contains(text(),'"
							+ countryAssignmentImmigrationRole[i] + "')]"))
					.click();

		}

		configurationObj.saveBtn_AssignmentImmigrationRole.click();
		
		test.log(LogStatus.INFO, "Assignment Immigration role is mapped successfully");
		
		System.out.println("Assignment Immigration role created succesfully");
		
		report.endTest(test);

	}
	
	


	@Test(enabled = false, dataProvider = "countryTravelPurpose", dataProviderClass = countryTravelPurpose.class,
			dependsOnMethods={"createCountryMapping","countryType"})
	public void countryTravelPurpose(String country, String travelPurpose) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test = report.startTest("Country Travel Purpose", "Creates country travel purspose");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryTravelPurposeSetting.click();

		Thread.sleep(1500);

		configurationObj.addCountryTravelPurpose.click();

		Thread.sleep(1500);

		Actions action = new Actions(driver);
		action.moveToElement(configurationObj.countryDropDown_TravelPurpose);
		action.sendKeys(country, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(1500);

		String[] countryTravelPurpose = travelPurpose.split(",");

		for (int i = 0; i < countryTravelPurpose.length; i++) {

			driver.findElement(By.xpath("//input[@value='" + countryTravelPurpose[i] + "']/following-sibling::label"))
					.click();

		}

		// configurationObj.saveCountryTravelPurpose.click();
		
		test.log(LogStatus.INFO, "Country travel purspose created successfully");
		
		System.out.println("Country travel purpose created succesfully");

		report.endTest(test);
	}	
	
	
	@Test(enabled = false, dataProvider = "countryTypeForm", dataProviderClass = countryTypeForm.class
			,dependsOnMethods={"createCountryMapping","countryType"}
			)
	public void countryTypeForm(String source, String destination, String service, String type, String formName,
			String applicableFor) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		test = report.startTest("Country Type Form", "Create country type form");
		
		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		configurationObj.countryTypeFormSetting.click();
		Thread.sleep(2000);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.sourceCountryDropDown_CountryTypeForm).click();
		action1.sendKeys(source, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.destinationCountryDropDown_CountryTypeForm).click();
		action2.sendKeys(destination, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.serviceDropDown_CountryTypeForm).click();
		action3.sendKeys(service, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		Actions action4 = new Actions(driver);
		action4.moveToElement(configurationObj.typeDropDown_CountryTypeForm).click();
		action4.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action4.build().perform();

		Thread.sleep(1000);

		configurationObj.searchBtn_CountryTypeForm.click();

		Thread.sleep(1000);

		configurationObj.addBtn_CountryTypeForm.click();

		Thread.sleep(1500);

		String[] form = formName.split(",");
		String[] applicable = applicableFor.split(",");

		for (int i = 0; i < form.length; i++) {

			driver.findElement(By.xpath("//td[contains(text(),'" + form[i] + "')]/preceding-sibling::td/div/label"))
					.click();

			Thread.sleep(1500);

			Actions action5 = new Actions(driver);
			action5.moveToElement(driver.findElement(By.xpath(
					"//td[contains(text(),'" + form[i] + "')]/following-sibling::td/div[@title='select dependents']")))
					.click();

			for (int j = 0; j < applicable.length; j++) {

				action5.sendKeys(applicable[j], Keys.ENTER);
				action5.build().perform();

			}

		}

		// configurationObj.saveBtn_CountryTypeForm.click();
		
		test.log(LogStatus.INFO, "Country type form created successfully");
		
		System.out.println("Country type form created succesfully");
		
		report.endTest(test);

	}
	
	


	@Test(enabled = false, dataProvider = "supportLetter", dataProviderClass = supportLetterData.class
			,dependsOnMethods={"createCountryMapping","countryType"}
			)
	public void createSupportLetter(String sourceCountry, String destinationCountry, String service, String type,
			String documentName, String displayName, String documentDesc) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test = report.startTest("Create Support Letter", "Creates support letter");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.supportLetterSetting);

		Thread.sleep(1500);

		configurationObj.supportLetterSetting.click();

		Thread.sleep(2000);

		configurationObj.addBtn_SupportLetter.click();

		Thread.sleep(2000);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.sourceCountry_SupportLetter).click();
		action1.sendKeys(sourceCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.destinationCountry_SupportLetter).click();
		action2.sendKeys(destinationCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.service_SupportLetter).click();
		action3.sendKeys(service, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		Actions action4 = new Actions(driver);
		action4.moveToElement(configurationObj.type_SupportLetter).click();
		action4.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action4.build().perform();

		Thread.sleep(1000);

		configurationObj.documentName_SupportLetter.sendKeys(documentName);

		configurationObj.displayName_SupportLetter.sendKeys(displayName);

		configurationObj.description_SupportLetter.sendKeys(documentDesc);

		// configurationObj.saveBtn_SupportLetter.click();
		
		test.log(LogStatus.INFO, "Support letter created successfully");
		
		System.out.println("Support letter created succesfully");
		
		report.endTest(test);

	}

	@Test(enabled = false, dataProvider = "deputationLetter", dataProviderClass = deputationLetterData.class
			,dependsOnMethods={"createCountryMapping","countryType"}
			)
	public void createDeputationLetter(String sourceCountry, String destinationCountry, String service, String type,
			String documentName, String displayName, String documentDesc) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test=report.startTest("Create Deputation Letter", "Creates deputation letter");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.deputationLetterSetting);

		Thread.sleep(1500);

		configurationObj.deputationLetterSetting.click();

		Thread.sleep(2000);

		configurationObj.addBtn_DeputationLetter.click();

		Thread.sleep(2000);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.sourceCountryDropDown_DepuationLetter).click();
		action1.sendKeys(sourceCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.destinationCountryDropDown_DepuationLetter).click();
		action2.sendKeys(destinationCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.serviceDropDown_DeputationLetter).click();
		action3.sendKeys(service, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		Actions action4 = new Actions(driver);
		action4.moveToElement(configurationObj.typeDropDown_DepuationLetter).click();
		action4.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action4.build().perform();

		Thread.sleep(1000);

		configurationObj.documentName_DeputationLetter.sendKeys(documentName);

		configurationObj.displayName_DeputationLetter.sendKeys(displayName);

		configurationObj.description_DepuatationLetter.sendKeys(documentDesc);

		// configurationObj.saveBtn_DepuatationLetter.click();
		
		test.log(LogStatus.INFO, "Deputation letter created successfully");
		
		System.out.println("Deputation letter created succesfully");
		
		report.endTest(test);

	}
	

	@Test(enabled = false, dataProvider = "userDefinedKeyword", dataProviderClass = createUserDefindedKeywordData.class
			,dependsOnMethods={"createCountryMapping","countryType"}
			)
	public void createUserDefinedKeyword(String text, String value) throws InterruptedException {
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test = report.startTest("Create User Defined Keyword", "Creates user defined keywords");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.userDefinedKeywordSetting);

		Thread.sleep(1500);
		configurationObj.userDefinedKeywordSetting.click();

		Thread.sleep(1500);

		configurationObj.addBtn_UserDefinedKeyword.click();
		Thread.sleep(1500);

		configurationObj.text.sendKeys(text);
		configurationObj.value.sendKeys(value);

		// configurationObj.saveBtn_UserDefinedKeyword.click();
		
		test.log(LogStatus.INFO, "User defined keyword created successfully");
		
		System.out.println("User defined Keyword created succesfully");
		
		report.endTest(test);

	}

	
	@Test(enabled = false, dataProvider = "addAuthorizedSignatory", dataProviderClass = addAuthorizedSignatoryData.class
			,dependsOnMethods={"createCountryMapping","countryType"}
			)
	public void addAuthorizedSignatory(String isEmp, String fName, String mName, String lName, String designation,
			String phNo, String emailID, String companyName, String postalCode, String country, String state,
			String city, String addressLine1, String addressLine2, String signature) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test = report.startTest("Create Authorized Signatory","Creates authorized signatory");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.authorizedSignatorySetting);

		Thread.sleep(1500);

		configurationObj.authorizedSignatorySetting.click();

		Thread.sleep(1500);

		configurationObj.addBtn_AuthorizedSignatory.click();

		Thread.sleep(1500);

		Actions action = new Actions(driver);
		action.moveToElement(configurationObj.isEmployeeDropDown_AuthorizedSignatory).click();
		action.sendKeys(isEmp, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		configurationObj.firstName_AuthorizedSignatory.sendKeys(fName);

		configurationObj.middleName_AuthorizedSignatory.sendKeys(mName);

		configurationObj.lastName_AuthorizedSignatory.sendKeys(lName);

		configurationObj.designation_AuthorizedSignatory.sendKeys(designation);

		configurationObj.phoneNumber_AuthorizedSignatory.sendKeys(phNo);

		configurationObj.emailId_AuthorizedSignatory.sendKeys(emailID);

		configurationObj.companyName_AuthorizedSignatory.sendKeys(companyName);

		configurationObj.postalCode_AuthorizedSignatory.sendKeys(postalCode);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.countryDropDown_AuthorizedSignatory).click();
		action1.sendKeys(country, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.stateDropDown_AuthorizedSignatory).click();
		action2.sendKeys(state, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.cityDropDown_AuthorizedSignatory).click();
		action3.sendKeys(city, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		configurationObj.addressLine1_AuthorizedSignatory.sendKeys(addressLine1);

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", configurationObj.addressLine2_AuthorizedSignatory);

		configurationObj.addressLine2_AuthorizedSignatory.sendKeys(addressLine2);

		configurationObj.uploadBtn_AuthorizedSignatory.click();
		Thread.sleep(1000);
		FileUpload.uploadFile(signature);
		
		//configurationObj.saveBtn_AuthorizedSignatory.click();
		
		test.log(LogStatus.INFO, "Authorized signatory created successfully");
		
		System.out.println("Authorized signatory created succesfully");
		
		report.endTest(test);

	}
	
	
	@Test(enabled=true)
	public void claim_MenuMapping() throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test = report.startTest("Create Authorized Signatory","Creates authorized signatory");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.claimMenuMappingSetting);

		Thread.sleep(1500);
		
		configurationObj.claimMenuMappingSetting.click();
		
		Thread.sleep(1500);
		
		configurationObj.addBtn_ClaimMenuMapping.click();
		
		Thread.sleep(1500);
		
		Actions act = new Actions(driver);
		act.moveToElement(configurationObj.claimDropDown_ClaimMenuMapping).click();
		act.sendKeys("beneficiary",Keys.ARROW_DOWN,Keys.ENTER);
		act.build().perform();
		
		Thread.sleep(1500);
		
		configurationObj.inputSearchBoxNonSelected.sendKeys("apply for visa");
		
		Thread.sleep(1500);
		
		configurationObj.moveAll.click();	
		
		Thread.sleep(1500);
		
		//configurationObj.saveBtn_ClaimMenuMapping.click();
		
	}
	

	
 /*
  * 
  * *********Feature modified as on 26 May 2017
  
	
	@Test(enabled = false, dataProvider = "educationEvaluation", dataProviderClass = educationEvaluationData.class,
			dependsOnMethods={"createCountryMapping","countryType"})
	public void createEducationEvaluation(String sourceCountry, String destinationCountry, String service, String type)
			throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);
		
		test=report.startTest("Create Education Evaluation", "Creates education evaluation");

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.educationEvaluationSetting);

		Thread.sleep(1500);

		configurationObj.educationEvaluationSetting.click();

		Thread.sleep(1500);

		Actions action1 = new Actions(driver);
		action1.moveToElement(configurationObj.sourceCountryDropDown_EducationEvaluation).click();
		action1.sendKeys(sourceCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action1.build().perform();

		Thread.sleep(1000);

		Actions action2 = new Actions(driver);
		action2.moveToElement(configurationObj.destinationCountryDropDown_EducationEvaluation).click();
		action2.sendKeys(destinationCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action2.build().perform();

		Thread.sleep(1000);

		Actions action3 = new Actions(driver);
		action3.moveToElement(configurationObj.service_EducationEvaluation).click();
		action3.sendKeys(service, Keys.ARROW_DOWN, Keys.ENTER);
		action3.build().perform();

		Thread.sleep(1000);

		Actions action4 = new Actions(driver);
		action4.moveToElement(configurationObj.type_EducationEvaluation).click();
		action4.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action4.build().perform();

		Thread.sleep(1000);

		configurationObj.searchBtn_EducationEvaluation.click();

		Thread.sleep(1000);

		configurationObj.addBtn_EducationEvaluation.click();
		
		test.log(LogStatus.INFO, "Education Evaluation created successfully");
		
		System.out.println("Education evaluation created succesfully");
		
		report.endTest(test);
		
		

	}
	*/
	@AfterMethod(enabled = false)
	public void clean() {
		driver.close();
		driver.quit();
	}
	
	@BeforeSuite
	public void init() throws ATUTestRecorderException{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'-At-'HH-mm-ss");

		String dateStr = dateFormat.format(cal.getTime());
		
		recorder = new ATUTestRecorder("Z:\\ImmidartEnterprise\\Automation\\VideoScreenshot\\", dateStr, false);
		
		recorder.start();
		
		
	}
	
	@AfterSuite
	public void flush() throws ATUTestRecorderException{
		recorder.stop();
		
	}
	
	@AfterTest
	public void flushReport(){
		report.flush();
	}
	

}
