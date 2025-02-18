package com.wipro.java.collection.sortlinkedlist;

//Step 1: Define a class representing a LinkedIn profile
public class LinkedInProfile {

	private String name;
	private String headline;
	private int connections;

	public LinkedInProfile(String name, String headline, int connections) {
		this.name = name;
		this.headline = headline;
		this.connections = connections;
	}

	public String getName() {
		return name;
	}

	public String getHeadline() {
		return headline;
	}

	public int getConnections() {
		return connections;
	}

	@Override
	public String toString() {
		return "LinkedInProfile{" + "name='" + name + '\'' + ", headline='"
				+ headline + '\'' + ", connections=" + connections + '}';
	}
}
