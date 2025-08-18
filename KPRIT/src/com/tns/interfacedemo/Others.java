package com.tns.interfacedemo;

import java.util.Scanner;

public class Others implements Phones{
	
	
	@Override
	public void Phone(String model) {
		System.out.println("Brand name of the Phone is " + model);
		System.out.println("Screen Type is LED/LCD/OLED/POLED.");
		System.out.println("Processor is Snapdragon/Mediatech/Tensor");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the budget of the phone : ");
		int budget = sc.nextInt();
		
		if (budget >= 80000) {
			System.out.println( model + "is Fagship killer Phone.");
		}
		else if (budget >= 50000) {
			System.out.println( model + "is Fagship and Stable performance phone.");
		}
		else 
			System.out.println( model + "is Good Budget phone");
	}

}
