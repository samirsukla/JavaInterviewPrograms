package com.mytest.selenium.webdriver.sample;

public class reverseNumber {

	public static void main(String[] args) {
		int n = 768;
		int i,reverse=0;
		while(n!=0) {
			i=n%10;
			reverse=reverse*10 + i;
			n=n/10;
		}

		System.out.println(reverse);
	}

}
