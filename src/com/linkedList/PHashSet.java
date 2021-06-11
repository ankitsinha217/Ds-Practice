package com.linkedList;
import java.util.HashSet;
import java.util.Iterator;

public class PHashSet {
	public static void main(String args[])
	{
		HashSet<String> hs= new HashSet<String>();
		hs.add("Ram");
		hs.add("Shyam");
		hs.add("Ram");
		hs.add("Ankit");
		
		Iterator<String> itr=hs.iterator();
	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
