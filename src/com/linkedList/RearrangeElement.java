package com.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class RearrangeElement {
	
	
	public void arrange(ArrayList<String>al)
	{
		Collections.sort(al, new Comparator<String>(){
			
			public int compare(String X,String Y)
			{
				String XY=X+Y;
				String YX=Y+X;
				System.out.println(XY+"----"+YX);
			return XY.compareTo(YX)>0 ? -1:1;
		    }
		
		
	});
		
		Iterator it = al.iterator();
	    while(it.hasNext())
	      System.out.print(it.next());
	    
	   
	     
	    }
	
	
	public static void main(String args[])
	{
		ArrayList<String> al =new ArrayList<String>();
		
		al.add("18");
		al.add("10");
		al.add("25");
		
		
		RearrangeElement obj =new RearrangeElement();
		obj.arrange(al);
		
	}

}
