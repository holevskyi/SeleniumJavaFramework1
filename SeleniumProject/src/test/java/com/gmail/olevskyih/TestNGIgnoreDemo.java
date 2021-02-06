package com.gmail.olevskyih;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;

public class TestNGIgnoreDemo {
	
	@Ignore
	@Test
	public void testOne() {
		System.out.println("Test 1 is running");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test 2 is running");
	}

}
