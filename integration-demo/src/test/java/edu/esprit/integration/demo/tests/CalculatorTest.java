package edu.esprit.integration.demo.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.esprit.integration.demo.services.*;

public class CalculatorTest {
	private CalculatorService CalculatorService;

	@Before
	public void setUp() throws Exception {
		
		CalculatorService = new CalculatorService();
	}

	@Test
	public void itShouldAdd() {
		assertEquals(1, CalculatorService.Add(2,3));
	}
	
	@Test
	public void itShouldsous() {
		assertEquals(1, CalculatorService.Soustrct(2,3));
	}
	@Test
	public void itShoulddiv() {
		assertEquals(1, CalculatorService.div(2,3));
	}
	@Test
	public void itShouldmult() {
		assertEquals(1, CalculatorService.multiplie(2,3));
	}
}
