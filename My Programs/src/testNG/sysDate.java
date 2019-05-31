package testNG;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class sysDate {
  @Test
  public void dateAndTime() {
	  DateFormat df = new SimpleDateFormat("MMM/dd/yyyy HH:mm:ss");
	  Date date = new Date();
	  
	  String date1 = df.format(date);
	  
	  System.out.println("Current System Date and Time is " + date1);
	  
  }
}
