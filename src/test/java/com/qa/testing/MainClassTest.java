package com.qa.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainClassTest {

	@Test
	public void testPass() {
		MainClass mainClass = new MainClass();
		assertEquals(2, mainClass.additiony(1, 1));
	}
	
	@Test
	public void testFail() {
		MainClass mainClass = new MainClass();
		assertEquals(3, mainClass.additiony(1, 1));
	}
}
