package com.datastructurePractice;

interface Drawable{
	void display();
}
class A implements Drawable{
	public void display()
	{
		System.out.println("In A");
	}
}
class B implements Drawable{
	public void display()
	{
		System.out.println("In B");
	}
}
class C implements Drawable{
	public void display()
	{
		System.out.println("In C");
	}
}
public class InterfacePractice {
	public static void main(String[] args) {
		Drawable d= new B();
		d.display();
	}
}
