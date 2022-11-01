package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase
{
	//Declaration/obj repository
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass_txtbox;
	
	@FindBy(xpath="//div[@class='mt-3 d-grid']")
	private WebElement login_button;
	
	//Initialization
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action Methods
	
	public void enterEmailAddress()
	{
		email_txtbox.sendKeys("garadpranita1@gmail.com");
	}
	public void enterPassword()
	{
		pass_txtbox.sendKeys("Shypeacock@97");
	}
	public void clickOnLoginB()
	{
		login_button.click();
	}
}
