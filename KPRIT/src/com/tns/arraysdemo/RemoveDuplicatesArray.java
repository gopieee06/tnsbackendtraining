package com.tns.arraysdemo;

//printing duplicates 
public class RemoveDuplicatesArray {
	public static void main(String args[]) {
		
		//initializing and declaring arrays
		int arr[] = {1,2,3,4,5,3,6,2,8,1};
		
		//loping over array
		System.out.print("Duplicates : ");
		for(int i = 0; i < arr.length ; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
	

}
