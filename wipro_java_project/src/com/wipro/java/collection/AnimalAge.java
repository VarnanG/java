package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalAge implements Comparator<AnimalComparator>{

	public int compare(AnimalComparator a1, AnimalComparator a2) {
		// sort by age in alphabetical order
		return Integer.compare(a1.getAge(), a2.getAge());
	}
	
	public static void main(String args[]) {
		ArrayList<AnimalComparator> y1 = new ArrayList<>();
		y1.add(new AnimalComparator("Lion", 20));
		y1.add(new AnimalComparator("Elephant", 23));
		y1.add(new AnimalComparator("Hippo", 40));
		y1.add(new AnimalComparator("Donkey", 10));
		
		Collections.sort(y1, new AnimalAge());
		System.out.println("\nAnimal after sorting in Age low->high :");
		for(AnimalComparator m: y1) {
			System.out.println(m.getN()+" "+ m.getAge());
		}
	}
}
