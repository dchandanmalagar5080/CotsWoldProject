package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test is Started "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			ScreenShot.takesScreenShot(null, driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is Skipped "+result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is Passed "+result.getName());
	}

}
