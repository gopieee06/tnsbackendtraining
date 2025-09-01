package com.tns.collection;

import java.util.HashSet;
import java.util.Set;

//Set demonstration 
public class SetDemo {
	
	public static void main(String args[]) {
		
	Set<String> s = new HashSet<String>();
	
	s.add("car");
	s.add("bMW");
	s.add("gopi");
	s.add("bMW");
	s.add("gopi");
	s.add("mustang");
	
	System.out.println("This is a set : ");
	for (String el : s) 
		System.out.println(el);
	
	}
}
