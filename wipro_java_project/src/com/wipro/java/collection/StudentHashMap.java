package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
		// Create a HashMap to store roll numbers as keys and names as values
		Map<Integer, String> studentMap = new HashMap<>();

		// Add 10 students to the HashMap
		studentMap.put(101, "Alice");
		studentMap.put(102, "Bob");
		studentMap.put(103, "Charlie");
		studentMap.put(104, "Alice"); // Duplicate name
		studentMap.put(105, "David");
		studentMap.put(106, "Eve");
		studentMap.put(101, "Alice"); // Duplicate name and id
		studentMap.put(108, "Frank");
		studentMap.put(109, "Grace");
		studentMap.put(110, "Heidi");

		// Print all students in the HashMap
		System.out.println("Student Roll Numbers and Names:");
		for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
			System.out.println("Roll Number: " + entry.getKey() + ", Name: "
					+ entry.getValue());
		}

		// Example: Retrieve a student's name by roll number
		int rollNumberToFind = 101;
		if (studentMap.containsKey(rollNumberToFind)) {
			System.out.println("\nStudent with Roll Number " + rollNumberToFind
					+ " is: " + studentMap.get(rollNumberToFind));
		} else {
			System.out.println("\nStudent with Roll Number " + rollNumberToFind
					+ " not found.");
		}
	}
}
