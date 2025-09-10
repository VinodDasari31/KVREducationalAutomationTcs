package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetailsPage extends KvrConstructorPage {
	
	// Constructor
	
	public ContactDetailsPage (WebDriver driver){
			super(driver);
	}
	
	// Locators
	
	@FindBy(xpath="//span[normalize-space()='Contact details']")
	WebElement conta;
	@FindBy(xpath="//input[@id='PhoneNumber']")
	WebElement cont;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='WhatsappNumber']")
	WebElement wtsapp;
	
	@FindBy(xpath="//button[@id='btnNext']")
	WebElement nxt;
	
	// Action Methods
	
	public void ContactLink() {
		conta.click();
	}
	
	public void Contact(String contact) {
		cont.sendKeys(contact);
	}
	public void Email(String mail) {
		cont.sendKeys(mail);
	}
	public void WhattsApp(String app) {
		cont.sendKeys(app);
	}
	public void NextButton() {
		cont.click();
	}
		
	

}
