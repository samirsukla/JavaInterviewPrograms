package com.mytest.selenium.webdriver.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getCommand {
	
	WebDriver driver;
	
	public void launchBrowser() {
		
		
		try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			getBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void getBrowser() {
		
		try {
			driver.get("http://www.amazon.in/");
			Thread.sleep(5000);
			String webtitle = driver.getTitle();
			System.out.println("Title of the browser is :" + webtitle);
			driver.findElement(By.linkText("Customer Service")).click();
			Thread.sleep(2000);
			String currenturl = driver.getCurrentUrl();
			System.out.println("Current URL is :" + currenturl);
			//System.out.println("page Source is : " + driver.getPageSource());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void browserClose() {
		
		driver.close();
		//driver.quit();
	}
	
	public static void main(String[] args) {
		
		getCommand myproj = new getCommand();
		
		myproj.launchBrowser();
		myproj.browserClose();

	}

}
