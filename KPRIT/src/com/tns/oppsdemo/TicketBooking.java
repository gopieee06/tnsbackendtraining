package com.tns.oppsdemo;
//Online Ticket booking Payment Method.
import java.util.Scanner;

public class TicketBooking {
	
	//initializing all the variables
	int total_amt,option;
	double return_amt,amount,fair;
	//initializing all private variables
	private int cvv,balance;
	private String creditCard,holdername,wallno;
	
	Scanner sc = new Scanner(System.in);
	
	//Parameterized Constructor
	public TicketBooking(String stageEvent,String customer,int noOfSeats,String phno) {
			System.out.println("Tickets are booked for the evevt " + stageEvent + ".");
			System.out.println("Cusome name was " + customer + ".");
			System.out.println("Your Phone number was +91 ******"+phno.substring(10) + ".");
			double movie_fair = 300;
			fair = (double)movie_fair * noOfSeats;
			if (noOfSeats == 1) {
				System.out.println("Fair of " + noOfSeats + " seats is " + fair + ".");
			}
			else {
				System.out.println("Fair of " + noOfSeats + " seats are " + fair + ".");
			}
	}
	
	//Mode of payment cash
	void makePayment(double amount) {
		System.out.print("Enter The amount You giving : ");
		total_amt = sc.nextInt();
		if (total_amt >= amount) {
			return_amt =  total_amt - amount;
			System.out.println(amount + " Paid.");
			System.out.println("Retuned Amount was " + return_amt);
			System.out.println("Your Seates are booked, You get a seatnumbers Via SMS." );
		}
		else {
			System.out.println("The given amount " + total_amt + " is less Than the the actual price " + amount);
		}
	}
	
	
	//Mode of payment Online Credit Card
	void makePayment(String creditCard,int cvv,String holdername,double amount) {
		System.out.print("Enter the toatal amount you have your Card : ");
		total_amt = sc.nextInt();
		if (total_amt >= amount) {
			System.out.println(amount + " Paid.");
			System.out.println("Your Seates are booked, You get a seatnumbers Via SMS. ");
		}
		else {
			System.out.println("Your Card has less amount than " + amount);
		}
	}
	
	
	//Mode of payment Online wallet
	void makePayment(String wallno,double amount) {
		System.out.print("Enter The total amount you have in your wallet : ");
		total_amt = sc.nextInt();
		if (total_amt >= amount) {
			System.out.println(amount + " Paid.");
			System.out.println("Your Seates are booked, You get a seatnumbers Via SMS. ");
		}
		else {
			System.out.println("Your wallet has less amount than " + amount);
		}
		
	}
	
	
	//Mode of payment Via QR (Phonepay,Gpay,paytm Any UPI apps)
	void makePayment(double amount,int balance) {
		System.out.println("Scan the QR though Scanner to make the payment  : ");
		if (amount >= balance ) {
			System.out.println(amount + " Paid.");
			System.out.println("Your Seates are booked, You get a seatnumbers Via SMS. ");
		}
		else {
			System.out.println("Insufficient Funds! ");
		}
	}
	
	//Getter and setter for the cvv
	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	
	//getter and setter for credit card number
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	
	//getter and setter for the Holder Name
	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	
	//getter and setter for the wallno
	public String getWallno() {
		return wallno;
	}

	public void setWallno(String wallno) {
		this.wallno = wallno;
	}

	//getter and setter for balence
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
