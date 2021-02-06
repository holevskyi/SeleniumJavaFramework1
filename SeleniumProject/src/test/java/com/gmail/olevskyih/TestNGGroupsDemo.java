package com.gmail.olevskyih;

import org.testng.annotations.Test;

public class TestNGGroupsDemo {
	
	@Test(groups= {"smoke"})
	public void testOne() {
		System.out.println("This is test 1");
	}
	
	@Test(groups= {"smoke","regression"})
	public void testTwo() {
		System.out.println("This is test 2");
	}
	
	@Test(groups= {"regression", "smoke2"})
	public void testThree() {
		System.out.println("This is test 3");
	}
	
	@Test
	public void testFour() {
		System.out.println("This is test 4");
	}

}
