package setupPage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import org.apache.logging.log4j.Logger;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;

public class browserSetup {
	
public static WebDriver driver;
public Logger logger;
public Properties k;	
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String kr) throws IOException {
		
		// loading config.properties file
		
		FileReader file = new FileReader("./src//test//resources//config.properties");
		k = new Properties();
		k.load(file);
		
		logger = LogManager.getLogger(this.getClass());
			
		//driver = new ChromeDriver();
		switch(kr.toLowerCase()) {
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		default: System.out.println("Invalid browser name"); return;
		}
		//driver.get("http://srjapidev.jobsupportguru.com/");
		//driver.get(k.getProperty("Url"));
		driver.get(k.getProperty("Url2"));
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterClass
	void TearDown() {
		driver.quit();
	}
	
	// for name
	
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(10);
		return generatedString;
	}
	
	// for email
	
	public String randomAlphaNumberic() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		String generatedNumber = RandomStringUtils.randomNumeric(5);
		return generatedString + "@" + generatedNumber;
	}
	
	public String mobileNumber() {
		String generatedString = RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	
	
	public String captureScreen(String kname) throws IOException{
		
		String timeStamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath = System.getProperty("user.dir")+"\\screenshots\\"+ kname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		
		return targetFilePath;
		
	}

}
