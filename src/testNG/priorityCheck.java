package testNG;

import org.testng.annotations.Test;

public class priorityCheck {
  @Test(priority = -3)
  public void login() {
	  System.out.println("Inside Login");
	  
  }
  
  @Test
  public void register() {
	  System.out.println("Inside register");
	  
  }
  
  @Test(priority=5)
  public void authentication() {
	  System.out.println("Inside authentication");
	  
  }
  @Test(priority = -1)
  public void verification() {
	  System.out.println("Inside verification");
	  
  }
}
