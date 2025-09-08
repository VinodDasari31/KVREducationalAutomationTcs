package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordPage;
import pageObjects.HomeElements;
import pageObjects.LogicPage;
import setupPage.browserSetup;

public class ForgotPasswordTest extends browserSetup {
	
	
	@Test
	public void ForgotPasswordTestCase() {
		
		try {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");
		
		HomeElements hom = new HomeElements(driver);
		hom.LoginBtn();
		
		ForgotPasswordPage forgt = new ForgotPasswordPage(driver);
		
		forgt.Link();
		forgt.Field("vinodd.prajosh@gmail.com");
		forgt.Enter();
		
		LogicPage lg = new LogicPage(driver);
		boolean target = lg.ForgotOtpPage();
		
		Assert.assertTrue(target);
	}
		catch(Exception f) {
			Assert.fail();
		}
	}

}
