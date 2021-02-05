package com.mytest.selenium.webdriver.sample;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckPalindrome {
	public static void main(String[] args) {

		String str = "ababa";

		System.out.println("Number of palindromes are " + sendSubString(str));

	}

	public static boolean checkPalindrome(String str) {
		int left = 0;
		int i;
		int right = str.length() - 1;
		int middle = (left + right) / 2;
		for (i = left; i <= middle; i++) {

			if (str.charAt(left) == str.charAt(right)) {

				left++;
				right--;
			}

			else {

				break;
			}

		}
		if (i == middle + 1) {

			return true;
		}

		else {
			return false;
		}
	}

	public static int sendSubString(String str) {

		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				String temp = str.substring(i,j+1);
				
				if (temp.length()>1 && checkPalindrome(temp)) {
					count++;
				}
			}

		}
		return count;
	}
	
	public static boolean formPalindrome(String str) {

		boolean centerUsed = false;
		char center = 0;
		char c;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			count = 0;

			for (int j = 0; j < str.length(); j++)
				if (str.charAt(j) == c)
					count++;

			if (count % 2 == 1) {
				if (centerUsed == true && center != c)
					return false;
				else {
					centerUsed = true;
					center = c;
				}
			}
		}

		return true;

	}
	
	
}
