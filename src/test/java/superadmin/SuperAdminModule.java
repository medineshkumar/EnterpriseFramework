package superadmin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericClasses.Browser;
import genericClasses.Login;
import pages.superAdminPages;
import testData.createEmbassyMasterData;
import testData.createLicenseData;

public class SuperAdminModule {

	static WebDriver driver;

	String appURL = "http://10.0.5.76/EnterpriseQA/";
	
	ExtentReports report = new ExtentReports("Z:\\ImmidartEnterprise\\Automation\\Report\\SuperAdminReport.html", true);
	ExtentTest test;

	@Test(enabled = false,dataProvider="createLicense",dataProviderClass=createLicenseData.class)
	public void createLicense(String productType,String streamType,String OrganizationName,
			String contactFname,String contactLname,String contactEmail,
			String contactNumber,String alternateContactNumber,String validityStartDate,
			String validityEndDate ,String url,String inputDateFormat,
			String displayDateFormat,String domain,String timeZone) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages supersuperAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);
		
		test = report.startTest("Create new License", "Creates new license");

		Thread.sleep(2500);

		supersuperAdminPageObj.masterModuleSetting.click();

		Thread.sleep(2000);

		supersuperAdminPageObj.licenseSetting.click();

		Thread.sleep(2000);

		supersuperAdminPageObj.addLicenseBtn.click();

		Thread.sleep(2000);

		supersuperAdminPageObj.productTypeDropDown.click();
		supersuperAdminPageObj.producTypeDropDownInputBox.sendKeys(productType, Keys.ENTER);

		Thread.sleep(2000);

		supersuperAdminPageObj.streamTypeDropDown.click();
		supersuperAdminPageObj.streamTypeDropDownInputBox.sendKeys(streamType, Keys.ENTER);

		Thread.sleep(2000);

		supersuperAdminPageObj.organizationName.sendKeys(OrganizationName);

		supersuperAdminPageObj.contactFirstName.sendKeys(contactFname);

		supersuperAdminPageObj.contactLastname.sendKeys(contactLname);

		supersuperAdminPageObj.contactEmail.sendKeys(contactEmail);

		supersuperAdminPageObj.contactNumber.sendKeys(contactNumber);

		supersuperAdminPageObj.alternateContactNumber.sendKeys(alternateContactNumber);

		supersuperAdminPageObj.validityStartDate.sendKeys(validityStartDate, Keys.ENTER);

		supersuperAdminPageObj.validityEndDate.sendKeys(validityEndDate, Keys.ENTER);

		supersuperAdminPageObj.URL.sendKeys(url);

		supersuperAdminPageObj.inputDateFormatDropDown.click();
		supersuperAdminPageObj.inputDateFormatDropDownInputBox.sendKeys(inputDateFormat, Keys.ENTER);

		Thread.sleep(1000);

		supersuperAdminPageObj.displayDateFormatDropDown.click();
		supersuperAdminPageObj.displayDateFormatInputBox.sendKeys(displayDateFormat, Keys.ENTER);

		Thread.sleep(1000);

		supersuperAdminPageObj.domain.sendKeys(domain);

		Thread.sleep(1000);

		/*
		 * Currently Not implemented
		 * supersuperAdminPageObj.timeZoneDropDown.click();
		 * supersuperAdminPageObj.timeZoneDropDownInputBox.sendKeys("");
		 */
		// supersuperAdminPageObj.saveLicenseBtn.click();
		
		test.log(LogStatus.INFO,"New License created successfully");
		
		System.out.println("License created successfully");
		
		report.endTest(test);

	}

	@Test(enabled = false,dataProvider="createEmbassyMaster",dataProviderClass=createEmbassyMasterData.class,
			dependsOnMethods={"createLicense"})
	public void createEmbassyMaster(String sourceCountry, String destinationCountry, String type, String title,
			String officerInCharge, String address1, String address2, String state,
			String city, String postalCode, String stateJurisdiction) throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.superAdminLogin();

		superAdminPages superAdminPageObj = PageFactory.initElements(driver, superAdminPages.class);
		
		test = report.startTest("Create embassy master", "Creates new embassy master");

		Actions action = new Actions(driver);

		superAdminPageObj.masterModuleSetting.click();

		Thread.sleep(2500);

		superAdminPageObj.embassyMasterSetting.click();

		superAdminPageObj.addEmbassyMasterBtn.click();

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.sourceCountryEmbassyMaster);
		action.click();
		action.sendKeys(sourceCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.destinationCountryEmbassyMaster);
		action.click();
		action.sendKeys(destinationCountry, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.typeDropDownEmbassyMaster);
		action.click();
		action.sendKeys(type, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		superAdminPageObj.titleEmbassy.sendKeys(title);

		superAdminPageObj.officerInChargeEmbassyMaster.sendKeys(officerInCharge);

		superAdminPageObj.address1EmbassyMaster.sendKeys(address1);

		superAdminPageObj.address2EmbassyMaster.sendKeys(address2);

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.stateDropDownEmbassyMaster);
		action.click();
		action.sendKeys(state, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		action.moveToElement(superAdminPageObj.cityDropDownEmbassyMaster);
		action.click();
		action.sendKeys(city, Keys.ARROW_DOWN, Keys.ENTER);
		action.build().perform();

		Thread.sleep(2000);

		superAdminPageObj.postalCodeEmbassyMaster.sendKeys(postalCode);

		Thread.sleep(2000);		

		String[] jurisdiction = stateJurisdiction.split(",");
		for(int i=0; i<jurisdiction.length; i++){
		
		action.moveToElement(superAdminPageObj.stateJurisdictionEmbassyMaster);
		action.click();
		action.sendKeys(jurisdiction[i], Keys.ENTER);
		action.build().perform();

		}
		
		// superAdminPageObj.saveEmbassyMasterBtn.click();
		
		test.log(LogStatus.INFO, "Embassy master created successfully");
		
		System.out.println("Embassy master created successfully");
		
		report.endTest(test);

	}

	@Test(enabled = false)
	public void createMasterUnit() {

	}

	@AfterMethod(enabled = true)
	public void clean() {
		driver.close();
		driver.quit();
	}
	
	@AfterTest
	public void flushReport(){
		report.flush();
	}

}
