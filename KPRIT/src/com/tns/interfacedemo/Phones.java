package com.tns.interfacedemo;
//Demo for interfaces


//creating the interface
public interface Phones {
	
	
	//Abstract method
	public void Phone(String model);
	
	//default method
	default void uses() {
		System.out.println("defaut features are  : Calls, Sms, Photos");
	}
	
}
