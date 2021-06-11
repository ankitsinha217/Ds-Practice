package com.linkedList;
import java.util.Iterator;
import java.util.Stack;

public class PStack {
	public static void main(String args[])
	{
		Stack<String> st= new Stack<String>();
		
		st.push("Ankit");
		st.push("Suraj");
		st.pop();
		
		Iterator<String> itr =st.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
