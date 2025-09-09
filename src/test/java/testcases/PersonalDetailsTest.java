package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomeElements;
import pageObjects.LogicPage;
import pageObjects.PersonalDetailsPage;
import setupPage.browserSetup;

public class PersonalDetailsTest extends browserSetup {
	
	
	@Test
	public void PersonalDetailsTCase() {
		
		try {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'");
		
		HomeElements hm = new HomeElements(driver);
		hm.UserMail("vinodd.prajosh@gmail.com");
		hm.UserPsw("vinod123");
		hm.LoginBtn();
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("document.body.style.zoom='25%'");
		
		PersonalDetailsPage pdp = new PersonalDetailsPage(driver);
		pdp.FullName("Abcd");
		pdp.TagLine("abcd");
		pdp.Fee("1000");
		pdp.Select("India");
		pdp.Location("AP");
		pdp.ZipCode("544444");
		//pdp.Language("English");
		pdp.Data("tydyufifu;uifyyulcutdytdxyxyuf;c.y.jkcyv hk.cyltugc .uyciu vyucyulccui;uiuyflyufiyllfuftdrydtyduycdyifyicfyucyucyctucucucftyldfyufvjlvjvkyftudretdcghcjkvifuvlvukctudtydyuchcdtudrystykdkyvjhv jvkhfudtydtrsetsxtyfuigiobjvhkvcydrxfchfiogvlvhyftsdrfxjhckjfugolig8rfsyrfxhkc jgctydxcucuyfvifgp");
		
		pdp.NextButton();
		
		LogicPage lg = new LogicPage(driver);
		boolean target = lg.ContactLogic();
		Assert.assertTrue(target);
	}
		catch(Exception t) {
			Assert.fail();
		}
		
	}
	

}
