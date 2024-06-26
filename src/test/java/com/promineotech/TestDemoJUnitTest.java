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
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class TestDemoJUnitTest {
	
	private TestDemo testDemo = new TestDemo();

	@BeforeEach
	void setUp() throws Exception {
	}

	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		if(!expectException) {
			//assertEquals(testDemo.addPositive(a, b), expected);
			assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		}
		else {
			//assertEquals(testDemo.addPositive(a, b), assertThatIllegalArgumentException());
			assertThatThrownBy(() ->testDemo.addPositive(a, b)).isInstanceOf(IllegalArgumentException.class);
		}
	}//End assertThatTwoPositiveNumbersAreAddedCorrectly()
	
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {

		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);

		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
	}
	
	static Stream<Arguments>  argumentsForAddPositive() {
		//@formatter:off
		return Stream.of(
				arguments(2,4,6,false),
				arguments(1,3,4,false),
				arguments(1,1,2,false),
				arguments(0,1,1,true),
				arguments(1,0,1,true),
				arguments(-1,-1,-2,true)
				);
		//@formatter:on
		
	}
	
	/*
	 * This test asserts that two parameters of type Double are divided correctly and that
	 * if a division-by-zero is attempted, an IllegalArgumentException is thrown.
	 */
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForDivideDoubles")
	void assertThatTwoDoublesAreDividedCorrectly(Double a, Double b, Double expected, boolean expectedException) {
		if(!expectedException) {
			assertThat(testDemo.divideDoubles(a, b)).isEqualTo(expected);
		}
		else {
			assertThatThrownBy(() ->testDemo.divideDoubles(a, b)).isInstanceOf(IllegalArgumentException.class);
		}
	}
	
	static Stream<Arguments>  argumentsForDivideDoubles() {
		//@formatter:off
		return Stream.of(
				arguments(1.0,2.0,0.5,false),
				arguments(1.0, 0.0, null, true),
				arguments(-6.0, 2.0, -3.0, false),
				arguments(-10.0, -2.0, 5.0, false)
				);
		//@formatter:on
		
	}

}
