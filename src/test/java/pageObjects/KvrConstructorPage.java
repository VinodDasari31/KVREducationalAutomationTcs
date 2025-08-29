package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KvrConstructorPage {
	
	WebDriver driver;
	
	 KvrConstructorPage(WebDriver driver){
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

}
