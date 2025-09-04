package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomeElements;
import pageObjects.KVRRegistrationPage;
import pageObjects.LogicPage;
import setupPage.browserSetup;

public class KVRRegistrationTest extends browserSetup {
	
	
	@Test
	public void Registration() {
		
		try {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'");
		
		HomeElements hms = new HomeElements(driver);
		hms.SignUp();
		
		
		
		KVRRegistrationPage kvr = new KVRRegistrationPage(driver);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("document.body.style.zoom='50%'");
		
		kvr.FullName(randomString().toUpperCase());
		kvr.Email(randomString()+"@gmail.com");
		
		String password = randomAlphaNumberic();
		kvr.Password(password);
		kvr.ConPassword(password);
		
		kvr.Mobile(mobileNumber());
		kvr.DateOfBirth("28/09/1999");
		kvr.Gender();
		kvr.Otp();
		kvr.RegButton();
		
		LogicPage lg = new LogicPage(driver);
		boolean target = lg.ValidateOtp();
		
		Assert.assertTrue(target);
	}
	catch(Exception v)
	{
		Assert.fail();
	}

}
}
