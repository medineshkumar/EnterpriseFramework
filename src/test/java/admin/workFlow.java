package admin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericClasses.Browser;
import genericClasses.Login;
import pages.adminPageConfiguration;
import pages.adminWorkflowPages;

public class workFlow {

	static WebDriver driver;
	static String appURL = "http://10.0.5.80/EnterpriseQA/";

	@Test(enabled = false,priority=1)
	public void addWorflow() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);
		
		Thread.sleep(2000);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		workflowObj.addBtn_Workflow.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_addWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_addWorkflow).click();
		act1.sendKeys("Pakistan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_addWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_addWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.name_addWorkflow.sendKeys("Lpermit");

		workflowObj.description_addWorkflow.sendKeys("LpermitDescription");

		workflowObj.searchKeyword_addWorkflow.sendKeys("LpermitSearchKeyword");

		workflowObj.saveBtn_addWorkflow.click();

	}

	@Test(enabled = false)
	public static void searchWorkflow() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("United States", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Dependent Visa", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("Dependent Visa", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();

	}

	@Test(enabled = false)
	public void configWorkflow() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("United States", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Dependent Visa", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("Dependent Visa", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//td[contains(text(),'DependentVisa')]/following-sibling::td[3]/div/a")).click();

		Thread.sleep(2000);

		workflowObj.viewConfigureCaseSetting.click();

		Thread.sleep(2000);

		workflowObj.startMenu.click();

		workflowObj.startTab.click();
		
		Thread.sleep(1500);

		driver.findElement(By.xpath("//div[contains(text(),'Is Questionare Applicable')]/preceding-sibling::div/div"))
				.click();

		driver.findElement(
				By.xpath("//div[contains(text(),'Is Purpose Of Travel Applicable')]/preceding-sibling::div/div"))
				.click();

		workflowObj.caseInitationTab.click();

		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.claimDropDown).click();
		act4.sendKeys("Beneficiary", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.saveBtn_caseInitationTab.click();

		Thread.sleep(1500);

		// Remove this line later
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();

	}

	@Test(enabled = true,priority=2)
	public void addStage() throws InterruptedException {

		driver = Browser.startBrowser("chrome", appURL);
		Login loginObj = new Login(driver);
		loginObj.adminLogin();

		adminPageConfiguration configurationObj = PageFactory.initElements(driver, adminPageConfiguration.class);

		adminWorkflowPages workflowObj = PageFactory.initElements(driver, adminWorkflowPages.class);
		
		Thread.sleep(2000);

		configurationObj.configurationSetting.click();

		Thread.sleep(2000);

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView(true);", configurationObj.workFlowSetting);

		Thread.sleep(2000);

		configurationObj.workFlowSetting.click();

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.moveToElement(workflowObj.sourceCountryDropDown_SearchWorkflow).click();
		act.sendKeys("India", Keys.ARROW_DOWN, Keys.ENTER);
		act.build().perform();

		Thread.sleep(1500);

		Actions act1 = new Actions(driver);
		act1.moveToElement(workflowObj.destinationCountryDropDown_SearchWorkflow).click();
		act1.sendKeys("Pakistan", Keys.ARROW_DOWN, Keys.ENTER);
		act1.build().perform();

		Actions act2 = new Actions(driver);
		act2.moveToElement(workflowObj.serviceDropDown_SearchWorkflow).click();
		act2.sendKeys("Long-Term Transfers", Keys.ARROW_DOWN, Keys.ENTER);
		act2.build().perform();

		Thread.sleep(1500);

		Actions act3 = new Actions(driver);
		act3.moveToElement(workflowObj.typeDropDown_SearchWorkflow).click();
		act3.sendKeys("L Permit", Keys.ARROW_DOWN, Keys.ENTER);
		act3.build().perform();

		workflowObj.searchBtn_SearchWorkflow.click();

		Thread.sleep(2000);
		
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//td[contains(text(),'Lpermit')]/following-sibling::td[3]/div/a")));
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//td[contains(text(),'Lpermit')]/following-sibling::td[3]/div/a")).click();

		Thread.sleep(2000);	
		

		workflowObj.viewConfigureCaseSetting.click();

		Thread.sleep(2000);

		workflowObj.addStageMenu.click();

		Thread.sleep(1500);

		workflowObj.stageName.sendKeys("stage name");

		workflowObj.stageDescription.sendKeys("stage desc");

		workflowObj.stageSearchKeyword.sendKeys("stage search keyword");

		workflowObj.nextBtn_stage.click();

		Thread.sleep(1500);

		Actions act4 = new Actions(driver);
		act4.moveToElement(workflowObj.searchByDropDown_action).click();
		act4.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		act4.build().perform();

		workflowObj.searchKeyword_action.sendKeys("document configuration");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//td[(text()='Document Configuration')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);

		System.out.println(workflowObj.closeBtn_StartPage.isDisplayed());
		
		workflowObj.closeBtn_StartPage.click();

		Actions actH = new Actions(driver);
		actH.moveToElement(driver.findElement(By.xpath("//div[text()='Document Configuration']"))).doubleClick();
		actH.build().perform();

		Thread.sleep(1000);

		// driver.findElement(By.xpath("//div[contains(@class,'addTreeNode')]/i[contains(@class,'fa fa-plus-circle')]")).click();

		workflowObj.documentConfigurationTab_documentConfigAction.click();

		Thread.sleep(1000);

		workflowObj.addNewDocumentBtn_documentConfigAction.click();

		Thread.sleep(2000);

		workflowObj.searchKeyword_documentConfigAction.sendKeys("td");
		workflowObj.searchBtn_documentConfigAction.click();

		driver.findElement(By.xpath("//div[contains(text(),'td')]/preceding::label[1]")).click();

		Thread.sleep(1500);

		workflowObj.details_documentConfigAction.click();

		Thread.sleep(1500);

		Actions a = new Actions(driver);
		a.moveToElement(workflowObj.fileSizeDropDown_documentConfigAction).click();
		a.sendKeys("5", Keys.ARROW_DOWN, Keys.ENTER);
		a.build().perform();

		Thread.sleep(1500);

		Actions b = new Actions(driver);
		b.moveToElement(workflowObj.fileTypeDropDown_documentConfigAction).click();
		b.sendKeys("jpg", Keys.ARROW_DOWN, Keys.ENTER);
		b.moveToElement(workflowObj.fileTypeDropDown_documentConfigAction).click();
		b.sendKeys("jpeg", Keys.ARROW_DOWN, Keys.ENTER);
		b.moveToElement(workflowObj.fileTypeDropDown_documentConfigAction).click();
		b.sendKeys("png", Keys.ARROW_DOWN, Keys.ENTER);
		b.moveToElement(workflowObj.fileTypeDropDown_documentConfigAction).click();
		b.sendKeys("pdf", Keys.ARROW_DOWN, Keys.ENTER);
		b.build().perform();

		Thread.sleep(1500);

		workflowObj.claims_documentConfigAction.click();

		Thread.sleep(1500);

		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//*[@id='dtab22']/div[2]/div[2]/div/select")));

		Thread.sleep(2000);

		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id='dtab22']/div[2]/div[2]/div/select")));
		sel1.selectByValue("M");

		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.xpath("//*[@id='dtab22']/div[5]/div[2]/div/select")));

		Thread.sleep(2000);

		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id='dtab22']/div[5]/div[2]/div/select")));
		sel2.selectByValue("M");

		Thread.sleep(1500);

		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].scrollIntoView(true);", workflowObj.saveBtn_claimSubTab_dcoumentConfigAction);

		Thread.sleep(1500);

		workflowObj.saveBtn_claimSubTab_dcoumentConfigAction.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].scrollIntoView(true);", workflowObj.closeBtn_StartPage);
		
		Thread.sleep(1500);
		
		workflowObj.closeBtn_StartPage.click();		
		
		driver.navigate().refresh();
		
		Thread.sleep(2500);		
		
		Actions forClickAddOption = new Actions(driver);
		forClickAddOption.moveToElement(driver.findElement(By.xpath("//div[text()='Document Configuration']")));
		forClickAddOption.build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'addTreeNode')]/i[contains(@class,'fa fa-plus-circle')]")).click();
		
		Thread.sleep(2000);
		
		
		workflowObj.addActionCheckBox.click();
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		Actions questionnaireActionAdd = new Actions(driver);
		questionnaireActionAdd.moveToElement(workflowObj.searchByDropDown_action).click();
		questionnaireActionAdd.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		questionnaireActionAdd.build().perform();

		workflowObj.searchKeyword_action.sendKeys("Questionnaire");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[(text()='Questionnaire')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);

		workflowObj.closeBtn_StartPage.click();
		
		Thread.sleep(2000);
		
		Actions configQuestionnaireAction = new Actions(driver);
		configQuestionnaireAction.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Questionnaire')][@class='actnode']"))).doubleClick();
		configQuestionnaireAction.build().perform();
		
		Thread.sleep(2000);
		
		workflowObj.questionnaireTab_questionnaireConfigAction.click();
		
		Thread.sleep(1500);
		
		workflowObj.addNewBtn_questionnairConfigAction.click();
		
		Thread.sleep(1500);
		
	
		workflowObj.searchBox_questionnaireConfigAction.sendKeys("Form");
		workflowObj.searchBtn_questionnaireConfigAction.click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[contains(@class,'quesconf')]//div[contains(text(),'Form')]/preceding::label[1]")).click();
		
		
	JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].scrollIntoView(true);", workflowObj.saveBtn_questionnaireTab_questionnaireConfigAction);
		
		Thread.sleep(1500);
		
	//	workflowObj.saveBtn_questionnaireTab_questionnaireConfigAction.click();
		
		Thread.sleep(1500);
		
		
		
		
		
		/* **************  configure milestone for questionnaire ************* */
		 driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		Actions configQuestionnaireAction1 = new Actions(driver);
		configQuestionnaireAction1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Questionnaire')][@class='actnode']"))).doubleClick();
		configQuestionnaireAction1.build().perform();
		
		Thread.sleep(1500);		
		
		
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].scrollIntoView(true);", workflowObj.milestoneTab_questionnaireConfigAction); 
		
		workflowObj.milestoneTab_questionnaireConfigAction.click();
		
		Thread.sleep(1500);
		
		Actions QmileStonetab = new Actions(driver);
		QmileStonetab.moveToElement(workflowObj.chooseMileStoneFieldDropDown_milestoneTab_documentConfigAction).click();
		QmileStonetab.sendKeys("initiation", Keys.ARROW_DOWN,Keys.ENTER);
		QmileStonetab.build().perform();
		
		workflowObj.isSlaApplicableCheckbox_milestoneTab_questionnaireConfigAction.click();
		
		workflowObj.SLA_milstoneTab_questionnaireConfigAction.sendKeys("5");
		
		workflowObj.saveBtn_milestoneTab_questionniareConfigAction.click();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		Actions addVisaRequestSubmission = new Actions(driver);
		addVisaRequestSubmission.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Questionnaire')][@class='actnode']")));
		addVisaRequestSubmission.build().perform();		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@data-actionname='Questionnaire']//div[contains(@class,'addTreeNode')]/i[contains(@class,'fa fa-plus-circle')]")).click();
		
		Thread.sleep(2000);
		
		
		workflowObj.addActionCheckBox.click();
		workflowObj.yesBtn_addActionStageModal.click();
		
		Thread.sleep(2000);
		
		
		Actions visaRequestSubmissionStatus = new Actions(driver);
		visaRequestSubmissionStatus.moveToElement(workflowObj.statusDropDown_action).click();
		visaRequestSubmissionStatus.sendKeys("application sent", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionStatus.build().perform();
		
		Thread.sleep(2000);		
		
		Actions visaRequestSubmissionAdd = new Actions(driver);
		visaRequestSubmissionAdd.moveToElement(workflowObj.searchByDropDown_action).click();
		visaRequestSubmissionAdd.sendKeys("action name", Keys.ARROW_DOWN, Keys.ENTER);
		visaRequestSubmissionAdd.build().perform();

		workflowObj.searchKeyword_action.sendKeys("Visa Request Submission");

		workflowObj.searchBtn_action.click();

		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[contains(text(),'Visa Request Submission')]/preceding-sibling::td/input")).click();

		workflowObj.saveBtn_action.click();

		Thread.sleep(2000);

		workflowObj.closeBtn_StartPage.click();
		
		Thread.sleep(2000);		
		
		Actions VisaRequestSubmissionAction = new Actions(driver);
		VisaRequestSubmissionAction.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Visa Request Submission')][@class='actnode']"))).doubleClick();
		VisaRequestSubmissionAction.build().perform();
		
		Thread.sleep(2000);
		
		workflowObj.actionOwnerTab_VisaRequestSubmissionAction.click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td[contains(text(),'Beneficiary')]/preceding-sibling::td/input")).click();
		
		Thread.sleep(2000);
		
		/*JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].scrollIntoView(true);",  driver.findElement(By.xpath("//div[@class='slimScrollDiv']//table[@id='tblActionOwnerList_63']//td[contains(text(),'Administrator')]/preceding-sibling::td/input")));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='slimScrollDiv']//table[@id='tblActionOwnerList_63']//td[contains(text(),'Administrator')]/preceding-sibling::td/input")).click();
				
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//div[@class='slimScrollDiv']//table[@id='tblActionOwnerList_63']//td[contains(text(),'Embassy')]/preceding-sibling::td/input"))); 
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[@class='slimScrollDiv']//table[@id='tblActionOwnerList_63']//td[contains(text(),'Embassy')]/preceding-sibling::td/input")).click();*/
		
		
		
	

	}

}
