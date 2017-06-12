package genericClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {

	WebDriver driver;

	private String adminUsername;
	private String adminPassword;
	
	private String beneficiaryUsername;
	private String beneficiaryPassword;
	
	private String managerUsername;
	private String managerPassword;
	
	private String screeningUsername;
	private String screeningPassword;
	
	private String processingUsername;
	private String processingPassword;
	
	private String superAdminUsername;
	private String superAdminPassword;
	
	public Login(WebDriver driver){
		
		this.adminUsername= "admin@dkr.com";
		this.adminPassword=	"password";
		
		this.beneficiaryUsername= "beneficiary@email.com";
		this.beneficiaryPassword= "password";
		
		this.managerUsername= "manager@email.com";
		this.managerPassword= "password";
		
		this.screeningUsername= "screening@email.com";
		this.screeningPassword= "password";
		
		this.processingUsername= "processing@email.com";
		this.processingPassword= "password";
		
		this.superAdminUsername= "superadmin@immidart.com";
		this.superAdminPassword= "password";
		
		this.driver = driver;
	}
	
	public void adminLogin(){
		driver.findElement(By.name("UserName")).clear();
		driver.findElement(By.name("UserName")).sendKeys(this.adminUsername);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(this.adminPassword);
	//	driver.findElement(By.xpath("//label[@for='checkbox1']")).click();
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void managerLogin(){
		driver.findElement(By.name("UserName")).clear();
		driver.findElement(By.name("UserName")).sendKeys(this.managerUsername);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(this.managerPassword);
		//driver.findElement(By.xpath("//label[@for='checkbox1']")).click();
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void screeningLogin(){
		driver.findElement(By.name("UserName")).clear();
		driver.findElement(By.name("UserName")).sendKeys(this.screeningUsername);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(this.screeningPassword);
		//driver.findElement(By.xpath("//label[@for='checkbox1']")).click();
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void processingLogin(){
		driver.findElement(By.name("UserName")).clear();
		driver.findElement(By.name("UserName")).sendKeys(this.processingUsername);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(this.processingPassword);
		//driver.findElement(By.xpath("//label[@for='checkbox1']")).click();
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void beneficiaryLogin(){
		driver.findElement(By.name("UserName")).clear();
		driver.findElement(By.name("UserName")).sendKeys(this.beneficiaryUsername);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(this.beneficiaryPassword);
		//driver.findElement(By.xpath("//label[@for='checkbox1']")).click();
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void superAdminLogin(){
		driver.findElement(By.name("UserName")).clear();
		driver.findElement(By.name("UserName")).sendKeys(this.superAdminUsername);
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(this.superAdminPassword);
		//driver.findElement(By.xpath("//label[@for='checkbox1']")).click();
		driver.findElement(By.id("btnLogin")).click();
	}	
	
	public void logOut() throws InterruptedException{
		driver.findElement(By.xpath("//div[contains(@class,'nav-profile')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@href,'Signout')]")).click();
		
	}
	
}
