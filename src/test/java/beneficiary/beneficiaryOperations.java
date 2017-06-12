package beneficiary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import genericClasses.Browser;
import genericClasses.Login;
import pages.beneficiaryInitiationPage;
import pages.beneficiaryLandingPage;

public class beneficiaryOperations {

	static WebDriver driver;

	String appURL = "http://10.0.5.80/EnterpriseQA/";

	@Test()
	public void applyForVisa() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);

		loginObj.beneficiaryLogin();

		Thread.sleep(2000);

		beneficiaryLandingPage benLandingPageObj = PageFactory.initElements(driver, beneficiaryLandingPage.class);
		beneficiaryInitiationPage benInitiationPageObj = PageFactory.initElements(driver,
				beneficiaryInitiationPage.class);

		benLandingPageObj.applyForVisaSetting_Dashboard.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(benInitiationPageObj.residingCountryDropDown).click();
		act.sendKeys("india", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		benInitiationPageObj.destinationCountry.sendKeys("H1B Cap - Non-premium");
		Thread.sleep(2000);
		benInitiationPageObj.destinationCountry.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		Actions act2 = new Actions(driver);
		act2.moveToElement(benInitiationPageObj.travelPurposeDropDown).click();
		act2.sendKeys("Business Meetings", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		benInitiationPageObj.travelPurposeDescription.sendKeys("Desciption");

		Thread.sleep(1500);

		benInitiationPageObj.initiateBtn.click();

		Thread.sleep(2000);	
				

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", benInitiationPageObj.submitCase_Initial);

		Thread.sleep(1500);

		benInitiationPageObj.submitCase_Initial.click();

		Thread.sleep(1500);

		benInitiationPageObj.okModalBtn.click();
		Thread.sleep(2000);
		benInitiationPageObj.questionnaireTab.click();

		Thread.sleep(2000);
		benInitiationPageObj.questionnaireCompletedBtn.click();
		Thread.sleep(2000);

		benInitiationPageObj.documentsTab.click();
		Thread.sleep(2000);
		benInitiationPageObj.documentsUploadedBtn.click();

		Thread.sleep(2500);

		benInitiationPageObj.submitCase_Summary.click();

	}
	
	@AfterMethod(enabled = false)
	public void clean() {
		driver.close();
		driver.quit();
		
	}	
	
	
}
