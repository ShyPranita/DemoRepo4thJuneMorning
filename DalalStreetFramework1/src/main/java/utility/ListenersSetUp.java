package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testBase.TestBase;

public class ListenersSetUp extends TestBase  implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		logger.info("Test case execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		logger.info("Test case execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
//		String Test_name=result.getName();
//		int count=1;
		logger.info("Test case execution failed");
//		UtilClass.takeScreenShot( count+" "+Test_name);
		UtilClass.takeScreenShot(result.getName());
		logger.info("ScreenShot captured");
//		count++;
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		logger.info("Test case execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}
}
