package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class BuyPage extends TestBase
{
	private By Buy_Button_1=By.xpath("//a[contains(text(),'Buy')]");
//	private By Long_term=By.xpath("(//label[contains(text(),'Long-term')])[1]");
	private By Quantity=By.xpath("//input[@name='input-Qunatity']");
	private By Buy_Button_2=By.xpath("//button[contains(text(),'Buy')]");
	private By Status=By.xpath("//div[text()='Order Created successfully']");
	
	public BuyPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action methods
	public void clickOnBuyButton1()
	{
		driver.findElement(Buy_Button_1).click();
	}
	public void enterQuantity(String count)
	{
		WebElement Enter_Qty=driver.findElement(Quantity);
		Enter_Qty.click();
		Enter_Qty.sendKeys(count);
	}
	public void clickOnBuyButton2()
	{
		driver.findElement(Buy_Button_2).click();
	}
	public String getStatusMessage()
	{
		String mesg=driver.findElement(Status).getText();
		return mesg;
	}
}