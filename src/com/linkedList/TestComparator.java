package com.linkedList;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
	public static void main(String[] args) {
	ArrayList<Studentt> al= new ArrayList<Studentt>();
	al.add(new Studentt(101,"Vijay",23));  
	al.add(new Studentt(106,"Ajay",27));  
	al.add(new Studentt(105,"Jai",21));
	System.out.println("Sorting by Name");  

	Collections.sort(al,new NameComparator());  
	
	for(Studentt st: al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	} 
	
	System.out.println("sorting by Age");  
	
	Collections.sort(al,new AgeComparator());  
 
	for(Studentt st: al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age); 

	}
	
	System.out.println("sorting by Roll");  
	Collections.sort(al,new RollComparator());
	for(Studentt st:al)
	{
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}

}
}
