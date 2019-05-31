import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleForJmeter {
	@Test
	public void checkFacebookTitle() {
		System.setProperty("webdriver.chrome.driver", "/home/streamoid/Desktop/Samir_Streamoid/Selenium_Streamoid/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		
	}

}
