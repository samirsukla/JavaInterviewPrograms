package com.newPrograms.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort2DArray {

	public static void main(String[] args) {
		int[][] tdarr = {{1,3,6,2},
						 {5,1,9,3},
						 {7,10,5,2}};
		
		int[] unsortedarr = convert2dto1darray(tdarr);
		System.out.println("Unsorted Array = "+ Arrays.toString(unsortedarr));
		int[] sortedarray = sortedArray(unsortedarr);
		System.out.println("Sorted Array = "+ Arrays.toString(sortedarray));
		
		int[][] newArr = convert1dto2darray(sortedarray,3,4);
		
		System.out.println("New Sorted 2D Array is " + Arrays.deepToString(newArr) );
		
		
		}
	
	public static int[] convert2dto1darray(int[][] arr) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				list.add(arr[i][j]);
			}
		}
		
		int[] odarr = new int[list.size()];
		for(int i=0;i<odarr.length;i++) {
			odarr[i] = list.get(i);
		}
		
		return odarr;
		
	}
	
	public static int[] sortedArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<(arr.length-i);j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
		
	}
	
	public static int[][] convert1dto2darray(int[] arr, int rows, int cols){
		
		int[][] new2darr = new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
				new2darr[i][j] = arr[(i*cols)+j];
				
			}
		}
		return new2darr;
		
	}

	}


