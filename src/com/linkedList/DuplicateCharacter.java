package com.linkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacter {
	public static void main(String args[])
	{
		String str="Hellwoorld";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
		
		char[]c=str.toCharArray();
		
		for(Character ch :c)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
				
			}
			else  
                map.put(ch, 1);
		}
		Set<Character> keys = map.keySet();  
        for (Character ch : keys) {  
            if (map.get(ch) > 1) {  
                System.out.println(ch + "  is " + map.get(ch) + " times");  
            }  
	}
	}

}
