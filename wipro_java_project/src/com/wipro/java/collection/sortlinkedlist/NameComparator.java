package com.wipro.java.collection.sortlinkedlist;

import java.util.Comparator;

class NameComparator implements Comparator<LinkedInProfile> {
    @Override
    public int compare(LinkedInProfile p1, LinkedInProfile p2) {
        // Sort by name in ascending order
        return p1.getName().compareTo(p2.getName());
    }
}