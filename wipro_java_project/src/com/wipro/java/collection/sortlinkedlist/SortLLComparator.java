package com.wipro.java.collection.sortlinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLLComparator {

	public static void main(String[] args) {
        // Create a list of LinkedIn profiles
        List<LinkedInProfile> profiles = new ArrayList<>();
        profiles.add(new LinkedInProfile("Alice", "Software Engineer", 500));
        profiles.add(new LinkedInProfile("Bob", "Data Scientist", 300));
        profiles.add(new LinkedInProfile("Charlie", "Product Manager", 700));

        // Sort by number of connections
        System.out.println("Sorting by connections (descending):");
        Collections.sort(profiles, new ConnectionsComparator());
        for (LinkedInProfile profile : profiles) {
            System.out.println(profile);
        }

        // Sort by name
        System.out.println("\nSorting by name (ascending):");
        Collections.sort(profiles, new NameComparator());
        for (LinkedInProfile profile : profiles) {
            System.out.println(profile);
        }
    }
}
