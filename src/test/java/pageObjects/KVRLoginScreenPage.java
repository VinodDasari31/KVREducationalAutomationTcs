package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KVRLoginScreenPage extends KvrConstructorPage {
	
	
	public KVRLoginScreenPage(WebDriver driver){
		super(driver);
	}
	
	// Locators
	
	@FindBy(xpath="//input[@id='EmailId']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement psw;
	
	@FindBy(xpath="//button[@id='btnLogin']")
	WebElement button;
	
	// Action methods
	
	public void UserMail(String mail) {
		email.sendKeys(mail);
	}
	
	public void UserPsw(String pass) {
		psw.sendKeys(pass);
	}
	public void LoginBtn() {
		button.click();
	}

}
