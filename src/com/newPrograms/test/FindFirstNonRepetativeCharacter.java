package com.newPrograms.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstNonRepetativeCharacter 
{ 
	static char[] count = new char[256];
	
    public static void main(String[] args) 
    { 
    	String str = "bangaloreb";
    	
    	findFirstNonRepetativeChars(str);
    } 
    
    public static void findCharCount(String str) {
    	
    	for(int i=0;i<str.length();i++) {
    		count[str.charAt(i)]++;
    	}
    }
    
    public static void findFirstNonRepetativeChar(String str) {
    	
    	findCharCount(str);
  
    	for(int i=0;i<str.length();i++) {
    		if(count[str.charAt(i)]==1) {
    			System.out.println("First Non-repeating character is : "+str.charAt(i));
    			break;
    		}
    	}
    		
    }
    
    public static void findFirstNonRepetativeChars(String str) {
    	int count=0;
    	for(int i=0;i<str.length();i++) {
    		for(int j=0;j<str.length();j++) {
    			if(str.charAt(i)==str.charAt(j)) {
    				count++;
    			}
    		}
    		if(count==1) {
    			System.out.println("First Non-repeating character is : "+str.charAt(i));
    			break;
    		}
    		count=0;
    	}
    }
    
    
    
} 