package com.mytest.selenium.webdriver.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWordsinString {
	
	public static void main(String[] args) {
		
		try {
			String str = " ";
			System.out.println("Enter the String");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str=br.readLine();
			
			int count=1;
			
			for(int i=0; i<str.length()-1;i++) {
				if((str.charAt(i)== ' ')&&(str.charAt(i+1)!=' ')) {
					
					count++;
				}
			}
			System.out.println("No of Words "+ count);
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
		
		
		
	}

}
