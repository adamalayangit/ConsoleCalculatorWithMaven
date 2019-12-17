package ch.bbw.aa.maven._ConsoleCalculatorWithMaven;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Adam Alayan
 * @version 17.12.2019
 */

public class CalculatorTest {
	Calculator testee;

	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}

}
