package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class DashboardPage extends TestBase
{
	private By Searchbar=By.xpath("//input[@type='text']");
	private By SelectCompany_Name=By.xpath("(//div[@class='m-2 card-title'])[2]");	
	
	private By transaction_link=By.xpath("//a[@class='nav-link dropdown-togglez arrow-none']");
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterCompanyName(String Company_Name)
	{
		driver.findElement(Searchbar).sendKeys(Company_Name);
	}
	public void clickOnCompanyName()
	{
		driver.findElement(SelectCompany_Name).click();
	}
	public void clickOnTransactionLink()
	{
		driver.findElement(transaction_link).click();
	}
}