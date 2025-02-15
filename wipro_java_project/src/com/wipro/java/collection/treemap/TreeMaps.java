package com.wipro.java.collection.treemap;

import java.util.TreeMap;

public class TreeMaps {

	public static void Example1stConstructor() {
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		tree_map.put(10, "Geeks"); // O(log n)
		tree_map.put(15, "4"); // O(log n)
		tree_map.put(20, "Geeks"); // O(log n)
		tree_map.put(25, "Welcomes"); // O(log n)
		tree_map.put(30, "You");
		// Getting values from the tree map
		System.out.println(tree_map .get(10));
		// Removing elements from the tree map
		tree_map.remove(15);
		for (int key : tree_map.keySet()) { // O(n)
            System.out.println(
                "Key: " + key + ", Value: "
                + tree_map.get(key)); // O(log n) for each
                                     // get operation
        }
		System.out.println("TreeMap: " + tree_map);
	}

	public static void main(String[] args) {
		System.out.println("TreeMap using TreeMap() constructor:\n");

		// Calling constructor
		Example1stConstructor();
	}
}
