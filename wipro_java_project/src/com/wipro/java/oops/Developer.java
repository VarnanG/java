package com.wipro.java.oops;

//Parent class- Employee
//Child class- Developer
//EXTENDS  = Keyword
public class Developer extends Employee{

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		Employee employee = new Developer();
		
    	employee.setDepartment("Developer"); // Setting Developer department
    	employee.setId(5678);                // Setting Developer ID
    	employee.setName("Ayush");           // Setting Developer Name
    	employee.setSalary(20000);           // Setting Developer Salary
    	
    	System.out.println("Employee Department -"+employee.getDepartment());
    	System.out.println("Employee ID -"+employee.getId());
    	System.out.println("Employee Name -"+employee.getName());
    	System.out.println("Employee Salary -"+employee.getSalary());
	}

}
