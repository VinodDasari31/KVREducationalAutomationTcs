package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetailsPage extends KvrConstructorPage {
	
	// Constructor
	
	public PersonalDetailsPage(WebDriver driver){
		super(driver);
	}
	
	// Locators
	
	@FindBy(xpath="//input[@id='FullName']")
	WebElement Kname;
	
	@FindBy(xpath="//input[@id='Tagline']")
	WebElement Ktag;
	
	@FindBy(xpath="//input[@id='HourlyFee']")
	WebElement Kfee;
	
	@FindBy(xpath="//select[@id='selectv8']")
	WebElement Kselect;
	
	@FindBy(xpath="//input[@id='location']")
	WebElement Kloc;
	
	@FindBy(xpath="//input[@id='ZipCode']")
	WebElement Kzip;
	
	@FindBy(xpath="//div[@class='choices__inner']")
	WebElement Klan;
	
	@FindBy(xpath="//textarea[@id='Introduction']")
	WebElement Kdata;
	
	@FindBy(xpath="//button[@id='btnNext']")
	WebElement Knext;
	
	
	// Action Methods
	
	public void FullName(String name) {
		Kname.sendKeys(name);
	}
	
	public void TagLine(String line) {
		Ktag.sendKeys(line);
	}
	
	public void Fee(String fee) {
		Kfee.sendKeys(fee);
	}
	
	public void Select(String select) {
		Kselect.sendKeys(select);
	}
	
	public void Location(String location) {
		Kloc.sendKeys(location);
	}
	
	public void ZipCode(String zip) {
		Kzip.sendKeys(zip);
	}
	
	public void Language(String language) {
		Klan.sendKeys(language);
	}
	
	public void Data(String data) {
		Kdata.sendKeys(data);
	}
	
	public void NextButton() {
		Knext.click();
	}

}
