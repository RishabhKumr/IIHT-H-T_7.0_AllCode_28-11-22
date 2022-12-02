package com.mockito.LearnMockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TestCalculator {
	
	Calculator c = null;
	CalculatorService service = Mockito.mock(CalculatorService.class);
	@Before
	public void setUp() {
		c = new Calculator(service);
	}
	
	@Test
	public void testAdd() {
		when(service.add(210,40)).thenReturn(250);
		assertEquals(250,c.perform(100, 150));
	}
	@Test
	public void testSub() {
		assertEquals(250,c.sub(500, 250));
	}
	@Test
	public void testMul() {
		assertEquals(250,c.multiply(5, 50));
	}
}
