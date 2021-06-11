package com.linkedList;
import java.util.Iterator;
import java.util.LinkedList; 

public class PLinkedList {
	public static void main(String args[])
	{
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ram");
		al.add("Shyam");		
		Iterator<String> itr =al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
