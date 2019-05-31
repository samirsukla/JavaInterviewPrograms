package com.mytest.selenium.webdriver.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class openFacebook {
	
	WebDriver driver;
	
	public void launcgGoogle() {
		
		try {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.google.co.in/");
			
			driver.findElement(By.cssSelector("input[id=gs_htif0][class=gsfi]")).sendKeys("facebook");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[class=sbico-c][value=Search]")).click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public void launchFacebook() {
		
		try {
			WebElement fbsearch = driver.findElement(By.xpath("//div[@id='rso']/div[1]/div/div/div/div/h3/a"));
			fbsearch.click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("email")).sendKeys("samirkumarsukla@gmail.com");
			driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("S@mirSukla351");
			driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void fbLogout() {
		
		try {
			driver.findElement(By.xpath("//div[@id='logoutMenu']/a/div")).click();
			
			Actions action = new Actions(driver);
			
			WebElement logButton = driver.findElement(By.xpath("//div/div/ul/li[12]/a/span/span"));
			
			action.moveToElement(logButton);
			Thread.sleep(2000);
			action.click().build().perform();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		openFacebook fb = new openFacebook();
		fb.launcgGoogle();
		fb.launchFacebook();
		fb.fbLogout();
		
		

	}

}
