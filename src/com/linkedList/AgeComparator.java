package com.linkedList;

import java.util.Comparator;

class AgeComparator implements Comparator<Studentt> {
	public int compare(Studentt s1, Studentt s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}