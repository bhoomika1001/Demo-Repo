import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator cal = new Calculator();

	@Test
	public void testSum() 
	{
		assertEquals(cal.Sum(5, 3), 8);
	}

	@Test
	public void testSubtract() {
		assertEquals(cal.Subtract(5, 3), 2);
	}

	@Test
	public void testMultiply() {
		assertEquals(cal.Multiply(5, 3), 15);
	}

	@Test
	public void testDivide() {
		assertEquals(cal.Divide(6, 3),2);
	}

}
