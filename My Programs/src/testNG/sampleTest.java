package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sampleTest {
	@Parameters({"browser"})
	
	@Test
	public void testCaseOne(String browser) {
		System.out.println("Browser name is " + browser);
	}
	
	@Parameters({"username","password"})
	@Test
	public void testCaseTwo(String username , String password) {
		System.out.println("User Name is " + username);
		System.out.println("Password is "+ password);
	}
}

