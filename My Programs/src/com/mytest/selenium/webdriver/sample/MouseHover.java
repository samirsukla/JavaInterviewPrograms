package com.mytest.selenium.webdriver.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	WebDriver driver;
	
	public void launchBrowser() {
		
		try {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.flipkart.com/");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void findMainMenu() {
		
		try {
			Actions action = new Actions(driver);
			
			WebElement mainmenu = driver.findElement(By.xpath("//div[@class='zi6sUf']/div/ul/li/a/span[contains(text(),'Electronics')]"));
			action.moveToElement(mainmenu).moveToElement(driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[4]/ul/li[5]/a/span"))).click().build().perform();
			
			
			//WebElement submenu = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[4]/ul/li[5]/a/span"));
			//action.moveToElement(submenu).click().build().perform();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		MouseHover mhv = new MouseHover();
		mhv.launchBrowser();
		mhv.findMainMenu();
		

	}

}
