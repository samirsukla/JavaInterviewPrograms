package com.mytest.selenium.webdriver.sample;



public class interviewTest { 
	
	public static void maxProduct(int[] arr) {
		
		int temp = 0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		//System.out.println("Max Product : "+ arr[n-1]*arr[n-2]*arr[n-3]);
		int smallest = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]!=smallest) {
				System.out.println("Second Smallest Number is "+ arr[i]);
				break;
			}
		}
	}
	
	
	
	

	public static void main(String[] args)  {
		
		int[] arr = {2,5,7,5,6,8,2,15,11,9,17};
		maxProduct(arr);
		
		
	}
	
}


	

