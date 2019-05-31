package com.mytest.selenium.webdriver.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class shoppingAmazon {
	
	public WebDriver driver;
	
	public void launchWebpage() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
	}
	
	
	public void selectOption() {
		
		try {
			WebElement option = driver.findElement(By.id("searchDropdownBox"));
			
			Select sel = new Select(option);
			sel.selectByVisibleText("Furniture");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		shoppingAmazon test = new shoppingAmazon();
		test.launchWebpage();
		test.selectOption();

	}

}
