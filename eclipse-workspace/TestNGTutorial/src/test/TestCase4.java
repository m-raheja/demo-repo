package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestCase4 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("starting");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("yay!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("it fails " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipping");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// not implemented
	}

	@Override
	public void onFinish(ITestContext context) {
		// not implemented
	}

}
