package testNg;

import org.testng.annotations.Test;

public class TimeOut {

	@Test(timeOut = 500)
	public void f() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("hello");
	}
}
