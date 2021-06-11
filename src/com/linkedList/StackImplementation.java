package com.linkedList;


 class Stack 
{
	int top=-1;
	int arr[]=new int[100];
	
	void push(int data)
	{
		if(top<99)
		{
			top++;
			arr[top]=data;
			
		}
		
	}
	
  int pop()
   {
	if(top>=0)
	{
		top=top-1;
	}
		return arr[top+1];
	
   }
  
  int size()
  {
	  return top;
  }
 
}


public class StackImplementation {
    public static void main(String[] args) {
    	
    	Stack st= new Stack();
    	st.push(10);
    	st.push(20);
        st.size();
        // st.pop();
        System.out.println(st.size());
    
    	
    }
    
}
