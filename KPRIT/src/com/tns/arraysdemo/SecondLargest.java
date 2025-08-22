package com.tns.arraysdemo;

import java.util.Arrays;

//finding second largest among the array
public class SecondLargest {
	
public static void main(String args[]) {
		
			//Initializing and Declaring an array
			int arr[] = {4,2,5,6,89,5,96,44,91};
			
			//Initializing first and second largest values
			int first = arr[0],second = arr[0];
			
			//looping over array
			for(int num : arr) {
				if (num > first) {
					second = first;
					first = num;
				}
				else if(num>=second && num != first) {
					second = num;
				}	
			}
			
			System.out.println("The second Highest number is  : " + second);
			
		
	}


}
