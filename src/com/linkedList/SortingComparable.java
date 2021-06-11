package com.linkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student implements Comparable<Student>
{
	int roll;
	String name;
	int age;
	Student(int roll,String name,int age)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
	}	
	public int compareTo(Student st)
	{
		if(roll==st.roll)
			return 0;
		if(roll>st.roll)
			return 1;
		else
			return -1;
	}
}
public class SortingComparable {
	public static void main(String[] args) {
		ArrayList<Student> al =new ArrayList<Student>();
		al.add(new Student(107,"Viju",23));
		al.add(new Student(102,"Ajay",24));
		al.add(new Student(103,"Rahul",25));
		Collections.sort(al);
		for(Student st:al)
		{
			System.out.println(st.roll+" "+st.age+" "+st.name);
		}	
	}
}
