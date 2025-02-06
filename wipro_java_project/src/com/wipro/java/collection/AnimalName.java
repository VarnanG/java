package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class AnimalName implements Comparator<AnimalComparator>{
	
	public int compare(AnimalComparator a1, AnimalComparator a2) {
		// Sorting by name (alphabetical order)
		return a1.getN().compareTo(a2.getN());
	}
	
	public static void main(String args[]) {
		ArrayList<AnimalComparator> n1 = new ArrayList<>();
		n1.add(new AnimalComparator("Lion", 20));
		n1.add(new AnimalComparator("Elephant", 23));
		n1.add(new AnimalComparator("Hippo", 40));
		n1.add(new AnimalComparator("Donkey", 10));
		
		Collections.sort(n1, new AnimalName());
		System.out.println("\nAnimal after sorting in Name alphabetically :");
		for(AnimalComparator m: n1) {
			System.out.println(m.getN()+" "+ m.getAge());
		}
	}
}