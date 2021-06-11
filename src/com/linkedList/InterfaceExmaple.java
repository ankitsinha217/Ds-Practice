package com.linkedList;


interface MyInterface{
	public void sample();
	
}
public class InterfaceExmaple implements MyInterface {
	
	public void sample()
	{
		System.out.println("Helo");
	}
	
	
	public static void main(String args[])
	{
		InterfaceExmaple obj = new InterfaceExmaple();
		obj.sample();
		
	}
	

}
