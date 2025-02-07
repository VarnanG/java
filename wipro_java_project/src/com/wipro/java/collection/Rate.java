package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rate implements Comparator<Movie1>{

	public int compare(Movie1 m1, Movie1 m2) {
		// sort by rating in high to low order
		return Double.compare(m2.getR(), m1.getR());
	}
 
	public static void main(String args[]) {
		ArrayList<Movie1> r1 = new ArrayList<>();
		r1.add(new Movie1("XYZ", 8.1,2018));
		r1.add(new Movie1("ABC", 7.9, 2013));
		r1.add(new Movie1("PQR", 8.0, 2010));
		
		Collections.sort(r1, new Rate());
		System.out.println("Movies after sorting in Rating :");
		for(Movie1 m: r1) {
			System.out.println(m.getN()+" "+ m.getR()+" "+m.getY());
		}
	}
}
