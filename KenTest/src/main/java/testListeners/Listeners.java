package testListeners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("SwarmWatchDog:This Passed->" + result.getName());
		
	}

	
	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output","false");
		System.out.println("SwarmWatchDog:This Failed->" + result.getName());
		
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}