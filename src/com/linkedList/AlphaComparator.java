package com.linkedList;
import java.util.ArrayList;
import java.util.Collections;

public class AlphaComparator {
	
	public void show(ArrayList<String> al)
	{
		
		Collections.reverse(al);
		
		
		for(String i:al)
		{
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("hellojava");
		al.add("rahul");
		
		AlphaComparator obj =new AlphaComparator();
		obj.show(al);
	
		

	}

}
