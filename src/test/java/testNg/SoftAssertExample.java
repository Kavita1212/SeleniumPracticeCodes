package testNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class SoftAssertExample {
	@Test
	public void Test1() {
		SoftAssert s = new SoftAssert();
		System.out.println("enter url");
		System.out.println("enter username");
		System.out.println("enter password");
		s.assertEquals(true, true);
		System.out.println("enter name");
		System.out.println("enter last name");
		s.assertEquals(false, true);
		System.out.println("close the browser");
		s.assertAll();

	}

}
