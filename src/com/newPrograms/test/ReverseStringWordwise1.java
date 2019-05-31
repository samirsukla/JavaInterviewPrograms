package com.newPrograms.test;

import java.util.Scanner;

public class ReverseStringWordwise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.");
		String str = sc.nextLine();

		String[] words = str.split(" ");
		int len = words.length;
		String revWord = "";
		String finalword = "";

		for (int i = 0; i <=len-1; i+=2) {
			String word ="";
			if(i==(len-1)) {
				word = words[i];
				break;
			}
			
			 word = words[i];
			
				String word1 = words[i + 1];
				for (int j = word1.length() - 1; j >= 0; j--) {
					revWord += word1.charAt(j);
				}
				
				finalword = finalword + word +" "+ revWord+ " ";
				revWord = "";
			
		}

		System.out.println(finalword);

	}

}
