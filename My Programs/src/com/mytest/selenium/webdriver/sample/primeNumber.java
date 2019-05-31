package com.mytest.selenium.webdriver.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		int m,i;
		
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			m=n/2;
			//System.out.println(m);
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println("Number is not prime");
				}
				else
					System.out.println("Number is prime");
		
			}
	}

}
