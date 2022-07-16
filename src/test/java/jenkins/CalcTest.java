package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		assertEquals(10, calc.addNumbers(5,5));
	}
	
	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.subtractNumbers(10,5));
	}
}
