package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

private final Calculator calculator = new Calculator();
	
	@Test
	public void testAdd() {
		int result = calculator.add(2,3); // calculating value
		assertEquals(5,result); //checking with actual result and obtained result
	}
	
	@Test
	public void testSubtract() {
		int result = calculator.subtract(5,3);// calculating value
		assertEquals(2,result); //checking with actual result and obtained result
	}
	
	@Test
	public void testAddWithNegativeNumbers() {
		int result = calculator.add(-3,-2);// calculating value
		assertEquals(-5,result);//checking with actual result and obtained result
	}
	
	@Test
	public void testSubtractWithNegativeNumbers() {
		int result = calculator.add(-3,-2);// calculating value
		assertEquals(-1,result);//checking with actual result and obtained result
	}
}
