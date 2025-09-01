package com.tns.collection;

import java.util.ArrayList;
import java.util.List;

//Array List demo
public class ListDemo {

	public static void main(String[] args) {
		
		List<String> arr= new ArrayList<String>();
		
		arr.add("Car");
		arr.add("BMW");
		arr.add("Gopi");
		arr.add("BMW");
		arr.add("Gopi");
		arr.add("Mustang");
		
		for (String el : arr)
			System.out.println(el);
		

	}

}
