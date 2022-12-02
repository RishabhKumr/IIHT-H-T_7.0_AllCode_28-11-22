package com.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitClass {
	
	String username = "Nishant123";
	
	@Test
	public void testUserName() {
		System.out.println("Testing if username mATCHES");
		assertEquals("Nishant123",username);
	}
	
	@Test
	public void JunitMethod() {
		System.out.println("Test file executed");
	}
	public static void main(String[] args) {
		JunitClass result = new JunitClass();
		result.testUserName();
	}
}
