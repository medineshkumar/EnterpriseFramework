package screening;

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
import pages.screening;

public class screeningOperations {

	static WebDriver driver;

	String appURL = "http://10.0.5.80/EnterpriseQA/";
	
	@Test(enabled=true,priority=1)
	public void verifyQuestionnaire() throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		loginObj.screeningLogin();
		
		screening screeningPageObj = PageFactory.initElements(driver, screening.class);
		
		screeningPageObj.advanceSearch.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//small[contains(text(),'BeneficiaryFname')]/parent::span/parent::p/parent::div/parent::div/following-sibling::div/span/small/a[1]/span/i")).click();
		
		Thread.sleep(2000);
		
		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", screeningPageObj.screeningBtn);*/
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
				
		Thread.sleep(2000);
		
		screeningPageObj.screeningBtn.click();
				
		Thread.sleep(2000);
		
		screeningPageObj.questionnaireSetting_Screening.click();
		
		Thread.sleep(2000);
		
		screeningPageObj.questionVerifiedBtn_Screening.click();
		
	}
	
	@Test(enabled=true,priority=2)
	public void verifyDocuments() throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		loginObj.screeningLogin();
		
		screening screeningPageObj = PageFactory.initElements(driver, screening.class);
		
		screeningPageObj.advanceSearch.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//small[contains(text(),'BeneficiaryFname')]/parent::span/parent::p/parent::div/parent::div/following-sibling::div/span/small/a[1]/span/i")).click();
		
		Thread.sleep(2000);
		
		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", screeningPageObj.screeningBtn);*/
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
				
		Thread.sleep(2000);
		
		screeningPageObj.screeningBtn.click();
				
		Thread.sleep(2000);
		
		screeningPageObj.documentsSetting_Screening.click();
		
		Thread.sleep(2000);
		
		screeningPageObj.documentsVerified_Screening.click();
		
	}
	
	@Test(enabled=true,priority=3)
	public void caseVerification() throws InterruptedException{
		
		driver = Browser.startBrowser("chrome", appURL);

		Login loginObj = new Login(driver);
		loginObj.screeningLogin();
		
		screening screeningPageObj = PageFactory.initElements(driver, screening.class);
		
		screeningPageObj.advanceSearch.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//small[contains(text(),'BeneficiaryFname')]/parent::span/parent::p/parent::div/parent::div/following-sibling::div/span/small/a[1]/span/i")).click();
		
		Thread.sleep(2000);
		
		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", screeningPageObj.screeningBtn);*/
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
				
		Thread.sleep(2000);
		
		screeningPageObj.screeningBtn.click();
				
		Thread.sleep(2000);
		
		screeningPageObj.caseVerificationSetting_Screening.click();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(screeningPageObj.actionDropDown_CaseVerification_Screening).click();
		act.sendKeys("screening completed",Keys.ARROW_DOWN,Keys.ENTER);
		act.build().perform();
		
		Thread.sleep(1500);
		
		screeningPageObj.remarks_CaseVerification_Screening.sendKeys("screening remarks");
		
		Thread.sleep(1000);
		
		
		screeningPageObj.saveBtn_CaseVerification_Screening.click();
		
	}
	
	@AfterMethod(enabled = true)
	public void clean() {
		driver.close();
		driver.quit();
		
	}
	
}
