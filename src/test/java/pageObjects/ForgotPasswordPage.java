package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends KvrConstructorPage {
	
	// Constructor 
	
	public ForgotPasswordPage(WebDriver driver){
		super(driver);
	}
	
	// Locators
	
	@FindBy(xpath="//a[@id='lnkForgotPassword']")
	WebElement forLink;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement textField;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	WebElement enter;
	
	
	// Action methods
	
	public void Link() {
		forLink.click();
	}
	
	public void Field(String data) {
		textField.sendKeys(data);
	}
	
	public void Enter() {
		enter.click();
	}
	
	

}
