package com.linkedList;

import com.linkedList.LinkedList.Node;

public class ReverseLinkedList {
	Node head;
	public void printe()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;	
		}
	}
	public static void main(String args[])
	{
		LinkedList l= new LinkedList();
		l.head= new Node(1);
		l.head.next=new Node(2);
		l.head.next.next=new Node(3);
		ReverseLinkedList rev= new ReverseLinkedList();	
	}
}
