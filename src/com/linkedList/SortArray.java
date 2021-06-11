package com.linkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class SortArray {
	
	
	static void sort(Vector<Integer> v)
	{
	     Collections.sort(v, new
                 Comparator<Integer>(){
public int compare(Integer X, Integer Y) {
return X.compareTo(Y) > 0 ? 1:-1;
}
});
	     
	     Iterator it = v.iterator();
		    while(it.hasNext())
		        System.out.print(it.next()+" ");
	}
	public static void main(String[] args) {
		SortArray s= new SortArray();
		Vector<Integer> v= new Vector<Integer>();
		v.add(23);
		v.add(12);
		v.add(2);
		v.add(2);
	    sort(v);	
	}
}