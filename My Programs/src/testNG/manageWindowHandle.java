package testNG;

import java.util.concurrent.TimeUnit;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class manageWindowHandle {

	WebDriver driver;
	@Test
	public void launchWindow() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		
		String windowTitle = getCurrentWindowTitle();
		String mainWindow = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherwindows(mainWindow));
		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com"), "Main window title is not matching");

	}

	public String getMainWindowHandle(WebDriver driver) {

		return driver.getWindowHandle();
	}

	public String getCurrentWindowTitle() {

		String windowTitle = driver.getTitle();
		return windowTitle;
	}

	
	public boolean closeAllOtherwindows(String openWindowHandle){
		
		Set<String> allWindowHandle = driver.getWindowHandles();
		for(String currentWindowHandle : allWindowHandle)
		{
			if (!currentWindowHandle.equals(openWindowHandle))
			{
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(openWindowHandle);
		if(driver.getWindowHandles().size()==1)
			return true;
		else 
			
			return false;
	}
}
