package com.wipro.java.oops;

// Parent class- Employee
// Child class- Manager
// EXTENDS  = Keyword
public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String args[]) {
		Employee employee = new Manager();
		
    	employee.setDepartment("Manager");// Setting Manager department
    	employee.setId(1357);             // Setting Manager ID
    	employee.setName("Amit");         // Setting Manager Name
    	employee.setSalary(30000);        // Setting Manager Salary
    	
    	System.out.println("Employee Department -"+employee.getDepartment());
    	System.out.println("Employee ID -"+employee.getId());
    	System.out.println("Employee Name -"+employee.getName());
    	System.out.println("Employee Salary -"+employee.getSalary());
	}

}
