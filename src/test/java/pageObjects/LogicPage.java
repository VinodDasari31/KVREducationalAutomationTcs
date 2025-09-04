package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogicPage extends KvrConstructorPage {
	
	public LogicPage(WebDriver driver) {
		super(driver);
		
		
	}
	
	@FindBy(xpath="//input[@id='FullName']")
	WebElement logic;

	public boolean CheckPage() {
		try {
			return(logic.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	@FindBy(xpath="//input[@id='Otp']")
	WebElement validateOtp;
	
	public boolean ValidateOtp() {
		try {
			return(validateOtp.isDisplayed());
		}
		catch(Exception e2) {
			return false;
		}
	}
}
