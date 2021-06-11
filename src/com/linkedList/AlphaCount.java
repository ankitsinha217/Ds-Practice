package com.linkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class AlphaCount {

	public static int alpha(String st) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] strArr = st.toCharArray();
		for (Character c : strArr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}
		// System.out.println(st+" : "+map);
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		int value = 0;
		char keyCheck = ' ';
		for (Map.Entry<Character, Integer> me : set) {
			// System.out.println(me.getValue());
			if (me.getValue() > value) {
				value = me.getValue();
				keyCheck = me.getKey();
			}
		}
		System.out.println(keyCheck + "===========");
		return value;
	}
	public static void main(String[] args) {
		AlphaCount al = new AlphaCount();
		int s = al.alpha("Hello World");
		System.out.print(s);
	}
}
