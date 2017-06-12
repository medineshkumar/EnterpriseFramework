package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import genericClasses.Browser;
import genericClasses.Login;
import pages.managerApprovalPage;
import pages.managerLandingPage;

public class managerOperations {

	static WebDriver driver;

	String appURL = "http://10.0.5.80/EnterpriseQA/";

	@Test
	public void approveVisa() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		loginObj.managerLogin();

		managerLandingPage manLandingPageObj = PageFactory.initElements(driver, managerLandingPage.class);
		managerApprovalPage manApprovalPageObj = PageFactory.initElements(driver, managerApprovalPage.class);

		Thread.sleep(2000);

		manLandingPageObj.approvalSetting_Dashboard.click();

		Thread.sleep(2000);

		manApprovalPageObj.awaitingForApprovalSubMenu.click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//small[contains(text(),'BeneficiaryFname')]")).click();

		Thread.sleep(2000);
		
		manApprovalPageObj.remarks.sendKeys("approved");
		
		manApprovalPageObj.saveBtn_ApprovedCases.click();
		
	}
	
	@AfterMethod(enabled = true)
	public void clean() {
		driver.close();
		driver.quit();
		
	}

}
