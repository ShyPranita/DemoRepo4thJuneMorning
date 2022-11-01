package testLayer;

import org.testng.annotations.Test;

import pageLayer.DashboardPage;
import pageLayer.TransactionPage;
import testBase.TestBase;

public class TransactionPageTest extends TestBase
{
	@Test
	public void getData() throws InterruptedException
	{
		TransactionPage Trans=new TransactionPage();
	    dash=new DashboardPage();
		Thread.sleep(4000);
		dash.clickOnTransactionLink();
		Thread.sleep(4000);
		Trans.getTransactionData();
	}
}
