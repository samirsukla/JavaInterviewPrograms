package com.mytest.selenium.webdriver.sample;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		
		String a = "Samir";
		String b = "Sukla";
		a=a+b;
		System.out.println("New String = "+a );
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		
		System.out.println("a= "+ a);
		System.out.println("b= "+ b);
	}
		
	

}
