package com.mytest.selenium.webdriver.sample;

public class secondLargest {
	
	public static int findSecondLargest(int[] arr) {
		
		
		int temp =0;
		int n = arr.length;
		
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr[n-2];
		
	}

	public static void main(String[] args) {
		
		int arr[] = {4,6,2,8,5};
		
		System.out.println(findSecondLargest(arr));
		
		

	}

}