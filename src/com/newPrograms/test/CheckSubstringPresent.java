package com.newPrograms.test;

public class CheckSubstringPresent {

	public static void main(String[] args) {
		String str1 = "name";
		String str2 = "my name is samir";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		int n1 = ch1.length;
		int n2 = ch2.length;
		int count =0;
		
		
		for (int  i=0;i<n1;) {
			for(int j=0;j<n2;j++) {
			if(ch1[i]==ch2[j]) {
				count++;
				++i;
				//continue;
				
			}
			if(count==n1){
			break;
			}
		}
		}
		if(count==n1) {
			System.out.println("Substring Found");
		}
		else {
			System.out.println("Substring not found");
		}

	}

}
