package com.mytest.selenium.webdriver.sample;


class myBooking{  
	
	public static void getOnlyNumerics(String str) {
	     
	    
	 StringBuffer strBuff = new StringBuffer();
	    char c;
	     
	    for (int i = 0; i < str.length() ; i++) {
	        c = str.charAt(i);
	         
	        if (!Character.isDigit(c)) {
	            strBuff.append(c);
	        }
	    }
	    System.out.println(strBuff.toString());
	}
public static void main(String args[]){  
	
	String str = "I am 22 years old.";
	
	getOnlyNumerics(str);
	// System.out.println("Outcome is : "+ str);
}  
}  
