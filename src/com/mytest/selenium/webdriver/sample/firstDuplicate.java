package com.mytest.selenium.webdriver.sample;

public class firstDuplicate {
	
	
	public static void findFirstDuplicate(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					
					System.out.println("First Duplicate Number is : "+ arr[i]);
					System.exit(0);
				}
				else {
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,4,3};
		findFirstDuplicate(arr);

	}

}
