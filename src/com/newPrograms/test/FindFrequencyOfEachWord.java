package com.newPrograms.test;

import java.util.*;

public class FindFrequencyOfEachWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String string = input.nextLine();
		String[] st = string.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String str = "";
		for (int i = 0; i < st.length; i++) {
			str += st[i] + " ";
		}
		str = str.toLowerCase();
		int count = -1;
		for (int i = 0; i < str.length(); i++) {
			if ((!Character.isLetter(str.charAt(i))) || (i + 1 == str.length())) {
				if (i - count > 1) {
					if (Character.isLetter(str.charAt(i)))
						i++;
					String word = str.substring(count + 1, i);
					if (map.containsKey(word)) {
						map.put(word, map.get(word) + 1);
					} else {
						map.put(word, 1);
					}
				}
				count = i;
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(map.values());
		Collections.sort(list, Collections.reverseOrder());
		int last = -1;
		for (Integer i : list) {
			if (last == i)
				continue;
			last = i;
			for (String s : map.keySet()) {
				if (map.get(s) == i)
					System.out.println(s + ":" + i);
			}
		}
	}
}