package com.newPrograms.test;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
//		String reversed = reverseString(str);
//		System.out.println(reversed);

		reverseString(str);

	}

	public static void reverseString(String str) {
		if(!str.isEmpty()) {
		int len = str.length();

		System.out.print(str.charAt(len - 1));

		String temp = str.substring(0, len - 1);

		reverseString(temp);
		}
	}

}
