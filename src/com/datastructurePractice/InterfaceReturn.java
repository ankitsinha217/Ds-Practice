package com.datastructurePractice;


interface Bank{
	int add();
}
class Z implements Bank{
   public int add()
	{
		return 95;
	}
}

class Y implements Bank
{
	public int add()
	{
		return 20;
	}
}
class W implements Bank{
	public int add()
	{
		return 90;
	}
}
public class InterfaceReturn {

	public static void main(String[] args) {
    Bank b= new W();
    b.add();
    Bank c= new Y();
    System.out.println(c.add());
    System.out.println(b.add());
	}

}
