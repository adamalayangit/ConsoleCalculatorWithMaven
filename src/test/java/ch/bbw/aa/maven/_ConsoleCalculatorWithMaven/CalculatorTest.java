package ch.bbw.aa.maven._ConsoleCalculatorWithMaven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Adam Alayan
 * @version 17.12.2019
 */

public class CalculatorTest {
	private Calculator calculator;
	
	@Before
	public void setup() {
		calculator = new Calculator();
	}

	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(calculator.summe(10, 25) == 35);
	}
	
	@Test
	public void testNegativeSummeZweiNegativeIsOk() {
		assertTrue(calculator.summe(-5, -10) == -15);
	}
	
	@Test
	public void testDifferenzZweiPositiveIsNotOk() {
		assertTrue(calculator.differenz(35, 25) == 10);
	}
	
	@Test
	public void testDivisionMitNullIsOk() throws java.lang.ArithmeticException{
		assertTrue(calculator.division(4, -2) == -2);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivisionNullMitNegativeIsNotOk() {
		assertTrue(calculator.division(-4, 0) == 0);
	}

}
