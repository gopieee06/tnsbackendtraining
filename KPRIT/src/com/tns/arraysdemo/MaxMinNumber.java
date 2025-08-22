package com.tns.arraysdemo;
//printing the maximum and minimum number among the arrays
public class MaxMinNumber {

	public static void main(String[] args) {
		
		//Initializing and Declaring the array
		int arr[] = {4,2,5,6,89,5,96,44,1};
		
		//Initializing max and min values
		int max = arr[0],min = arr[0];
		
		//looping over array using enhanced method.
		for (int num : arr) {
			
			//checking the number is min or max
			if(num > max) 
				max = num;
			else if(num < min)
				min = num;
		}
		
		System.out.println("Maximum : " + max);
		System.out.println("Minimum : "  + min);
		
	}

}
