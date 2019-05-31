package com.newPrograms.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class NumberSeresPrograms {

	
	public void starTriangle() {
		
		for(int i=1;i<=5;i++) {
			for(int j=5-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void reverseWords() {
		String str = "";
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		
		String[] words = str.split(" ");
		int len = words.length;
		
		String revWord = "";
		String finalWord = "";
		
		for(int i=0;i<len;i++) {
			String temp = words[i];
			
			for(int j=temp.length()-1;j>=0;j--) {
				revWord+=temp.charAt(j);
			}
			finalWord = finalWord+revWord+" ";
			revWord="";
		}
		System.out.println(finalWord);
	}
	
	@Test
	public void findMaxCharacter() {
		String str = "";
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int maxOccur =0;
		char[] chr = str.toCharArray();
		for(Character ch : chr) {
			if(ch==' ') {
				continue;
			}
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}
			else {
				map.put(ch, 1);
			}
			if(map.get(ch)>maxOccur) {
				maxOccur = map.get(ch);
			}
		}
		
		Set<Entry<Character, Integer>> keys = map.entrySet();
		
		for(Entry<Character, Integer> ch : keys) {
			if(ch.getValue()==maxOccur) {
				System.out.println("Maximum occured character "+ ch.getKey() + "with " + maxOccur + " times");
			}
			if(ch.getValue()==1) {
				System.out.println("Least Occured Character is "+ ch.getKey()+" with"+ch.getValue() + " times");
				break;
			}
		}
		
		
		
		
		
		
		
	}
}