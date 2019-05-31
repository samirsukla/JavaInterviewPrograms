package com.mytest.selenium.webdriver.sample;

import java.io.BufferedReader;
import java.io.FileReader;

public class countWordsinFile {

	public static void main(String[] args) throws Exception {
		
		
		System.out.println("Counting Words");
		FileReader fr= new FileReader("C:\\Users\\IBM_ADMIN\\Downloads\\Selenium_Setup\\CountWords.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int count=0;
		while(line!=null) {
			String[] parts = line.split(" ");
			for(String s : parts) {
				count++;
			}
			line = br.readLine();
		}
       System.out.println("No of Words " + count);
	}

}
