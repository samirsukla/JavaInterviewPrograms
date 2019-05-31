package com.newPrograms.test;

public class FindLCMOfArray {
	
	public static void findLCM(int n, int[] arr) {
		int min,max,x,lcm =0;
		for (int i=0; i<n;i++) {
			for(int j=i+1;j<n-1;j++) {
				if(arr[i]>arr[j]) {
					min = arr[j];
					max = arr[i];
				}
				else {
					min = arr[i];
					max = arr[j];
				}
				for(int k=0;k<n;k++) {
					x=k*max;
					if(x%min==0) {
						lcm=x;
					}
				}
			}
			
		}
		System.out.println("LCM of the Given Array " + lcm);
	}

	public static void main(String[] args) {
		int[] arr = {25,50,125,625};
		int n = arr.length;
		
		findLCM(n,arr);
		
		

	}

}
