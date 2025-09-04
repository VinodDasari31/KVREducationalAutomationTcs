package testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KVRHomePage {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void HomePage() {
		
		driver = new ChromeDriver();
		
		driver.get("http://srjapidev.jobsupportguru.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	}
	
	@Test
	void OpenHomePage() {
		
		String openPage = driver.getTitle();
		String expectedTitle = "KVR_Educational_Services";
		
		if(openPage.equals(expectedTitle)) {
			System.out.println("Title Matches : Success");
		}
		else {
			System.out.println("Title not Match : Fail");
		}
		
	}
	
	@AfterClass
	public void Close() {
	driver.quit();
	
	}

}
