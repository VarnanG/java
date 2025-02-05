package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) {
		
		//----------------ARRAY----------------------------
		
		System.out.println("Array --------------- ");
		int [] arr = new int[5];
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		arr[4] =5;
		//Printing array elements
		System.out.print("Array elements : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//-------------LIST----------------------------
		
		System.out.println();
		System.out.println();
		System.out.println("List ---------------- ");
		
		ArrayList<Integer> l1 = new ArrayList<>();
		//Inserting elements in list
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		l1.add(3,4);
		
		System.out.println("List elements :"+l1);
		// removing value at index 1
		l1.remove(1);
		
		//printing list
		System.out.println("List after removing element at index 1 :"+l1);
		//iterating through list l1
		System.out.println("Iterating through list l1 :");
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		//setting index 1 with value 2
		l1.set(1, 2);
		
		System.out.println("Setting index 1 with value 2 :"+l1);
		
		//-----------------LINKEDLIST---------------------------------
		
		System.out.println();
		System.out.println();
		System.out.println("LinkedList --------------- ");
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
		
		//-------------------MAP---------------------------
		
		System.out.println();
		System.out.println();
		System.out.println("Map --------------- ");
		
Map<Integer, String> map = new HashMap<>(); 
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println("Key 1: "+map.get(1));
		System.out.println("Key 2: "+map.get(2));
		
		if(map.containsKey(3)) {
			System.out.println("Key 3 exist with value: "+map.get(1));
		}
		
		System.out.println("Iterating through the map :");
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
		  System.out.println(entry.getKey()+ ":" + entry.getValue() );
		}
		
		map.remove(2);
		System.out.println("Map after removal of key 2 : ");
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
		  System.out.println(entry.getKey()+ ":" + entry.getValue() );
		}


		
	}

}
