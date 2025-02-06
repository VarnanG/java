package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalKingdomComparable {
	
	public static void main(String args[]) {
	ArrayList<AnimalComparable> a1 = new ArrayList<>();
	a1.add(new AnimalComparable("Lion", 20));
	a1.add(new AnimalComparable("Elephant", 23));
	a1.add(new AnimalComparable("Hippo", 40));
	
	Collections.sort(a1);
	System.out.println("AnimalComparable after sorting in age :");
	for(AnimalComparable m: a1) {
		System.out.println(m.getN()+" "+ m.getAge());
	}
	}

}
