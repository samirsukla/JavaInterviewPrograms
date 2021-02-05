package com.newPrograms.test;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int arr1[][] = {{1,2,3},{7,8,9},{4,5,6}};
		int arr2[][] = {{2,3,5},{7,1,2},{3,6,4}};
		int result[][] = new int[3][3];
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				result[i][j] = arr1[i][j]-arr2[i][j];
				System.out.print(result[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
