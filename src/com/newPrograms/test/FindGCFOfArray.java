package com.newPrograms.test;

public class FindGCFOfArray {
	
	public static void findGCF(int n, int[] arr) {
		int result = arr[0];
	      int i = 1;
	      while(i<n)
	      {
	         if(arr[i]%result==0)
	         {
	            i++;
	         } else {
	            result = arr[i]%result;
	            i++;
	         }
	      }
	      System.out.println("GCF is "+result);
		
	}

	public static void main(String[] args) {
		
		int[] arr = {45,63,18,81};
		int n = arr.length;
		findGCF(n, arr);


	}

}
