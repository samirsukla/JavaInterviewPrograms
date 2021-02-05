package com.newPrograms.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PresenceofAllAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		 for(Character chr : ch) {
			 if(Character.isLetter(chr)) {
				 set.add(chr);
			 }
		 }
		 if(set.size()==26) {
			 System.out.println("All the characters present in the String");
		 }
		 else {
			 System.out.println("Few Characters are missing in the String");
		 }
	}

}
