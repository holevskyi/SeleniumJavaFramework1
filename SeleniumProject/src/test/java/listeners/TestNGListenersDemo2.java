package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenersDemo2 {
	
	@Test
	public void testFour() {
		System.out.println("I'm inside a testFour");
	}
	
	@Test
	public void testFive() {
		System.out.println("I'm inside a testFive");
	}
	
	@Test
	public void testSix() {
		System.out.println("I'm inside a testSix");
	}

}
