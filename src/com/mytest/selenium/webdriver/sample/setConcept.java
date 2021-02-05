package com.mytest.selenium.webdriver.sample;

import java.util.Set;
import java.util.*;

public class setConcept {

	public static void main(String[] args) {
		
		try {
			Set ts = new TreeSet(new myComparator());
			ts.add("Samir");
			ts.add("Bunty");
			ts.add("Ashish");
			ts.add("Raj");
			ts.add("Dhiru");
			ts.add("Samir");
			
			System.out.println(ts);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}

}

class myComparator implements Comparator{
	@Override
	public int compare(Object obj1,Object obj2) {
		
		String s1 = (String)obj1;
		String s2 = (String)obj2;

		return 1;
		
	}
	
}

