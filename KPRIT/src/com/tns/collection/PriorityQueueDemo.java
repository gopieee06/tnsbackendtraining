package com.tns.collection;

import java.util.PriorityQueue;

//Demo for Priority Queue
public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(2);
		pq.add(1);
		pq.add(7);
		pq.add(5);
		pq.add(9);
		
		System.out.println("This is Priority Queue");
		for (int i : pq)
			System.out.println(i);
	}

}
