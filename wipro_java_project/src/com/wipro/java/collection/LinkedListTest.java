package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {     
		//size of the LinkedList
				int n=5;
				
				//Declaring the List with initial size n
				List<Integer> ll = new LinkedList<Integer>();
				
				for (int i = 1; i <= n; i++)
					ll.add(i);
		 
				// Printing elements
				System.out.println(ll);
		 
				// Remove element at index 3
				ll.remove(3);// index
		 
				// Displaying the list after deletion
				System.out.println(ll);
		 
				// Printing elements one by one
				for (int i = 0; i < ll.size(); i++)
					System.out.print(ll.get(i) + " ");
		 
	}

}
