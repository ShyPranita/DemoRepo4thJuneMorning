package testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.BuyPage;
import pageLayer.DashboardPage;
import pageLayer.LoginPage;

public class TestBase
{
	public static WebDriver driver;
	public static DashboardPage dash;
	public static BuyPage Buy_Page;
	public static Logger logger;

	@BeforeClass
	public void start()
	{
		logger= Logger.getLogger("Dala Street Framework");
		PropertyConfigurator.configure("Log4j.properties");
	}
	@AfterClass
	public void stop()
	{
		logger.info("Framework execution stopped");
	}
	@Parameters("browser")  //-----This annotation is used to set browser in suite
	@BeforeMethod
	public void setUp(String brw) throws InterruptedException
	{
//		String brw="chrome";
		
		if(brw.equalsIgnoreCase("chrome"))
		{
		    WebDriverManager.chromedriver().setup();
		    driver =new ChromeDriver();
		}
		else if(brw.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		else if(brw.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
		}
		else
		{
			logger.info("Provided browser is not available");
		}
		logger.info("Browser launched");
		
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		logger.info("Dalal street url opened");

		//-------LoginPAge Steps--------------------
		LoginPage login=new LoginPage(); 
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginB();
		
		//---------Object creations step---------------
		dash=new DashboardPage();
	    Buy_Page=new BuyPage();


	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
		logger.info("Browser closed"); //it is same like syso statement
	}
}
