package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@CacheLookup
//	@FindBy(how = How.ID, using = "username") 
	//AND condition
	/*
	 * @FindBys({
	 * 
	 * @FindBy(how = How.CLASS_NAME, using = "inputLogin"),
	 * 
	 * @FindBy(how = How.XPATH, using = "//input[@id='username']") }) WebElement
	 * eleUsername;
	 */
	
	//OR condition
		@FindAll({
			@FindBy(how = How.CLASS_NAME, using = "inputLogin"),
			@FindBy(how = How.XPATH, using = "//input[@id='username123']")
		})
		WebElement eleUsername;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "password") 
	WebElement elePassword;
	
	@FindBy(how = How.CLASS_NAME , using = "decorativeSubmit") 
	WebElement eleLogin;
	
	public LoginPage enterUsername() throws InterruptedException {
		eleUsername.sendKeys("Demosalesmanager");
	//	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
		
	}

	public LoginPage enterPassword() {
		elePassword.sendKeys("crmsfa");
		
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public HomePage clickLoginButton() {
		eleLogin.click();
		//driver.findElement(By.className("decorativeSubmit")).click();
			
		return new HomePage(driver);
	}
	
	public LoginPage clickLoginButtonForNegativeData() {
		eleLogin.click();
	  // driver.findElement(By.className("decorativeSubmit")).click();
			
		return this;
	}
	

}
