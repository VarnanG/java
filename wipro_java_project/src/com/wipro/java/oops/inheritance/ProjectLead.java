package com.wipro.java.oops.inheritance;

//Parent class- Employee
//Child class- ProjectLead
//EXTENDS  = Keyword
public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String args[]) {
//    	ProjectLead projectLead1 = new ProjectLead();
//    	ProjectLead projectLead2 = (ProjectLead) new Employee();
    	
    	
    	// child object is instantiated from child constructor
    	//parent class consumes the prop and behaviours of child class
    	
    	Employee employee = new ProjectLead();
    	
    	employee.setDepartment("Project Lead"); // Setting ProjLead department
    	employee.setId(1234); // Setting ProjLead ID
    	employee.setName("Karan"); // Setting ProjLead Name
    	employee.setSalary(10000); // Setting ProjLead Salary
    	
    	System.out.println("Employee Department -"+employee.getDepartment());
    	System.out.println("Employee ID -"+employee.getId());
    	System.out.println("Employee Name -"+employee.getName());
    	System.out.println("Employee Salary -"+employee.getSalary());
    }

}
