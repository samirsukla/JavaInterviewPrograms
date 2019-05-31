package testNG;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class screenShot {
	
	WebDriver driver;
	
  @Test
  public void launchBrowser() {
	  
	  try {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  
		  driver.get("https://www.google.com/");
		  
		  File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(srcfile,new File("C:\\Users\\IBM_ADMIN\\Desktop\\MySelenium\\screenshot.png"));
	} catch (WebDriverException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
  }
}
