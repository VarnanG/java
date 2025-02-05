package com.wipro.java.collection;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		//Inserting elements in list
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		l1.add(3,4);
		
		System.out.println(l1);
		// removing value at index 1
		l1.remove(1);
		
		//printing list
		System.out.println(l1);
		//iterating through list l1
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		//setting index 1 with value 2
		l1.set(1, 2);
		System.out.println(l1);
	}

}
