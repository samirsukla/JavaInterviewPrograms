package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class getElementSize {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {

		try {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.navigate().to("https://www.facebook.com/");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Test
	public void getSize() {
		try {
			WebElement web_button = driver.findElement(By.id("u_0_n"));

			int button_width = web_button.getSize().getWidth();
			System.out.println("Button Width is " + button_width);

			int button_height = web_button.getSize().getHeight();
			System.out.println("Button Height is " + button_height);

			System.out.println("Color of the button is" + web_button.getCssValue("color"));

			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
