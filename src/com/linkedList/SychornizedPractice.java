package com.linkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SychornizedPractice {
	public static void main(String args[])
	{
		ArrayList<String> list =new ArrayList<String>();
		list.add("Java");
		list.add("Struts");
		list.add("Html");
		list.add("Css");
		list.add("Case");	
		List<String> synchornizedList = Collections.synchronizedList(list) ;
		synchronized(synchornizedList)
		{
			Iterator<String> itr = synchornizedList.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}
