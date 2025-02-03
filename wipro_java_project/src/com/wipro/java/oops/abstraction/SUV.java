package com.wipro.java.oops.abstraction;

public class SUV extends Car{
	
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
		
		Car mySuv = new SUV();
		mySuv.startEngine(); // Output: suv engine starts with a key.
        mySuv.stopEngine();  // Output: Engine stopped.

	}

}
