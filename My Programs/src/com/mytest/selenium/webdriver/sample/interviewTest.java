package com.mytest.selenium.webdriver.sample;
import java.util.*;



public class interviewTest { 
	
	public static void maxProduct(int[] arr) {
		
		int temp = 0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Max Product : "+ arr[n-1]*arr[n-2]*arr[n-3]);
	}
	
	
	
	

	public static void main(String[] args)  {
		
		int[] arr = {2,5,7,5,6,8,15,11,9,17};
		maxProduct(arr);
		
		
	}
	
}


	

