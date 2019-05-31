package com.mytest.selenium.webdriver.sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sampleGuru99 {

	WebDriver driver;
	public void selectTest()  {
		
		
			try {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.get("https://www.google.com/");
				
				Thread.sleep(5000);
				
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_ALT);
			
				//driver.navigate().refresh();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	
	public static void main(String[] args) {
		sampleGuru99 test = new sampleGuru99();
		
		test.selectTest();
		
		
}
	

}
