package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Year implements Comparator<Movie1> {
	
	public int compare(Movie1 m1, Movie1 m2) {
        return Integer.compare(m1.getY(), m2.getY()); // Oldest to Newest
    }
 
	public static void main(String args[]) {
		ArrayList<Movie1> y1 = new ArrayList<>();
		y1.add(new Movie1("XYZ", 8.1,2018));
		y1.add(new Movie1("ABC", 7.9, 2013));
		y1.add(new Movie1("PQR", 8.0, 2010));
		
		Collections.sort(y1, new Year());
		System.out.println("Movies after sorting in release year :");
		for(Movie1 m: y1) {
			System.out.println(m.getN()+" "+ m.getR()+" "+m.getY());
		}
	}
}
