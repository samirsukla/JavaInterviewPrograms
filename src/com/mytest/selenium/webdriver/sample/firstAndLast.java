package com.mytest.selenium.webdriver.sample;

public class firstAndLast {
	
	public static void findOccurrance(int[] arr, int num ) {
		
		int first=-1;
		int last = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(num!=arr[i]) {
				continue;
				
			}
			if(first==-1) {
				first = i;
			}
			last=i;
		}
		if(first!=-1) {
			
			System.out.println("First Occurrance :"+ first );
			System.out.println("Last Occurrance :" + last);
		}
	}

	public static void main(String[] args) {
		
		int[] arr = { 1,2,3,3,5,8,3,8,3};
		
		findOccurrance(arr, 3);
		

	}

}
