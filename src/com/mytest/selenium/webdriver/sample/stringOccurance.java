package com.mytest.selenium.webdriver.sample;

import java.util.Scanner;

public class stringOccurance {

	public static void main(String[] args) {
		
		String str;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		
		str = sc.nextLine();
		//char[] input = str.toCharArray();
		int len = str.length();
		
		for(int i=0;i<len;i++) {
			for(int j=i+1; j<len;j++) {
				if(str.charAt(i)==' ' || str.charAt(i)=='.')
				{
					break;
				}
				
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					continue;
					
				}
				
				
			}
			System.out.println("Character : " +str.charAt(i) + "Count : " + (count+1) );
			count=0;
		}
		
	}

}
