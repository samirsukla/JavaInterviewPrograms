package com.mytest.selenium.webdriver.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateCharacter {
	
	public void findDuplicateChars(String str) {
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		char[] chr = str.toCharArray();
		
		for(Character ch : chr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for(Character ch : keys) {
			
			if(map.get(ch)>1) {
				System.out.println(ch + ": " +map.get(ch) );
			
		}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		duplicateCharacter dp = new duplicateCharacter();
		dp.findDuplicateChars("java2ee");
		

	}

}
