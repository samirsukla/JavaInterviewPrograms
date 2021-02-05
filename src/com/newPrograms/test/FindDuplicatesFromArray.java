package com.newPrograms.test;

public class FindDuplicatesFromArray {
	public static void findDuplicate(int arr[], int n) {
		
		
		
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					}
			}
			if(count==1) {
				System.out.println(arr[i]);
				
			}
			count=0;
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {1,3,5,4,2,5,3,7,9,3,9};
		int n = arr.length;
		findDuplicate(arr, n);

	}

}
