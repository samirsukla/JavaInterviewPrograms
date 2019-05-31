package com.mytest.selenium.webdriver.sample;

public class bubbleSort {
	
	static void sortBubble(int[] arr) {
		
		int n = arr.length;
		
		int temp = 0;
		
		for (int i = 0; i<n; i++)
			for(int j=1; j<(n-i); j++)
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
	}

	public static void main(String[] args) {
		int arr[] = {5,15,12,7,18,20,2};
		System.out.println("Array Length = "+arr.length);
		System.out.println("Beofre Bubble sort...");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]+" ");
		
		sortBubble(arr);
		
		System.out.println("After Bubble sort...");
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]+" ");
		

	}

}
