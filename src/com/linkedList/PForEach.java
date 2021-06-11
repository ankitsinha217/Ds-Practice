package com.linkedList;
import java.util.ArrayList;

public class PForEach {
	public static void main(String args[])
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Mongo");
		ar.add("Banan");
		ar.add("Guava");
		
	   for(String v:ar)
	   {
		System.out.println(v);
	   }
	}

}
