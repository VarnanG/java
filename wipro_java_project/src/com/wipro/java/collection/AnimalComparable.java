package com.wipro.java.collection;

public class AnimalComparable implements Comparable<AnimalComparable> {
	
	private String n;
	private int age;
	
	public AnimalComparable(String n, int age) {
		super();
		this.n = n;
		this.age = age;
	}
	
	public int compareTo(AnimalComparable a) {
		// sorts age low->high
		return this.age - a.age;
	}

	public String getN() {
		return n;
	}
	
	public int getAge() {
		return age;
	}
	
}
