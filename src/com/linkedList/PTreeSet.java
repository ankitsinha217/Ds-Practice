package com.linkedList;
import java.util.Iterator;
import java.util.TreeSet;

public class PTreeSet {
	public static void main(String args[])
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(1);
		t.add(10);
		t.add(7);
		t.add(6);
		t.add(10);
		
		Iterator<Integer> itr=t.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
