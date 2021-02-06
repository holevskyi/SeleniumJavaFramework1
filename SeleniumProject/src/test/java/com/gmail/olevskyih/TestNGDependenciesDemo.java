package com.gmail.olevskyih;

import org.testng.annotations.Test;

public class TestNGDependenciesDemo {

	@Test(dependsOnMethods = {"testTwo", "testThree"})
	public void testOne() {
		System.out.println("Test One running");
	}

	@Test()
	public void testTwo() {
		System.out.println("Test Two running");
	}
	
	@Test
	public void testThree() {
		System.out.println("Test Three running");
	}

}
