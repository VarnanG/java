package com.wipro.java.collection;

import java.util.HashMap;

public class HashMapOperations {

	public static void main(String[] args) {
		// create a hashmap
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<String, Integer> map1 = new HashMap<>();
		// put() method to add elements
		map.put("Java", 8);
		map.put("JavaScript", 1);
		map.put("Python", 3);
		System.out.println("HashMap:" + map);
		// putAll() method
		map1.putAll(map);
		System.out.println(map1);
		// putIfAbsent() method
		// key already not present in HashMap
		map.putIfAbsent("php", 10);
		// key already present in HashMap
		map.putIfAbsent("Java", 11);
		System.out.println("Updated hashmap" + map);

		// Accessing element
		// the get() method takes the key as its argument and returns the corresponding
		// value associated with the key.
		System.out.println(map.get("Java"));
		System.out.println(map.get("JavaScript"));
		System.out.println(map.get("Python"));
		// We can also access the keys, values, and key/value pairs of the hashmap as
		// set views using keySet(), values(), and entrySet() methods
		System.out.println("Keys" + map.keySet());
		System.out.println("Values" + map.values());
		System.out.println("Key/Value pairs" + map.entrySet());
		// Java HashMap getOrDefault()
		System.out.println(map.getOrDefault("Java", 0));
		System.out.println(map.getOrDefault("Hang", 100));

		// Change HashMap value using replace()
		System.out.println(map.replace("Java", 13));
		// Change HashMap value using replaceAll()
		map.replaceAll((key, value) -> value * 2);
		System.out.println(map);

		// Remove HashMap Elements
		System.out.println(map.remove("php", 20));
		System.out.println(map);

	}
}
