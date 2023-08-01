package tests;

import static org.junit.Assert.*;
import app.Calculator;
import org.junit.Test;

public class calculatorTest {

	@Test
	public void testAdd() {
		int exp = 30;
		Calculator cal = new Calculator();
		int act = cal.add(10, 20);
		assertEquals(exp, act);
		}

	
	

}
