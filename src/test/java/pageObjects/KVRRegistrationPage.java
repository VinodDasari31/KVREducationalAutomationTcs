package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KVRRegistrationPage extends KvrConstructorPage {
	
	public KVRRegistrationPage(WebDriver driver){
		super(driver);
	}
	
	// Locators
	
	@FindBy(xpath="//input[@id='FullName']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='EmailId']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='MobileNo']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement psw;
	
	@FindBy(xpath="//input[@id='rePassword']")
	WebElement cpsw;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	@FindBy(xpath="//input[@id='Male']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='OtpMobile']")
	WebElement otp;
	
	@FindBy(xpath="//button[@id='btnJoinNow']")
	WebElement button;
	
	// Action Methods
	
	public void FullName(String uname) {
		name.sendKeys(uname);
	}
	
	public void Email(String mail) {
		email.sendKeys(mail);
	}
	public void Password(String psws) {
		psw.sendKeys(psws);
	}
	public void ConPassword(String cpsws) {
		cpsw.sendKeys(cpsws);
	}
	public void Mobile(String mob) {
		mobile.sendKeys(mob);
	}
	public void DateOfBirth(String birth) {
		dob.sendKeys(birth);
	}
	public void Gender() {
		gender.click();
		
	}
		public void Otp() {
		otp.click();
	} 
	public void RegButton() {
		button.click();
	}

	

	
	

}
