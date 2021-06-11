package com.linkedList;
import java.util.HashMap;

import java.util.*;
public class Pmap {
	public static void main(String args[])
	{
		HashMap<Integer,String> map =new HashMap<Integer,String>();
		map.put(1, "Ram");
		map.put(2, "Ankit");
		map.put(3, "shaym");
		
	  for(Map.Entry m:map.entrySet())
	  {
		  System.out.println(m.getKey()+""+m.getValue());
	  }
		
		
	}

}
