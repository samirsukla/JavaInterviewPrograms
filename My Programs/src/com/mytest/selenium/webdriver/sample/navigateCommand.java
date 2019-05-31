package com.mytest.selenium.webdriver.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigateCommand {
	
	WebDriver driver;
	
	public void launchBrowser() {
		
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			navigateBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void navigateBrowser() {
		
		try {
			driver.navigate().to("http://www.amazon.in/");
			driver.findElement(By.linkText("Today's Deals")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}		
		
	}

	public static void main(String[] args) {
		
		navigateCommand mycmd = new navigateCommand();
		mycmd.launchBrowser();
		

	}

}
