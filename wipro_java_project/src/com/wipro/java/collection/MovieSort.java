package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MovieSort {
 
	public static void main(String args[]) {
		ArrayList<Movie> l1 = new ArrayList<>();
		l1.add(new Movie("XYZ", 8.1,2018));
		l1.add(new Movie("ABC", 7.9, 2013));
		
		Collections.sort(l1);
		System.out.println("Movies after sorting in year :");
		for(Movie m: l1) {
			System.out.println(m.getName()+" "+ m.getRating()+" "+m.getYear());
		}
	}

}
