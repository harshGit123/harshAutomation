package listenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerClass implements ITestListener 
{
	@Override
	public void onTestFailure(ITestResult result)
	{
	Reporter.log("Method is Failed ,Take ScreenShot",true);	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Method Passed",true);	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Method is Skipped",true);	
	}
}
