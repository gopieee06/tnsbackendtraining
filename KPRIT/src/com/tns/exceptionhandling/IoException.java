package com.tns.exceptionhandling;
//Demo for Wrong input Exception Handling Demo

import java.util.InputMismatchException;
import java.util.Scanner;


public class IoException {
	public static void main(String args[]) {
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		try {
			num = sc.nextInt();
			for(int i=1;i<=num;i++) {
				sum = sum + i;
			}
			System.out.println("Sum of " + num + " numbers is : " + sum);
		}
		catch (InputMismatchException Io) {
			System.out.println("You Enter String/Charter instead of integer Values.");
			Io.printStackTrace();
		}
		finally {
			System.out.println("Input Tacken Successfully.");
		}
		

	}
}