package com.newPrograms.test;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void removeDuplicate(int arr[], int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[n - 1];
					n--;
					j--;
				}
			}
		}
		int newarr[] = Arrays.copyOf(arr, n);

		System.out.println("After removing the duplicates" + "\n" + Arrays.toString(newarr));

	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 10, 50, 40, 30 };
		int n = arr.length;
		removeDuplicate(arr, n);

	}

}
