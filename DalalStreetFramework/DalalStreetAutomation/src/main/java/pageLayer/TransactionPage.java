package pageLayer;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class TransactionPage extends TestBase
{
	public TransactionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//To print the Transaction data
	public void getTransactionData()
	{
		String trans; 
		int k=0; //To get number of records
		for(int j=1;j<=10;j++) //for rows
		{
			for(int i=1;i<=9;i++) //for column
			{
				trans=driver.findElement(By.xpath("//table/tbody/tr["+j+"]/td["+i+"]")).getText();
				System.out.print(trans +" ");
			}
			System.out.println();
			k++;
		}
		System.out.println("number of records:: "+k);
	}
}
