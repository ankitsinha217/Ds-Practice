package com.datastructurePractice;

abstract class Bankk{
	abstract int rate();
}
class SBI extends Bankk{
	public int rate()
	{
		return 10;
	}
}
class Pnb extends Bankk{
	public int rate()
	{
		return 20;
	}
}
class Vocab extends Bankk{
	public int rate()
	{
		return 30;
	}
}
public class AbstractPractice {
	public static void main(String[] args) {
    Bankk obj =new Vocab();
    
    System.out.println(obj.rate());
	}
}