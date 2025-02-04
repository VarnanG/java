package com.wipro.java.exception;

public class JavaExceptipn {

	public static void main(String[] args) {
		int num1 = 25; int num2 =0 ;int answer;
		try {
		 answer=num1/num2 ; //the exception
		}
		//Handling the exception
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			int sum = num1+num2;
			System.out.println("The answer is " + sum);
			
		}
		System.out.println("My exception is being handled");
		

	}

}
