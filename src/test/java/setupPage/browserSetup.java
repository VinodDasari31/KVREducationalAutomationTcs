package setupPage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class browserSetup {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		
		
		driver = new ChromeDriver();
		driver.get("http://srjapidev.jobsupportguru.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterClass
	void TearDown() {
		driver.quit();
	}

}
