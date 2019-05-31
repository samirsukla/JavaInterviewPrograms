package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {
	
	public WebDriver driver;
	String url = "https://www.amazon.in/";
	
	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browser) {
		
		try {
			if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("CHROME")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else if(browser.equalsIgnoreCase("Ie")) {
				
				System.setProperty("webdriver.ie.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\IEDriverServer_Win32_3.7.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
  @Test
  public void openURL() {
	  
	  driver.navigate().to(url);
  }
  
  
  @AfterTest
  public void closeBrowser() {
	  
	  driver.close();
	  
  }
  
}
