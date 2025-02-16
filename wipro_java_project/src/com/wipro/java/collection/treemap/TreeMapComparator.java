package com.wipro.java.collection.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//Class 1 - Helper class representing Student
class Student {
	int rollno;
	String name, address;

	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

//Class 2 - Comparator implementation for sorting by roll number
class SortByRoll implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		return Integer.compare(a.rollno, b.rollno);
	}
}

//Class 3 - Main class
public class TreeMapComparator {

	static void exampleWithComparator() {
		// TreeMap with a custom Comparator
		TreeMap<Student, Integer> treeMap = new TreeMap<>(new SortByRoll());

		// Adding entries to TreeMap
		treeMap.put(new Student(111, "bbbb", "london"), 2);
		treeMap.put(new Student(131, "aaaa", "nyc"), 3);
		treeMap.put(new Student(121, "cccc", "jaipur"), 1);

		// Printing the TreeMap
		for (Map.Entry<Student, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		System.out.println("TreeMap using TreeMap(Comparator) constructor:\n");
		exampleWithComparator();
	}
}