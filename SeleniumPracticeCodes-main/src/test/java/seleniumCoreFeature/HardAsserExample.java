package seleniumCoreFeature;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HardAsserExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.out.println("1"); System.out.println("2"); System.out.println("3");
		 * Assert.assertEquals(false,true); System.out.println("1");
		 */
		
		SoftAssert sf = new SoftAssert();
		System.out.println("2");
		System.out.println("1");
		sf.assertEquals(true, false);
		
		System.out.println("3");
		
		sf.assertAll();
		

	}

}
