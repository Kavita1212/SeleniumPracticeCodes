package testNg;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroups {
	@BeforeGroups(groups="smoke")
	public void BeforeGroups() {
		System.out.println("before groups execcuted");
	}

	@Test(groups ="smoke")
	public void m1() {
		System.out.println("smoke");
	}

	@Test(groups = "smoke" )
	public void m2() {
		System.out.println("smoke1");
	}

	@Test()
	public void m3() {
		System.out.println("regression");
	}

	@AfterGroups(groups="smoke")
	public void AfterGroups() {
		System.out.println("After groups execcuted");
	}

}
