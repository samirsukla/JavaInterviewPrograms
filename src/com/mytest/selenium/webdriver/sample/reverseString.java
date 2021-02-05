package com.mytest.selenium.webdriver.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reverseString {

	public static void main(String[] args) {
		
		
		String name = "Samir Kumar Sukla";
		char[] input = name.toCharArray();
		List<Character> trial1 = new ArrayList<Character>();
		for(char c : input)
		{
			trial1.add(c);
		}
		Collections.reverse(trial1);
		ListIterator li = trial1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

	}

}
