/*
// Program: Promineo Tech Backend Java Development Course
// Author:  Samuel Ajao
// Assignment:  Week 12 - JUnit Coding
// Create Date: June 25, 2024
//
*/
package com.promineotech;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;


class TestDemoJUnitTest {
	
	private TestDemo testDemo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@ParameterizedTest
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		if(!expectException) {
			assertEquals(testDemo.addPositive(a, b), expected);
		}
		else {
			assertEquals(testDemo.addPositive(a, b), assertThatIllegalArgumentException());
		}
	}

}
