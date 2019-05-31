package com.mytest.selenium.webdriver.sample;

import java.util.Scanner;

public class Sample_test {
	
	public static void main(String[] args) {
		
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String");
		input = sc.nextLine();
		
		int i, begin=0;
		int end = input.length()-1;
		int middle = (begin+end)/2;
		 for (i=begin;i<=middle;i++) {
			 if(input.charAt(begin)==input.charAt(end)) {
				 begin++;
				 end--;
			 }
			 else
				 break;
			 
		 }
		 if(i==middle+1) {
			 System.out.println("String is Palindrome");
		 }
		 else {
			 System.out.println("Not palindrome");
		 }
	}

}
