package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class UtilClass extends TestBase
{
	public UtilClass()
	{
		PageFactory.initElements(driver,this);
	}
	public String getUrl()
	{
		String current_url=driver.getCurrentUrl();
		return current_url;   
	}
	
	JavascriptExecutor Exe=(JavascriptExecutor)driver;
	public void scrollPage(int up,int down)
	{
		Exe.executeScript("scrollBy("+up+","+down+")");
	}
	
	static String path="D:\\EclipseWorkspace\\DalalStreetAutomation\\Failed_TestCase_ScreenShots\\";
	public static void takeScreenShot(String File_name)
	{
		long currentDateTime = System.currentTimeMillis();
//	    Date currentDate = new Date(currentDateTime);
		TakesScreenshot snap=(TakesScreenshot)driver;
		File source=snap.getScreenshotAs(OutputType.FILE);
//		File desti=new File(path+File_name+".png");
		File desti=new File(path+File_name+currentDateTime+".png");
		try 
		{
			FileHandler.copy(source, desti);
		} 
		catch (IOException e) 
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}
		
	}
}
