package com.newPrograms.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccuranceOfAWordInString {

	public static void main(String[] args) {
		String str = "";
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		String[] words  = str.split(" ");
		for (int i=0;i<words.length;i++) {
			int count = 0;
			Pattern p = Pattern.compile(words[i]);
			Matcher m = p.matcher(str);
			while(m.find()) {
				count++;
			}
			System.out.println("Occurance of "+ words[i]+ " is " + count);
			count=0;
		}
		
		
	}

}
