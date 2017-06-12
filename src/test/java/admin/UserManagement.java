package admin;

import org.openqa.selenium.By;
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
import pages.adminPageUserManagement;
import testData.createVendorTestData;

public class UserManagement {

	static WebDriver driver;

	String appURL = "http://10.0.5.76/EnterpriseQA/";
	
	ExtentReports report = new ExtentReports("Z:\\ImmidartEnterprise\\Automation\\Report\\UserManagementReport.html", true);
	ExtentTest test;
	
	@Test(enabled=true,dataProvider="createVendor",dataProviderClass=createVendorTestData.class)
	public void createVendor(String fName,String mName,String lName,
			String email,String phNo, String claim) throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();
		
		adminPageUserManagement userManagmentObj = PageFactory.initElements(driver, adminPageUserManagement.class);
		
		test = report.startTest("Create Vendor", "Creates vendor users");
		
		userManagmentObj.userManagementSetting.click();
		Thread.sleep(2000);
		
		userManagmentObj.addBtn_UserManagment.click();
		
		Thread.sleep(2000);
				
		
		userManagmentObj.firstName_UserManagement.sendKeys(fName);
		userManagmentObj.middleName_UserManagement.sendKeys(mName);
		userManagmentObj.lastName_UserManagement.sendKeys(lName);
		userManagmentObj.email_UserManagement.sendKeys(email);
		userManagmentObj.phoneNoFlagBtn_UserManagement.click();		
		
		userManagmentObj.phoneNoTextBox_UserManagment.click();
		userManagmentObj.phoneNoTextBox_UserManagment.sendKeys(phNo);
		
		Actions act = new Actions(driver);
		act.moveToElement(userManagmentObj.claimDropDown_UserManagement).click();
		act.sendKeys(claim,Keys.ARROW_DOWN,Keys.ENTER);
		act.build().perform();	
		
		//userManagmentObj.saveBtn_UserManagement.click();
		
		test.log(LogStatus.INFO,"Vendor created successfully");
		
		System.out.println("Vendor created succesfully");
		
		report.endTest(test);
		
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
