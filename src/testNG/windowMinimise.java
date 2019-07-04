package testNG;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class windowMinimise {
	WebDriver driver;
  @Test
  public void setWindowSize() {
	  
	  try {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  
		  //driver.manage().window().maximize();
		  driver.get("https://www.google.co.in/");
		  System.out.println(driver.manage().window().getSize());
		  
		  Dimension d = new Dimension(400, 600);
		  driver.manage().window().setSize(d);
		  
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	  
	  
	  
  }
}
