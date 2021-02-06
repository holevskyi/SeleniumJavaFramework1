package com.gmail.olevskyih;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {

	@Test
	public void testOne() {
		System.out.println("test 1 is running");
	}

	@Test(retryAnalyzer=listeners.RetryAnalyzer.class)
	public void testTwo() {
		int i = 1 / 0;
		System.out.println("test 2 is running");
	}

	@Test
	public void testThree() {
	//	Assert.assertTrue(0 > 1);
		System.out.println("test 3 is running");
	}
	
	// rerun manually testng-failed.xml

}
