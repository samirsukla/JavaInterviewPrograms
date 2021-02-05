package com.newPrograms.test;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String str = "samir123$%@abc";
		System.out.println(returnOnlyStrings(str));


	}
	
	public static String returnOnlyStrings(String str) {
		
		String result = str.replaceAll("[^a-zA-Z0-9]", "");
		return result;
		
	}

}
