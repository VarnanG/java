package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckUncheck {

	public static void main(String[] args) {
		
		try {
			System.out.println("Checking the checked Exception");
			File file = new File("Path Does Not Exist");
			FileReader reader = new FileReader(file);
		} catch (IOException e) {
			System.out.println("Exception Occurred:" + e.toString());
		}
		try {
			System.out.println("Checking the Unchecked Exception");
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception Occurred: " + e.toString());
		}

	}

}
