package com.gmail.olevskyih;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	@Parameters("random name")
	public void test(@Optional String name) {
		System.out.println("Name is:" + name);
	}

}
