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
	public void testOnePositiveOneNegativeSummeIsOk() {
		assertTrue(calculator.summe(-6, 10) == 4);
	}
	
	@Test
	public void testTwoZeroSummeIsOk() {
		assertTrue(calculator.summe(0, 0) == 0);
	}
	
	@Test
	public void testTwoMaxValueSumme() {
		assertTrue(calculator.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == -2);
	}
	
	@Test
	public void testTwoMinValueSumme() {
		assertTrue(calculator.summe(Integer.MIN_VALUE, Integer.MIN_VALUE) == 0);
	}
	
	@Test
	public void testOneMinValueOneMaxValueSumme() {
		assertTrue(calculator.summe(Integer.MIN_VALUE, Integer.MAX_VALUE) == -1);
	}
	
	@Test
	public void testOneMaxValueAndOneSumme() {
		assertTrue(calculator.summe(Integer.MAX_VALUE, 1) == -2147483648);
	}
	
	@Test
	public void testDifferenzZweiPositiveIsNotOk() {
		assertTrue(calculator.differenz(35, 25) == 10);
	}
	
	@Test
	public void testDifferenzZweiNegativeIsOk() {
		assertTrue(calculator.differenz(-35, -25) == -10);
	}
	
	@Test
	public void testDifferenzOneNegativeOnePositiveIsOk() {
		assertTrue(calculator.differenz(35, -25) == 60);
	}
	
	@Test
	public void testTwoZeroDifferenz() {
		assertTrue(calculator.differenz(0, 0) == 0);
	}
	
	@Test
	public void testTwoMinValueDifferenz() {
		assertTrue(calculator.differenz(Integer.MIN_VALUE, Integer.MIN_VALUE) == 0);
	}
	
	@Test
	public void testTwoMaxValueDifferenz() {
		assertTrue(calculator.differenz(Integer.MAX_VALUE, Integer.MAX_VALUE) == 0);
	}
	
	@Test
	public void testOneMinValueOneMaxValueDifferenz() {
		assertTrue(calculator.differenz(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}
	
	@Test
	public void testOneMaxValueAndOneDifferenz() {
	   assertTrue(calculator.differenz(Integer.MAX_VALUE, 1) == 2147483646);
	}
	 
	@Test
	public void testDivisionZweiPositive() {
		assertTrue(calculator.division(50, 5) == 10);
	}
	
	@Test
	public void testDivisionZweiNegative() {
		assertTrue(calculator.division(-50, -5) == 10);
	}
	
	@Test
	public void testDivisionOnePositiveOneNegative() {
		assertTrue(calculator.division(4, -2) == -2);
	}
	
	@Test
	public void testDivisionZweiMinValue() {
		assertTrue(calculator.division(Integer.MIN_VALUE, Integer.MIN_VALUE) == 1);
	}
	
	@Test
	public void testDivisionMitNull() throws java.lang.ArithmeticException{
		assertTrue(calculator.division(4, 0) == 0);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivisionNullMitNegativeIsNotOk() {
		assertTrue(calculator.division(-4, 0) == 0);
	}

}
