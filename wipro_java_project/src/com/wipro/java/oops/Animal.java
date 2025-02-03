/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
// PROPERTIES OF "POJO" --- 
// No constructor
// Getters have return value
// Setters have no return value
// Properties are determined using private fields
// Values or behaviours are determined via setters
// toString will convert the entire animal class with properties and behaviours

public class Animal {

	/**
	 * 
	 */
	// Private properties - structure
	private String species; // animal species
    private String name; // animal name
    private int age; // animal age
    
	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = "Aquatic";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = "Fish";
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = 5;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
