package com.wipro.java.interface1;

public class Cow implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("MOO-MOO");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats Grass");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cow1 = new Cow();
		cow1.makeSound();
		cow1.eat();
	}
}
