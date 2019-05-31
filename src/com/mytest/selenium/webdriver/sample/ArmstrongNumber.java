package com.mytest.selenium.webdriver.sample;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		int temp = number;
		int noOfDigit = String.valueOf(number).length();
		int sum=0;
		while(number!=0) {
			int lastDigit = number%10;
			int finalSum =1;
			for(int i=0; i<noOfDigit; i++) {
				finalSum = finalSum*lastDigit;
				
			}
			sum=sum+finalSum;
			number=number/10;
		}
		
		if(temp==sum) {
			System.out.println(temp + " is Armstrong Number");
			
		}
		else {
			System.out.println(temp + " is not Armstrong Number");
		}
		
	
		
	}
	

}
