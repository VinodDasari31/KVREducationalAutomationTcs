package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactDetailsPage;
import pageObjects.HomeElements;
import pageObjects.LogicPage;
import setupPage.browserSetup;

public class ContactDetailsTest extends browserSetup {
	
	
	@Test
	public void ContactTestCase() {
		try {
		HomeElements he = new HomeElements(driver);
		he.UserMail("vinodd.prajosh@gmail.com");
		he.UserPsw("vinod123");
		he.LoginBtn();
		
		
		
		
		ContactDetailsPage con = new ContactDetailsPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'");
		
		con.ContactLink();
		con.Contact("987654322");
		con.WhattsApp("987654321");
		con.Email("vvv@gmail.com");
		con.NextButton();
		LogicPage lg = new LogicPage(driver);
		boolean target = lg.Title();
		
		Assert.assertTrue(target);
		
	}
		catch(Exception e) {
			Assert.fail();
		}

}
}
