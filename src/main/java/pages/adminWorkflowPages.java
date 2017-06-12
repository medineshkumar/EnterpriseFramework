package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminWorkflowPages {

	// ********************** Search Workflow ******************************

	// Source country drop down SearchWorkflow
	@FindBy(id = "s2id_srcSourceCountryCode")
	public WebElement sourceCountryDropDown_SearchWorkflow;

	// Destination country drop down SearchWorkflow
	@FindBy(id = "s2id_srcDestinationCountryCode")
	public WebElement destinationCountryDropDown_SearchWorkflow;

	// service drop down SearchWorkflow
	@FindBy(id = "s2id_srcServiceCode")
	public WebElement serviceDropDown_SearchWorkflow;

	// Type drop down SearchWorkflow
	@FindBy(id = "s2id_srcTypeCode")
	public WebElement typeDropDown_SearchWorkflow;

	// search button SearchWorkflow
	@FindBy(id = "btnSearch")
	public WebElement searchBtn_SearchWorkflow;

	// clear button SearchWorkflow
	@FindBy(id = "audit_clear")
	public WebElement clearBtn_SearchWorkflow;

	// Add workflow button SearchWorkflow
	@FindBy(id = "addWF")
	public WebElement addBtn_Workflow;

	// ************************* Add workflow ******************************

	// Source country drop down addWorkflow
	@FindBy(id = "s2id_SourceCountryCode")
	public WebElement sourceCountryDropDown_addWorkflow;

	// Destination country drop down addWorkflow
	@FindBy(id = "s2id_DestinationCountryCode")
	public WebElement destinationCountryDropDown_addWorkflow;

	// service drop down addWorkflow
	@FindBy(id = "s2id_ServiceCode")
	public WebElement serviceDropDown_addWorkflow;

	// Type drop down addWorkflow
	@FindBy(id = "s2id_TypeCode")
	public WebElement typeDropDown_addWorkflow;

	// name
	@FindBy(name = "WFName")
	public WebElement name_addWorkflow;

	// description
	@FindBy(name = "WFDescription")
	public WebElement description_addWorkflow;

	// search keyword
	@FindBy(name = "SearchKeyword")
	public WebElement searchKeyword_addWorkflow;

	// save button addWorkflow
	@FindBy(id = "WFSave")
	public WebElement saveBtn_addWorkflow;

	// cancel button addWorkflow
	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	public WebElement cancelBtn_addWorkflow;

	// write dynamic xpath to click on config workflow button of required row..
	// td[contains(text(),'test')]/following-sibling::td[3]/div/a

	// View/Configure case settings
	@FindBy(id = "CaseSettingsConfigure")
	public WebElement viewConfigureCaseSetting;

	// ********************** Start Page *************************

	// Start menu
	@FindBy(xpath = "//span[contains(text(),'Start')]")
	public WebElement startMenu;

	// Start tab
	@FindBy(xpath = "//a[contains(text(),'Start')]")
	public WebElement startTab;

	// Case initiation tab
	@FindBy(xpath = "//a[contains(text(),'Case Initiation')]")
	public WebElement caseInitationTab;

	// write dynamic xpath to click on required setting ..
	// div[contains(text(),'Is Rule Verification
	// Applicable')]/preceding-sibling::div/div

	// close button start page
	@FindBy(id = "close")
	public WebElement closeBtn_StartPage;

	// ******************** Case initiation page ***********************

	// claim drop down
	@FindBy(id = "s2id_ddlClaim")
	public WebElement claimDropDown;

	// write dynamic xpath to click on required case initiation questionnaires
	// td[(text()='case1')]/preceding-sibling::td/div/label

	// save button case initaiton
	@FindBy(id = "btnSaveWF")
	public WebElement saveBtn_caseInitationTab;

	// ********************** Stages ************************

	// Add stage
	@FindBy(id = "AddStage")
	public WebElement addStageMenu;

	// Add new stage tab
	@FindBy(id = "stgAdd")
	public WebElement addStageTab;

	// Stage name
	@FindBy(name = "EStageName")
	public WebElement stageName;

	// Stage description
	@FindBy(name = "EStageDescription")
	public WebElement stageDescription;

	// stage search keyword
	@FindBy(name = "ESearchKeyword")
	public WebElement stageSearchKeyword;

	// next button
	@FindBy(id = "ShowTbl")
	public WebElement nextBtn_stage;

	// Add action tab
	@FindBy(id = "actAdd")
	public WebElement addAction;

	// ************************ action *************************

	// Search by drop down
	@FindBy(id = "s2id_actionSearchtype")
	public WebElement searchByDropDown_action;

	// Search keyword textbox
	@FindBy(name = "ActionSearchKey")
	public WebElement searchKeyword_action;

	// Search button
	@FindBy(id = "ShowTbl1")
	public WebElement searchBtn_action;

	// Status drop down
	@FindBy(id = "s2id_actionStatus_0")
	public WebElement statusDropDown_action;

	// back button
	@FindBy(id = "BackActionStage")
	public WebElement backBtn_action;

	// save button
	@FindBy(id = "SaveActionStage")
	public WebElement saveBtn_action;

	// ********************************** Document action
	// ***********************

	// document configuration tab
	@FindBy(xpath = "//a[contains(text(),'Document Configuration')][@data-toggle='tab']")
	public WebElement documentConfigurationTab_documentConfigAction;

	// add new document button
	@FindBy(xpath = "//div[contains(@class,'docconfig')]//span[contains(text(),'Add New')]")
	public WebElement addNewDocumentBtn_documentConfigAction;

	// search document
	@FindBy(name = "stageActionSearchKey")
	public WebElement searchKeyword_documentConfigAction;

	// search button
	@FindBy(xpath = "//a[contains(text(),'Search')]")
	public WebElement searchBtn_documentConfigAction;

	// div[contains(text(),'td')]/preceding::label[1]

	// details sub tab
	@FindBy(xpath = "//a[contains(text(),'Details')]")
	public WebElement details_documentConfigAction;

	// file size drop down
	@FindBy(xpath = "//div[contains(@class,'filesize')]")
	public WebElement fileSizeDropDown_documentConfigAction;

	// file type
	@FindBy(xpath = "//div[contains(@class,'filetype')]")
	public WebElement fileTypeDropDown_documentConfigAction;

	// document description
	@FindBy(xpath = "//label[contains(text(),'Document Description')]/following-sibling::textarea")
	public WebElement documentDescription_documentConfigAction;

	// claims sub tab
	@FindBy(xpath = "//a[contains(text(),'Claims')]")
	public WebElement claims_documentConfigAction;

	// label[contains(text(),'Claims')]/following-sibling::label[contains(text(),'Beneficiary')]/following::div[1]/div/select

	// save button
	@FindBy(xpath = "//a[contains(text(),'Save')]")
	public WebElement saveBtn_claimSubTab_dcoumentConfigAction;

	// cancel button
	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	public WebElement cancelBtn_claimSubTab_dcoumentConfigAction;

	// template sub tab
	@FindBy(xpath = "//a[contains(text(),'Templates')]")
	public WebElement template_documentConfigAction;

	// save button document configuration tab
	@FindBy(xpath = "//a[contains(text(),'Save')]")
	public WebElement saveBtn_documentConfigTab_documentConfigAction;

	// cancel button document configuration tab
	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	public WebElement cancelBtn_documentConfigTab_documentConfigAction;

	// milestone tab
	@FindBy(xpath = "//a[contains(text(),'MileStone')][@data-toggle='tab']")
	public WebElement milestoneTab_documentConfigAction;

	// choose mile stone field
	@FindBy(id = "s2id_milestonefield_62")
	public WebElement chooseMileStoneFieldDropDown_milestoneTab_documentConfigAction;

	// is sla applicable checkbox
	@FindBy(xpath = "//label[@for='IsSLAApplicable_3']")
	public WebElement isSlaApplicableCheckbox_milestoneTab_documentConfigAction;

	// sla textbox
	@FindBy(name = "SLA")
	public WebElement SLA_milstoneTab_documentConfigAction;
	
	// save button milestone tab 
	@FindBy(id="UpdateWorkflowActionMileStone_52")
	public WebElement saveBtn_milestoneTab_questionnaireConfigAction;

	// ********************

	// add icon on document config
	@FindBy(xpath = "//div[contains(@class,'addTreeNode')]")
	public WebElement addIcon_documentConfig;

	// edit icon on doucment config
	@FindBy(xpath = "//div[contains(@class,'edit')]")
	public WebElement editIcon_documentConfigAction;

	// delete icon on document config
	@FindBy(xpath = "//div[contains(@class,'trash')]")
	public WebElement deleteIcon_documentConfigAction;

	// add action or stage modal pop up
	// add action checkbox
	@FindBy(xpath = "//input[@id='IsAction']/following-sibling::label")
	public WebElement addActionCheckBox;

	// add stage checkbox
	@FindBy(xpath = "//input[@id='IsNewStage']/following-sibling::label")
	public WebElement addStageCheckBox;

	// Yes button in add stage/action modal popup
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	public WebElement yesBtn_addActionStageModal;

	// No button in add stage/action modal popup
	@FindBy(xpath = "//button[contains(text(),'No')]")
	public WebElement noBtn_addActionStageModal;

	// ******************** Questionnaire action 	// ***********************************

	// questionnaire tab
	@FindBy(xpath = "//a[contains(text(),'Questionnaire')][@data-toggle='tab']")
	public WebElement questionnaireTab_questionnaireConfigAction;

	// add new button
	@FindBy(xpath = "//div[contains(@class,'quesconfig')]//span[contains(text(),'Add New')]")
	public WebElement addNewBtn_questionnairConfigAction;

	// search keyword questionnaire
	@FindBy(xpath = "//input[@name='stageActionSearchKey']")
	public WebElement searchBox_questionnaireConfigAction;

	// search button questionnaire
	@FindBy(xpath = "//a[contains(text(),'Search')]")
	public WebElement searchBtn_questionnaireConfigAction;

	//div[contains(@class,'quesconf')]//div[contains(text(),'Form')]/preceding::label[1]

	// save button questionnaire tab
	@FindBy(xpath = "//div[contains(@class,'ques')]//a[contains(text(),'Save')]")
	public WebElement saveBtn_questionnaireTab_questionnaireConfigAction;

	// cancel button questionnaire tab
	@FindBy(xpath = "//div[contains(@class,'ques')]//a[contains(text(),'Cancel')]")
	public WebElement cancelBtn_questionnaireTab_questionnaireConfigAction;

	// milestone tab
	@FindBy(xpath = "//li[@class='active']/following-sibling::li/a[contains(text(),'MileStone')][@data-toggle='tab']")
	public WebElement milestoneTab_questionnaireConfigAction;

	// choose mile stone field drop down
	@FindBy(id = "s2id_milestonefield_53")
	public WebElement chooseMileStoneDropDown_questionnaireConfigAction;

	// is sla applicable checkbox
	@FindBy(xpath = "//label[@for='IsSLAApplicable_62']")
	public WebElement isSlaApplicableCheckbox_milestoneTab_questionnaireConfigAction;

	// sla textbox
	@FindBy(xpath = "//input[@name='SLA'][@id='SLA_62']")
	public WebElement SLA_milstoneTab_questionnaireConfigAction;
	
	// save button milestone tab
	@FindBy(id="UpdateWorkflowActionMileStone_53")
	public WebElement saveBtn_milestoneTab_questionniareConfigAction;
	
	
	//*******************  Visa request submission **********************
	
	// actin owner tab
	@FindBy(xpath="//a[contains(text(),'Action Owner')]")
	public WebElement actionOwnerTab_VisaRequestSubmissionAction;
	
	
	
	

}
