package com.mytest.selenium.webdriver.sample;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GAM_Ckt {

	
	WebDriver driver;
	
	public void launchUrl() {
		
		try {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\IEDriverServer_Win32_3.7.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			driver.get("https://aotsyjl.test.att.com:14200/arsys/forms/AOTSTM14200/AOTS-CntrlForm/DefaultWebView");
			
			driver.findElement(By.xpath("//table/tbody/tr/td/input[@name='userid']")).sendKeys("ss863a");
			driver.findElement(By.xpath("//table/tbody/tr[3]/td/input[@name='password']")).sendKeys("MadeinIndia!");
			driver.findElement(By.xpath("//table/tbody/tr[5]/td/input[@name='btnSubmit']")).submit();
			
			driver.findElement(By.name("successOK")).click();
			
			WebElement createButton = driver.findElement(By.xpath("//div[contains(text(),'Create Ticket')]"));
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Create Ticket')]")));
			
			
			Actions action = new Actions(driver);
			
			action.moveToElement(createButton).click().perform(); 
			
			//createTicket();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		/*finally {
			driver.close();
		}*/
		
		
		}
	
	/*public void createTicket() {
		
		WebElement createButton = driver.findElement(By.xpath("//div[contains(text(),'Create Ticket')]"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Create Ticket')]")));
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(createButton).click().perform(); 
	}*/
	public static void main(String[] args) {
		
		GAM_Ckt test = new GAM_Ckt();
		test.launchUrl();
		//test.createTicket();
		

	}

}
