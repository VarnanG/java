package com.wipro.java.interface1;

public class Document implements Printable, Showable{
	
	public void print() {
		System.out.println("Printing");
	}
	public void show() {
		System.out.println("Showing");
	}
	
	
	public static void main(String[] args) {	
		Document d1 = new Document();
		d1.show();
		d1.print();
		

	}

}
