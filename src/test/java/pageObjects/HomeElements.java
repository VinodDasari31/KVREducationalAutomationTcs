package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElements extends KvrConstructorPage {
	
	WebDriver driver;
	
	public HomeElements(WebDriver driver){
		super(driver);
	}
	
	// Locators
	
		@FindBy(xpath="//input[@id='EmailId']")
		WebElement email;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement psw;
		
		@FindBy(xpath="//button[@id='btnLogin']")
		WebElement button;
		
		@FindBy(xpath="//a[@id='lnkSignUp']")
		WebElement signUp;
		
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
		
		public void SignUp() {
			signUp.click();
		}


}
