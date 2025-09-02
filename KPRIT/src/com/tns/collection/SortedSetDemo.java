package com.tns.collection;

import java.util.Set;
import java.util.TreeSet;

//This is a Demo for Sortedset
public class SortedSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<Integer>();
		s.add(5);
		s.add(3);
		s.add(1);
		s.add(8);
		s.add(9);
		
		System.out.println("This is Sorted Set : ");
		for(int i : s)
			System.out.println(i);
	}

}
