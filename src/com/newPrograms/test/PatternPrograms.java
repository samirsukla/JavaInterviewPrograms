package com.newPrograms.test;

public class PatternPrograms {
	
	public static void starTriangle() {
		
		for(int i=1;i<=5;i++) {
			for(int j=5-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
//			for(int j=1;j<=i-1;j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}	
	public static void main(String[] args) {
		starTriangle();
	}

}
