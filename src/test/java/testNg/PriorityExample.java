package testNg;

import org.testng.annotations.Test;

public class PriorityExample {
	// default priority=0,if no priority alphabetic precendence takes first,-ve will always take first preference

	@Test
	public void a() {
		System.out.println("a");

	}

	@Test(priority = 1)
	public void b() {
		System.out.println("b");

	}

	@Test(priority = -1)
	public void c() {
		System.out.println("c");

	}

	@Test
	public void d() {
		System.out.println("d");
	}
}