package com.linkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Abc {
	
	
	
	public static void count(ArrayList<Integer>l)
	{
     HashMap<Integer,Integer> lt =new HashMap<Integer,Integer>();
     
    for(Integer s:l)
    {
    	Integer j=lt.get(s);
    	System.out.println("j---"+j);
    	lt.put(s, (j==null)?1:j+1);
    }
    
    for(Map.Entry m:lt.entrySet())
    {
    	System.out.println(m.getKey()+"Occurance "+m.getValue());
    }
		
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(1);
		l.add(2);
		
		Abc obj=new Abc();
		
		obj.count(l);		
		
		
		
	}
}
