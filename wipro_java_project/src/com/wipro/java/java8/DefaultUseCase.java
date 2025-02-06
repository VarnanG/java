package com.wipro.java.java8;

interface TestInterface1{
	//Default method
	default void show() {
		System.out.println("Hi from Default TestInterface1");
	}
}

interface TestInterface2{
	//Default method
	default void show() {
		System.out.println("Hi from Default TestInterface2");
	}
}

public class DefaultUseCase implements TestInterface1,TestInterface2{
	public void show () {
		//use super keyword to call the show 
		//method of TestInterface1 interface
		TestInterface1.super.show();
		//use super keyword to call the show 
		//method of TestInterface2 interface
		TestInterface2.super.show();
	}
	public static void main(String args[]) {
		DefaultUseCase d= new DefaultUseCase();
		d.show();
	}
}
