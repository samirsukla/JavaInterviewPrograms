package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class scrollNcheck {
	
	WebDriver driver;
	String url = "http://www.seleniumeasy.com/";
 @Test 
  public void launchBrowser() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
	  
	  driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  
	  driver.get(url);
	  
  }
  @Test(priority=1)
  public void scrollBottom() throws Exception {
	  
	  driver.navigate().to(url);
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  Thread.sleep(5000);
	  ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,0)");
	 
  }
  
  	  
	 
  
  @Test(enabled=false)
  public void scrolltoElement() {
	  driver.get(url);
	  
	  WebElement element = driver.findElement(By.xpath("//div[@id='container']/div/div[1]/div/div[2]/div[3]/div/div/div[5]/div[1]/div/div/a"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element) ;
	  
	  element.click();
  
  
  }
}
