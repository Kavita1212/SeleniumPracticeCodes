package testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener {
	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println(result.getName());
	}

	public void onTestFailure(ITestResult result) {

		System.out.println(result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		System.out.println(result.getName());
	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
