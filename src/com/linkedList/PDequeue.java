package com.linkedList;
import java.util.ArrayDeque;
import java.util.Deque;

public class PDequeue {
	public static void main(String args[])
	{
		Deque<String> deq= new ArrayDeque<String>();
		
		deq.add("Ankit");
		deq.add("Chera");
		
		for(String d:deq)
		{
			System.out.println(d);
		}
	}

}
