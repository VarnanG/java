package com.wipro.java.collection;

public class Array {
	public static void main(String args[]) {
		
	
	int [] arr= new int[5]; // Initialising array of 5 elements 
	arr[0]=1; //input value at 1st index
	arr[1]=2; //input value at 2nd index
	arr[2]=3; //input value at 3rd index
	arr[3]=4; //input value at 4th index
	arr[4]=5; //input value at 5th index
	
	for(int i=0; i< arr.length;i++) { //Looping through the array
		System.out.println("Array element at index "+i+ " is " +arr[i]); // printing array elements
	}
  }
}