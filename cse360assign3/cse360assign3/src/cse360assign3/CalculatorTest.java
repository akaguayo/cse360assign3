package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		//make sure calculator initializes
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	@Test
	public void testgetTotal(){
		Calculator calc = new Calculator();
		assertEquals(calc.getTotal(), 0);

		calc.add(3);
		assertEquals(calc.getTotal(), 3);
	}
	
	@Test
	public void testadd() {
		Calculator calc = new Calculator();
		
		calc.add(2);
		assertEquals(calc.getTotal(), 2);
		
		calc.add(4);
		assertEquals(calc.getTotal(), 6);
		
		calc.add(6);
		assertEquals(calc.getTotal(), 12);
	}
	
	@Test
	public void testsubtract() {
		Calculator calc = new Calculator();
		
		calc.subtract(3);
		assertEquals(calc.getTotal(), -3);
	}
	
	@Test
	public void testmultiply() {
		Calculator calc = new Calculator();
		
		calc.add(2);
		calc.multiply(10);
		assertEquals(calc.getTotal(), 20);
		
		calc.multiply(2);
		assertEquals(calc.getTotal(), 40);
	}
	
	@Test
	public void testdivide() {
		Calculator calc = new Calculator();
		
		calc.add(10);
		calc.divide(2);
		assertEquals(calc.getTotal(), 5);
		
		//test divide by 0 (should result in 0)
		calc.divide(0);
		assertEquals(calc.getTotal(), 0);
	}
	
	@Test
	public void testgetHistory() {
		Calculator calc = new Calculator();
		
		calc.add(10);
		calc.divide(2);
		calc.subtract(3);
		calc.multiply(3);
		calc.add(6);
		
		assertEquals(calc.getHistory(), "0 + 10 / 2 - 3 * 3 + 6");
	}

}
