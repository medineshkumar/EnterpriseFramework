package processing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import genericClasses.Browser;
import genericClasses.Login;
import pages.processing;

public class processingOperations {

	static WebDriver driver;

	String appURL = "http://10.0.5.80/EnterpriseQA/";

	@Test(enabled = false, priority = 1)
	public void verifyQuestionnaire() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		loginObj.processingLogin();

		processing processingPageObj = PageFactory.initElements(driver, processing.class);

		processingPageObj.processingTracker.click();

		Thread.sleep(2000);

		driver.findElement(By
				.xpath("//small[contains(text(),'BeneficiaryFname')]/parent::span/parent::p/parent::div/parent::div/following-sibling::div/span/small/a[1]/span/i"))
				.click();

		Thread.sleep(2000);

		/*
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * jse.executeScript("arguments[0].scrollIntoView(true);",
		 * screeningPageObj.screeningBtn);
		 */

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		processingPageObj.processingBtn.click();

		Thread.sleep(2000);

		processingPageObj.questionnaireSetting_Processing.click();

		Thread.sleep(2000);

		processingPageObj.questionVerifiedBtn_Processing.click();

	}

	@Test(enabled = false, priority = 2)
	public void verifyDocuments() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		loginObj.processingLogin();

		processing processingPageObj = PageFactory.initElements(driver, processing.class);

		processingPageObj.processingTracker.click();

		Thread.sleep(2000);

		driver.findElement(By
				.xpath("//small[contains(text(),'BeneficiaryFname')]/parent::span/parent::p/parent::div/parent::div/following-sibling::div/span/small/a[1]/span/i"))
				.click();

		Thread.sleep(2000);

		/*
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * jse.executeScript("arguments[0].scrollIntoView(true);",
		 * screeningPageObj.screeningBtn);
		 */

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		processingPageObj.processingBtn.click();

		Thread.sleep(2000);

		processingPageObj.documentsSetting_Processing.click();

		Thread.sleep(2000);

		processingPageObj.documentsVerified_Processing.click();

	}

	@Test(enabled = true, priority = 3)
	public void caseVerification() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		loginObj.processingLogin();

		processing processingPageObj = PageFactory.initElements(driver, processing.class);

		processingPageObj.processingTracker.click();

		Thread.sleep(2000);

		driver.findElement(By
				.xpath("//small[contains(text(),'BeneficiaryFname')]/parent::span/parent::p/parent::div/parent::div/following-sibling::div/span/small/a[1]/span/i"))
				.click();

		Thread.sleep(2000);

		/*
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * jse.executeScript("arguments[0].scrollIntoView(true);",
		 * screeningPageObj.screeningBtn);
		 */

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		Thread.sleep(2000);

		processingPageObj.processingBtn.click();

		Thread.sleep(2000);

		processingPageObj.caseVerificationSetting_Processing.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(processingPageObj.actionDropDown_CaseVerification_Processing).click();
		act.sendKeys("processing acceptance", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		processingPageObj.remarks_CaseVerification_Processing.sendKeys("screening remarks");

		Thread.sleep(1000);

		processingPageObj.saveBtn_CaseVerification_Processing.click();

	}

	@AfterMethod(enabled = true)
	public void clean() {
		driver.close();
		driver.quit();

	}

}
