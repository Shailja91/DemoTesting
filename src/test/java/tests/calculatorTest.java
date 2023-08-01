package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void testAdd() {
		int exp = 30;
		calculatorTest cal = new calculatorTest();
		int act = cal.add(10, 20);
		assertEquals(exp, act);
		}

	
	

}
