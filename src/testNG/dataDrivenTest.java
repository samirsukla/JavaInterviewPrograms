package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDrivenTest {
	public WebDriver driver;
	public WebDriverWait wait;
	
	String url = "https://www.linkedin.com";
	
	private By byEmail = By.id("login-email");
	private By byPassword = By.id("login-password");
	private By bySubmit = By.id("login-submit");
	private By byError = By.xpath("//header[@id='layout-header']/div[3]/div[@class='alert error']/p/strong");
  
	
	@BeforeClass
	public void testSetup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,5);
	}
	
	@Test(dataProvider="userLogin")
	public void verifyLogin(String username, String password) {
		
		driver.navigate().to(url);
		driver.findElement(byEmail).sendKeys(username);
		driver.findElement(byPassword).sendKeys(password);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(bySubmit));
		driver.findElement(bySubmit).submit();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(byError));
		String actualError = driver.findElement(byError).getText();
		String expectedError = "There were one or more errors in your submission. Please correct the marked fields below.";
		
		
		Assert.assertEquals(expectedError,actualError);
	}
	
	
	@DataProvider(name="userLogin")
	public Object[][] loginData(){
		
		Object[][] arrayObject = getExcelData("C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\TestData.xlsx", "Sheet1");
		return arrayObject;
	}
	
	public String[][] getExcelData(String fileName, String sheetName){
		
		String[][] arrayExcelData = null;
		
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);
			
			int totalCols = sh.getColumns();
			int totalRows = sh.getRows();
			
			arrayExcelData = new String[totalRows-1][totalCols];
			
			for(int i=1;i<totalRows;i++) {
				for(j=0;j<totalCols;j++) {
					
					arrayExcelData[i-1][j] = sh.getCellComment(j, i).geContents();
				}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
  }
