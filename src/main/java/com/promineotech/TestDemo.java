/*
// Program: Promineo Tech Backend Java Development Course
// Author:  Samuel Ajao
// Assignment:  Week 12 - JUnit Coding
// Create Date: June 25, 2024
//
*/
package com.promineotech;

import java.util.Random;

public class TestDemo {

	
	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			return (a+b);
		}
		else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	
	/*
	 * This method accepts two parameters ( 'a' and 'b') both of type Double and
	 * throws a IllegalArgumentException if 'b' is equal to zero and
	 * returns the result of 'a' divided by 'b' otherwise.  
	 */
	public double divideDoubles(double a, double b) {		
		if(b == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed!");
		}
		else {
			return  a/b;
		}			
	}
	
	
	public int randomNumberSquared() {
		int result = getRandomInt();
		
		return (result * result);
	}
	
	public int getRandomInt() {
		Random random = new Random();
		
		return random.nextInt(10) + 1;
	}
	
}
