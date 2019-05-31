package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class myDropdown {
	WebDriver driver;
  @Test
  public void selectMobile() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
	  driver.get("file:///C:/Users/IBM_ADMIN/Desktop/MySelenium/MyList_multiple.html");
	  
	  WebElement we = driver.findElement(By.name("Mobdevices"));
	  
	  Select se = new Select(we);
	  
	  
	  se.selectByIndex(3);
	  //se.selectByValue("htc");
	  se.selectByVisibleText("iPhone");
	  
	  List<WebElement> allOptions = se.getOptions();
	  for(WebElement wel:allOptions)
	  {
		  System.out.println(wel.getText());
	  }
	  
	  List<WebElement> allSelOptions = se.getAllSelectedOptions();
	  for(WebElement wel:allSelOptions)
	  {
		  System.out.println("Selected Optios are "+ wel.getText());
	  }
	  
	  WebElement firstOption = se.getFirstSelectedOption();
	  System.out.println("First Selected Option is " + firstOption.getText());
	  
	  //se.deselectByIndex(3);
	  //se.deselectAll();
	    
	  
  }
}
