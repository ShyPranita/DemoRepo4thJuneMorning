package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class Sell_Share_From_Portfolio extends TestBase
{
	private By Click_portfolio=By.xpath("//a[@href='/portfolio']");
	private By Click_WiproTrade_button=By.xpath("//a[text()='Trade'][1]");
	
	public Sell_Share_From_Portfolio()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	
	public void clickOnPortfolio()
	{
		driver.findElement(Click_portfolio).click();
	}
	
	public void clickOnWiproTradeButton()
	{
		driver.findElement(Click_WiproTrade_button).click();
	}
}
