 package com.newPrograms.test;

import java.util.Scanner;

public class MinAndMaxOccuranceCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();
		int[] freq = new int[str.length()];
		char minChar = str.charAt(0);
		char maxChar = str.charAt(0);
		int i, j, min, max;
		
		char[] ch = str.toCharArray();
		
		for(i=0;i<ch.length;i++) {
			freq[i]=1;
			for(j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i]!=' '&&ch[i]!='0') {
					freq[i]++;
					ch[j]='0';
				}
			}
		}
		min=max=freq[0];
		for(i=0;i<freq.length;i++) {
			if(min>freq[i]&&freq[i]!='0') {
				min=freq[i];
				minChar = ch[i];
			}
			if(max<freq[i]) {
				max=freq[i];
				maxChar=ch[i];
			}
		}
		
		System.out.println("Max Occurance of character " + maxChar + " is "+max );
		System.out.println("Min Occurance of character " + minChar + " is "+min);

	}

}
