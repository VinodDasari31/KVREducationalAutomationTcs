package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.tutorButtonPage;
import setupPage.browserSetup;

public class tutorsButton extends browserSetup {
	
	
	
	@Test
	public void TutorBtns() {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("document.body.style.zoom='50%'"); 
		
		tutorButtonPage btn = new tutorButtonPage(driver);
		
		//WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Join as a Tutor']"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", element);

		
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("document.body.style.zoom=50");*/
		//executor.executeScript("window.scrollTo(100, document.body.scrollHeight)");
		
		btn.TutorBtn();
		btn.Arrow();
	}

}
