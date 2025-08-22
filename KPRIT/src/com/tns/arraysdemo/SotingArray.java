package com.tns.arraysdemo;
//sorting an array

//To sort array we have a built in package that is Arrays
//To import 
import java.util.Arrays;
public class SotingArray {
	
	public static void main(String args[]) {
		
		//Initializing and Declaring an array
		int arr[] = {9,4,5,2,3,1,6,8,7,10};
		
		//inbuilt sorting Sorting Method for arrays.
		Arrays.sort(arr);
		
		//Printing them 
		//since arrays prints hash code we use toString method to convert them to represent in string format
		System.out.println("Sorted arrays are : "  + Arrays.toString(arr));
		
	}

}
