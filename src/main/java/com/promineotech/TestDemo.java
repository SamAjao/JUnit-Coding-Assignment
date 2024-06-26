/*
// Program: Promineo Tech Backend Java Development Course
// Author:  Samuel Ajao
// Assignment:  Week 12 - JUnit Coding
// Create Date: June 25, 2024
//
*/
package com.promineotech;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			return (a+b);
		}
		else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
}
