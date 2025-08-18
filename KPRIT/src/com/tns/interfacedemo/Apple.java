package com.tns.interfacedemo;

//Apple implements Phones
public class Apple implements Phones {
	
	@Override
	public void Phone(String model) {
		System.out.println("Brand name of the Phone is " + model + ".");
		System.out.println("Screen Type is OLED." );
		System.out.println("Processor is A series Chipse. ");
		System.out.println("Apple " + model + " is Good Flagship killer phone.");
	}
	
	

}
