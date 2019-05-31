package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExample {
	
  @Test(dataProvider = "getData")
  public void outPutFile(String userName, String Password) {
	  
	  System.out.println("Current User name is " + userName);
	  System.out.println("Current Password is " + Password);
  }
  
  @DataProvider
  public Object[][] getData(){
	  
	  Object[][] data = new Object[3][2];
	  
	  data[0][0] = "SamirSukla";
	  data[0][1] = "abc";
	  
	  data[1][0] = "SamirSukla351";
	  data[1][1] = "abcdee";
	  
	  data[2][0] = "SamirSukla34545";
	  data[2][1] = "abcsafsdf";
	  
	  return data;
	  
  }
}
