package com.wipro.java.interface1;

public class Dog implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Bow-Wow");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats Meat");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1 = new Dog();
		dog1.makeSound();
		dog1.eat();
	}
}
