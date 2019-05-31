package testNG;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class gmailLogin {
	WebDriver driver;
	
	
  @Test
  public void launchLogin() {
	  
	  try {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  
		  driver.get("https://in.linkedin.com/");
		  
		  System.out.println("Home page Title : " + driver.getTitle());
		  
		  
		  WebElement loginName = driver.findElement(By.xpath("//input[@id = 'login-email']"));
		  loginName.sendKeys("sk.sukla@outlook.com");
		  
		  WebElement loginPassword = driver.findElement(By.xpath("//input[@id = 'login-password']"));
		  loginPassword.sendKeys("S@mirSukla351");
		  
		  WebElement loginButton = driver.findElement(By.xpath("//input[@id = 'login-submit']"));
		  loginButton.click();
		  
		  Thread.sleep(10000);
		  
		  System.out.println("Success  title : "+ driver.getTitle());
		  
		  
		  
		  
		 
		  
	} catch (Exception e) {
				e.printStackTrace();
	}
	  
  }
}
