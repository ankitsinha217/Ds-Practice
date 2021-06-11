package com.linkedList;

public class LinkedList {
	Node head;
	
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}
	
	public void traverse()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			System.out.print(temp.data+"  ");
			temp=temp.next;
			
			
		}
		System.out.println("count is:" + count);
		
	}
	
	
	public void insertAtFirst()
	{
		Node n6 =new Node (6);
		n6.next=head;
		head=n6;
		
	}
	
	
	public void insertAtLast()
	{
		Node n7 =new Node(7);
		Node temp =head;
		while(temp.next!=null)
		{
			
			temp=temp.next;
		}
		temp.next=n7;
	}
	
	public void midElement()
	{
		Node slow=head;
		Node fast=head;
		if(fast.next!=null)
		{
			while(slow!=null && fast.next!=null )
			{
				slow=slow.next;
				fast=fast.next.next;
			}
			System.out.println("Middle Element:" + slow.data);
		}
	}
	
	public void insertAtMiddle(int data, int key)
	{
		Node n7 = new Node(data);
		Node temp = head;
		int count = 1;
		
		while(temp.next!=null)
		{
			if(++count==key)
			{
				n7.next=temp.next;
				temp.next=n7;
			}
			temp = temp.next;
			
		}	
	}
	
	public void deleteAtfirst()
	{
		head=head.next;
	}
	
	public void exchange()
	{
		Node temp=head;
		while(temp.next.next!=head)
		{	
			temp=temp.next;	
			
		}	
		
		Node n=temp.next;
		
		
	}
	
	public void deletelast()
	{
		Node temp=head;
		while(temp.next.next!=null)
		{		
			temp=temp.next;
		}	
		temp.next=null;
	}
	
	
	public void reverse()
	{
		Node current=head;
		Node next=null;
		Node prev=null;
		
		while(current!=null)
		{
			next=current.next;//next=2,prev=2,current=2
			current.next=prev;
			prev=current;
			current=next;
		}
		current = prev;
		System.out.println(current.data);
      
		
	}
	
	
	public static void main(String args[])
	{
		LinkedList list= new LinkedList();
		list.head=new Node(1);
		Node n2 =new Node(2);
		Node n3= new Node(3);
		Node n4= new Node(4);
		Node n5= new Node(5);
		
		list.head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		//list.traverse();
		//list.insertAtFirst();
	/*	list.traverse();
		list.insertAtLast();
		list.traverse();
		list.midElement();
		list.traverse();
		list.insertAtMiddle(20,4);
		list.traverse();
		*/
		
		list.reverse();
		list.traverse();
		
		
		
		
	}

}
