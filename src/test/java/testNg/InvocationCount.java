package testNg;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=5)
	  public void f()  //run 5 times
	  
	  {
		  System.out.println("f");
	  }

}
