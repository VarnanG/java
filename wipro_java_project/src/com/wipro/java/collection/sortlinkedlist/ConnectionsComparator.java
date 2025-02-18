package com.wipro.java.collection.sortlinkedlist;

import java.util.Comparator;

//Step 2: Implement Comparator interface for custom sorting
class ConnectionsComparator implements Comparator<LinkedInProfile> {
 @Override
 public int compare(LinkedInProfile p1, LinkedInProfile p2) {
     // Sort by number of connections in descending order
     return Integer.compare(p2.getConnections(), p1.getConnections());
 }
}
