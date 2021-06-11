package com.datastructurePractice;
import com.datastructurePractice.LinkedListTraversal.LinkedList.Node;

public class LinkedListTraversal {
   public static class LinkedList{
	   Node head;  
	  static  class Node
	   {
		   int data;
		   Node next;
		   Node(int data)
		   {
			   this.data=data;
		   }   
	   }  
	  public  void traverse()
	  {
		  Node temp=head;
		  while(temp!=null)
		  {
			  System.out.print(temp.data);
			  temp=temp.next;
 		  }
	  }
	  public void deleteAtFirst()
	  {
		head=head.next; 
	  } 
	  public void deleteAtLast()
	  {
		  Node temp=head;
		  while(temp.next.next!=null)
		  {
			  temp=temp.next;
		  }
		  temp.next=null;
	  }
	  public void insertAtFirst()
	  {
		Node n6= new Node(6);
		n6.next=head;
		System.out.println("n6.next=="+n6.next.data);
		head=n6;
	  }
	  
	  public void insertAtLast()
	  {
		  Node temp=head;
		  Node n7= new Node(7);
		  while(temp.next!=null)
		  {
			  temp=temp.next;
		  }
		  temp.next=n7; 
	  }
	  
	  public void insertAtMiddle()
	  {
		  Node n9= new Node(9);
		  Node fast=head;
		  Node slow=head;
		 if(fast.next.next!=null)
		 {
			 while(fast.next.next!=null)
			 {
				 slow=slow.next;
				 System.out.println("slow:"+slow.data);
				 fast=fast.next.next;
				 System.out.println("fast:"+fast.data);
			 }
		 }
		n9.next=slow.next;
		slow.next=n9;
		//System.out.print(n9.next.data);
	  }
   }

	public static void main(String[] args) {	

		LinkedList list = new LinkedList();
	
		Node n1=  new Node(1);
		Node n2=  new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n10 = new Node(10);
		list.head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n10;
		//list.traverse();	
		//list.deleteAtFirst();
		//list.traverse();
		//list.deleteAtLast();
		//list.traverse();
		//list.insertAtFirst();
		//list.traverse();
		//list.insertAtLast();
		//list.traverse();
		list.insertAtMiddle();
		list.traverse();	
	}
}