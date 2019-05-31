package com.mytest.selenium.webdriver.sample;

import java.util.concurrent.TimeUnit;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class learnWindowHandle {
	
	WebDriver driver;
	
	public void launchWindow() {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
	}
	
	public String getMainWindowHandle(WebDriver driver) {
		
		return driver.getWindowHandle();
	}
	
	public String getCurrentWindowTitle() {
		
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	

	public static void main(String[] args) {
		
		learnWindowHandle obj=new learnWindowHandle();
		obj.launchWindow();
		

	}

}
