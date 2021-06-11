package com.datastructurePractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorUse implements Comparator<Student> {
	@Override
     public int  compare(Student s1, Student s2) {
		 return s1.getSalary()-s2.getSalary();
	}
	public static void main(String[] args) {
		ComparatorUse obj = new ComparatorUse();
		TreeSet<Student> set = new TreeSet<Student>(obj);
		set.add(new Student(101, "Alex", 1000));
		set.add(new Student(102, "Mica", 1200));
		set.add(new Student(103, "Roland", 1100));
		set.add(new Student(104, "Defend", 900));
		Iterator<Student> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}