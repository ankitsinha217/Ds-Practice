package com.linkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



import java.util.Set;

public class ReverseUsingTreeMap {
	
	
	public void reverse(TreeMap<Integer,String> t)
	{
		
		Set set = t.entrySet(); 
        Iterator i = set.iterator(); 
        while (i.hasNext()) { 
           Map.Entry m=(Map.Entry)i.next();
            System.out.print(m.getKey() + ": "); 
            System.out.println(m.getValue()); 
        } 
	
		 
	}
	
	public static void main(String args[])
	{
		ReverseUsingTreeMap obj =new ReverseUsingTreeMap();
		
		TreeMap<Integer,String> t =new TreeMap<Integer,String>(Collections.reverseOrder());
		
		t.put(1, "Welcome");
		t.put(2, "To");
		t.put(3,"New");
		obj.reverse(t);
			
	}

}
