package com.datastructurePractice;
import java.util.HashMap;


public class StrringReverse {
	private static void repeated(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else
				map.put(i, 1);
		}
		System.out.print(map);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 1, 6, 5 };
		repeated(arr);
	}
}