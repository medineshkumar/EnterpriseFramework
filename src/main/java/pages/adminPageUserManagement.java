package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminPageUserManagement {

	// User Management Setting
	@FindBy(xpath = "//div[contains(text(),'User Management')]")
	public WebElement userManagementSetting;

	// Add user button
	@FindBy(xpath = "//button[@id='btnAdd']")
	public WebElement addBtn_UserManagment;

	// FirstName
	@FindBy(name = "FirstName")
	public WebElement firstName_UserManagement;

	// Middle Name
	@FindBy(name = "MiddleName")
	public WebElement middleName_UserManagement;

	// Last Name
	@FindBy(name = "LastName")
	public WebElement lastName_UserManagement;
	
	// Email 
	@FindBy(name="Email")
	public WebElement email_UserManagement;
	
	// Phone Number flag button
	@FindBy(xpath="//div[@class='iti-flag ']")
	public WebElement phoneNoFlagBtn_UserManagement;
	
	//div[@class='flag-container']/ul/li[@data-country-code='cw']
	
	//div[@class='flag-container']/ul/li/span[contains(text(),'Curaçao')]
	
	// Phone Number textbox
	@FindBy(name="PhoneNumber")
	public WebElement phoneNoTextBox_UserManagment;
	
	//Claim drop down
	@FindBy(id="s2id_Claim")
	public WebElement claimDropDown_UserManagement;
	
	// Save button
	@FindBy(id="btnsave")
	public WebElement saveBtn_UserManagement;
	
	// Cancel button
	@FindBy(xpath="//button[@title='Cancel']")
	public WebElement cancelBtn_UserManagement;
	
	

}
