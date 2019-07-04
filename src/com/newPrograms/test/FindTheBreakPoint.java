package com.newPrograms.test;

public class FindTheBreakPoint {

	public static void main(String[] args) {
		int[] arr = {1,2,2,4,1,3,2,5};
		int n = arr.length;
		System.out.println("The breakpoint is " + findBreakPoint(arr, n));

	}
	
	public static int findBreakPoint(int[] arr,int n) {
		
		int leftSum=0;
		int rightSum =0;
		int breakpoint =-1;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				rightSum+=arr[j];
			}
			leftSum+=arr[i];
			if(leftSum==rightSum) {
				breakpoint = i+1;
			}
			//leftSum=0;
			rightSum=0;
		}
		
		return breakpoint;
		
		
	}

}
