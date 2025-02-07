package com.wipro.java.collection;

public class Movie implements Comparable<Movie>{
	
	private String n; // Movie Name
	private double r; // Movie Rating
	private int y;    // Release year of movie
	public Movie(String n, double r, int y) {
		super();
		this.n = n;
		this.r = r;
		this.y = y;
	}
	
	public int compareTo(Movie m) {
		// sort movies in ascending 
		// order of year
		return this.y - m.y;
	}
	
	public String getName() {
		return n;
	}
	
	public double getRating() {
		return r;
	}

	public int getYear() {
		return y;
	}
	
	
}
