package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SellPage extends TestBase 
{
	private By Sell_Button_1=By.xpath("//a[text()='Sell']");
	private By Long_term=By.xpath("//label[text()='Long-term']");
	private By Quantity=By.xpath("//input[@id='quantity']");
	private By Sell_Button_2=By.xpath("//button[contains(text(),'Sell')]");
	
	public SellPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	public void clickonSellButton1()
	{
		driver.findElement(Sell_Button_1).click();
	}
	public void clickOnLongTerm()
	{
		driver.findElement(Long_term).click();
	}
	public void enterQuantity(String count)
	{
		WebElement quantity=driver.findElement(Quantity);
		quantity.click();
		quantity.sendKeys(count);
	}
	public void clickOnSellButton2()
	{
		driver.findElement(Sell_Button_2).click();
	}
}
