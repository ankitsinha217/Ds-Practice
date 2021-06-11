package com.linkedList;

import java.util.ArrayList;
import java.util.*;


public class PArrayList {
	public static void main(String args[])
	{
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("Ankit");
		obj.add("Ram");
		obj.add("Shyam");
		
		Iterator  itr =obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
