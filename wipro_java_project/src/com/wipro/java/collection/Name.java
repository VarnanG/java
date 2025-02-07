package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Name implements Comparator<Movie1>{
	
	public int compare(Movie1 m1, Movie1 m2) {
		// sort by name in alphabetical order
		return m1.getN().compareTo(m2.getN());
	}
 
	public static void main(String args[]) {
		ArrayList<Movie1> n1 = new ArrayList<>();
		n1.add(new Movie1("XYZ", 8.1,2018));
		n1.add(new Movie1("ABC", 7.9, 2013));
		n1.add(new Movie1("PQR", 8.0, 2010));
		
		Collections.sort(n1, new Name());
		System.out.println("Movies after sorting in Name alphabetically :");
		for(Movie1 m: n1) {
			System.out.println(m.getN()+" "+ m.getR()+" "+m.getY());
		}
	}
}
