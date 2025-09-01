package com.tns.collection;

import java.util.LinkedList;

//Demo for linked list 
public class LinkedListDemo {
	
	public static void main(String args[]) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(5);
		l.add(7);
		l.add(76);
		l.add(9);
		l.add(78);
		l.add(1);
		
		System.out.println("This is Linked List");
		for (int el : l) 
			System.out.println(el);
		
		
		l.remove(3);
		l.remove(1);
		System.out.println("This is Linked List after Deletion ");
		for (int el : l) 
			System.out.println(el);

		
	}
	

}
