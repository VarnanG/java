package com.wipro.java.oops.abstraction;

public class Sedan extends Car{
	
	@Override
    void startEngine() {
        System.out.println("Sedan engine starts with a key.");
    }
	
	@Override
    void stopEngine() {
        System.out.println("Sedan engine stops with a key.");
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mySedan = new Sedan();
        mySedan.startEngine(); // Output: Sedan engine starts with a key.
        mySedan.stopEngine();  // Output: Engine stopped.

	}

}
