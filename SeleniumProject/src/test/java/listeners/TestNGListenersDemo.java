package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo {
	
	@Test(priority = 1)
	public void testOne() {
		System.out.println("I'm inside a testOne");
	}
	
	@Test(priority = 2)
	public void testTwo() {
		System.out.println("I'm inside a testTwo");
	}
	
	@Test(priority = 0)
	public void testThree() {
		System.out.println("I'm inside a testThree");
	}

}
