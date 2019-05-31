package com.newPrograms.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class RemoveDuplicatesFromString {
	
	public static void removeDuplicateCharacter(String str){
		
		
		char[] chr  = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for (Character ch : chr) {
			set.add(ch);
		}
		StringBuilder sb = new StringBuilder();
		for (Character chrs : set) {
			sb.append(chrs);
			
		}
		System.out.println(sb.toString());
		
		
//	    String result = "";
//	    for (int i = 0; i < str.length(); i++) {
//	        if(!result.contains(String.valueOf(str.charAt(i)))) {
//	            result += String.valueOf(str.charAt(i));
//	        }
//	    }
//System.out.println(result);
}


	public static void main(String[] args) {
		
		String str = "Samir Kumar Sukla";
		removeDuplicateCharacter(str);

	}

}
