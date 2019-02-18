package com.example.shipkitworkshop;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test2 {
	@Test
	public void shouldCreateTriangle() {
		assertTrue(MathUtils.isTriangle(3, 4, 5));
		assertTrue(MathUtils.isTriangle(5, 6, 7));
		assertTrue(MathUtils.isTriangle(5, 5, 5));
	}

	@Test
	public void shouldNotCreateTriangle() {
		assertFalse(MathUtils.isTriangle(3, 4, 10));
	}

}
