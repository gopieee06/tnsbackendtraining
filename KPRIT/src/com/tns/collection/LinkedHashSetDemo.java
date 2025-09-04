package com.tns.collection;

//This is Demonstration for Linked Hash Set
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(98);
		hs.add(76);
		hs.add(1);
		hs.add(8);
		hs.add(67);
		
		System.out.println("This is a Linked Hash Set : ");
		for (int i : hs)
			System.out.println(i);
			
		hs.remove(8);
		
		System.out.println("This is a Linked Hash Set after deletion : ");
		for (int i : hs)
			System.out.println(i);
	}

}
