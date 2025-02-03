/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
// Plain Old Java Object (POJO) is a simple object that doesn't adhere to any 
//special restrictions or frameworks, typically used to represent data structures. 
public class Employee {

	/**
	 * 
	 */
	private int id; // Employee ID
    private String name; // Employee name
    private String department; // Employee Department
    private float salary; // Employee salary
    
    // Default constructor
    public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
