package testLayer;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageLayer.SellPage;
import pageLayer.Sell_Share_From_Portfolio;
import testBase.TestBase;
import utility.UtilClass;

public class SellShare_From_Portfolio_Teast extends TestBase
{
	String Expected_Mesg="Order Created successfully";
	@Test
	public void SellShareFromPortfolio() throws InterruptedException
	{
		Thread.sleep(4000);
		dash.enterCompanyName("wipro");
		dash.clickOnCompanyName();	
		Thread.sleep(4000);
		Sell_Share_From_Portfolio port=new Sell_Share_From_Portfolio();
		port.clickOnPortfolio();
		Thread.sleep(2000);
		port.clickOnWiproTradeButton();
		Thread.sleep(2000);
		SellPage sell=new SellPage();
		sell.clickonSellButton1();
		sell.enterQuantity("4");
	
		UtilClass util=new UtilClass();
		util.scrollPage(0, 200);
		Thread.sleep(2000);
		sell.clickOnSellButton2();
		Thread.sleep(2000);
		Assert.assertEquals(Buy_Page.getStatusMessage(),Expected_Mesg);
	}
}
