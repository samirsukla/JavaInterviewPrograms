package com.mytest.selenium.webdriver.sample;

public class PrimeNumbers {

	public static void main(String[] args) { 
		
		
		int num=0;
		String prime = "";
		 for(int i=1;i<=100;i++) {
			 
			 int count = 0;
			 for(num=i;num>=1;num--) {
				 if(i%num==0) {
					 count++;
				 }
			 }
			 if(count==2) {
				 prime = prime +i+" ";
				 
			 }
		 }
		System.out.println("Prime Numbers are : ");
		System.out.println(prime);
		
		

	}

}
