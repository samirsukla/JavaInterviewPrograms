package com.mytest.selenium.webdriver.sample;

import java.util.Arrays;

public class reverseArray {
	
	
	public static void reverseTheArray(int[] arr, int x) {
		
		
		for(int i = 0; i<arr.length; i+=x) { 
			int left = i;
			int right = Math.min(i+x-1, arr.length-1);
			while(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		reverseTheArray(arr,3);
		System.out.println(Arrays.toString(arr));
		

	}

}
