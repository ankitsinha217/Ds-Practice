package com.linkedList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseUsingLIst4 {
	
	public void reverse(ArrayList<Integer> al )
	{
		Collections.reverse(al);
		System.out.println("Reverse");
		for(Integer b:al)
		{
			System.out.println(b);
		}
	}
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(14);
		al.add(5);
		ReverseUsingLIst4 obj =new ReverseUsingLIst4();
		obj.reverse(al);
		Collections.sort(al);
		
		for(Integer i:al)
		{
			System.out.println(i);
		}
	}

}
