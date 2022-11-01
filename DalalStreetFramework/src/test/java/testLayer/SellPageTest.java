package testLayer;

import org.testng.annotations.Test;

import pageLayer.DashboardPage;
import pageLayer.SellPage;
import testBase.TestBase;
import utility.UtilClass;

public class SellPageTest extends TestBase
{
	@Test
	public void verifySellPageTest() throws InterruptedException
	{
		Thread.sleep(4000);
		dash.enterCompanyName("wipro");
		dash.clickOnCompanyName();
		Thread.sleep(4000);
		SellPage sell=new SellPage();
		sell.clickonSellButton1();
		sell.enterQuantity("3");
		UtilClass util=new UtilClass();
		util.scrollPage(0, 200);
		Thread.sleep(2000);
		sell.clickOnSellButton2();
	}
}
