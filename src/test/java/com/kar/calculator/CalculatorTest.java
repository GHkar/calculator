package com.kar.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
  * This is JavaDoc comment
  */

public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void sum(){
		assertEquals(5, calculator.sum(2,3));
	}
}
