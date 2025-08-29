package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tutorButtonPage extends KvrConstructorPage {
	
	//WebDriver driver;
	
	public tutorButtonPage(WebDriver driver){
		super(driver);
	}
	
	
	// Locators 
	
	@FindBy(xpath="//a[@id='lnkJoinTutor']")
	WebElement tutor;
	
	@FindBy(xpath="/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	WebElement arrow;
	
	
	// Action Methods
	public void TutorBtn() {
		tutor.click();
	}
	public void Arrow() {
		arrow.click();
	}

}
