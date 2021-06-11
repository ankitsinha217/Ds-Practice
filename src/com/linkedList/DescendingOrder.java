package com.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DescendingOrder {
	
	
	public void desc(ArrayList<Integer> al)
	{
		
		
	    Comparator cmp = Collections.reverseOrder();  
		Collections.sort(al,cmp); 
	
		System.out.println("After Sorting");
		for(Integer h:al)
		{
			System.out.println(h);
		}
	}

	public static void main(String[] args) {
		
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(25);
	al.add(20);
	al.add(30);
	al.add(10);
	al.add(80);
	DescendingOrder obj =new DescendingOrder();
	obj.desc(al);
	
	Collections.sort(al);
	
	
	
	
	}

}
