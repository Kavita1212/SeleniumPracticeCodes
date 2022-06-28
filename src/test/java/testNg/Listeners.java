package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;


//@Listeners(testNg.ListenerExample.class)

public class Listeners {
	@Test
	public void sum() {
		int sum = 0;
		int a = 5;
		int b = 7;
		sum = a + b;
		System.out.println(sum);
	}

	@Test
	public void testToFail() {
		System.out.println("Test case has been failed");
		Assert.assertTrue(false);
	}

}
