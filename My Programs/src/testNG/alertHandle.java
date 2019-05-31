package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class alertHandle {

	WebDriver driver;

	@Test
	public void alertTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/IBM_ADMIN/Desktop/MySelenium/AlertPopup.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Title is " + alert.getText());
		alert.accept();

	}
}
