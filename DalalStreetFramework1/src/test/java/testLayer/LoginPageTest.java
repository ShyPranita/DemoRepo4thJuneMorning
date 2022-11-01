package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageLayer.LoginPage;
import testBase.TestBase;
import utility.UtilClass;

public class LoginPageTest extends TestBase
{
	String expected_url="https://www.apps.dalalstreet.ai/dashboard";
	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		LoginPage login=new LoginPage();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginB();
		Thread.sleep(3000);
		UtilClass util=new UtilClass();
		String actual_url=util.getUrl();
		Assert.assertEquals(actual_url, expected_url);
	}
}