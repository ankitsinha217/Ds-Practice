package com.linkedList;

public class TestReverse {
	
	public static void reverse(String a)
	{
		
		char b[]=a.toCharArray();
		
		
		String m="";
		String c="";
		for(int i=b.length-1;i>=0;i--)
		{
		   if(!Character.isAlphabetic(b[i]))
		   {
			   m=m+b[i];
		   }
		   c=c+b[i];
			  
		}
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		
		reverse("ab$r#&d");
		//reverse("dr$b#&a");
	}
}
