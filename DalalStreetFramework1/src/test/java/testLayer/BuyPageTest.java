package testLayer;

import org.junit.Assert;
import org.testng.annotations.Test;
import testBase.TestBase;
import utility.UtilClass;

public class BuyPageTest extends TestBase
{
	String Expected_Mesg="Order Created successfully";
	
	@Test
	public void verifyBuyPageTest() throws InterruptedException
	{	
		Thread.sleep(4000);
		dash.enterCompanyName("axis");
		dash.clickOnCompanyName();
		logger.info("Clicked on company name");
		Thread.sleep(4000);
		Buy_Page.clickOnBuyButton1();
		logger.info("Clicked on Buy button 1");
		Buy_Page.enterQuantity("1");
	
		UtilClass util=new UtilClass();
		util.scrollPage(0, 200);
		Thread.sleep(2000);
		Buy_Page.clickOnBuyButton2();
		Thread.sleep(2000);
		Assert.assertEquals(Buy_Page.getStatusMessage(),Expected_Mesg);
	}
	
	@Test
	public void verifyBuyPageTest1() throws InterruptedException
	{	
		Thread.sleep(4000);
		dash.enterCompanyName("Tata");
		dash.clickOnCompanyName();	
		Thread.sleep(4000);
		Buy_Page.clickOnBuyButton1();
		Buy_Page.enterQuantity("3");
	
		UtilClass util=new UtilClass();
		util.scrollPage(0, 200);
		Thread.sleep(2000);
		Buy_Page.clickOnBuyButton2();
		logger.info("Clicked on buy button 2");
		Thread.sleep(2000);
		Assert.assertEquals(Buy_Page.getStatusMessage(),Expected_Mesg);
	}
}
