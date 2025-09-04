package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.KVRLoginScreenPage;
import pageObjects.LogicPage;
import setupPage.browserSetup;

public class KVRLoginTest extends browserSetup  {
	
	// WebDriver driver;
	
	@Test
	public void Login() {
		
		KVRLoginScreenPage kvr = new KVRLoginScreenPage(driver);
		
		kvr.UserMail(k.getProperty("email"));
		kvr.UserPsw(k.getProperty("psw"));
		kvr.LoginBtn();
		
		LogicPage cp = new LogicPage(driver);
		boolean target = cp.CheckPage();
		
		Assert.assertTrue(target);
	}

}
