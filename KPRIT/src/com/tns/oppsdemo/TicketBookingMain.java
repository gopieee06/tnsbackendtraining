package com.tns.oppsdemo;

//Main method for the ticket booking
import java.util.Scanner;
public class TicketBookingMain {
	

//	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicketBooking obj = new TicketBooking("Cooliee Movie","Gopi Anem",9,"+91 8888888198");
		
		System.out.println("Choose the Mode of Payment : ");
		System.out.println("1. Cash");
		System.out.println("2. Credit Card");
		System.out.println("3. Online Wallet");
		obj.option = sc.nextInt();
		System.out.print("Enter the Amount : ");
		obj.amount = sc.nextInt();
		switch(obj.option) {
		case 1: {
			obj.makePayment(obj.amount);
			break;
		}
		case 2:{
			System.out.print("Enter 16 digit credir card number (Without any spaces): ");
			obj.setCreditCard(sc.next());
			System.out.print("Enter cvv of the card : ");
			obj.setCvv(sc.nextInt());
			System.out.print("Enter card holder name : ");
			obj.setHoldername(sc.next());
			obj.makePayment(obj.getCreditCard(), obj.getCvv(), obj.getHoldername(), obj.amount);
			break;
		}
		case 3:{
			System.out.print("Enter the wallet number : ");
			obj.setWallno(sc.next());
			obj.makePayment(obj.getWallno(), obj.amount);
			break;
		}
		case 4 :{
			System.out.println("Enter the balence in your Account : ");
			obj.setBalance(sc.nextInt());
			
		}
		}
		
		
	}

}
