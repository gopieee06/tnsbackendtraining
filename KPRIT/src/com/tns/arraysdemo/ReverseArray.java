package com.tns.arraysdemo;

//Reversing The array using for loop.
public class ReverseArray {

	public static void main(String[] args) {
		
		//initializing array
		int arr[] = {5,4,3,2,1};
		
		//For loop to iterate over array and print in reverse Chronological orde.
		
		for (int i=arr.length-1;i>=0;i--) {
			//Printing the array 
			System.out.print(arr[i] + " ");
		}

	}

}
