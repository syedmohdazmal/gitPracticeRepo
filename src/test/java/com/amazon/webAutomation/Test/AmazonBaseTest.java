package com.amazon.webAutomation.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBaseTest {
	private static final Logger logger=Logger.getLogger("AmazonBaseTest.class");
	
	private static final String Duration = null;
	private static final TimeUnit SECONDS = null;
	protected WebDriver driver;
	protected Properties testdataProp;
	protected Properties extectedassertionprop;
	
	public AmazonBaseTest() throws FileNotFoundException {
		logger.info("Starting AmazonBase constructor");
		testdataProp=new Properties();
		extectedassertionprop=new Properties();
		try {
		FileInputStream testdataFile=new FileInputStream("D:\\automationSampleProjects\\com.amazon.webAutomation\\src\\main\\resources\\testdata.properties");
		FileInputStream expectedAssertionFile=new FileInputStream("/com.amazon.webAutomation/src/test/resources/extectedAssertionProp.properties");
		testdataProp.load(testdataFile);
		extectedassertionprop.load(expectedAssertionFile);
		
		}
		
		catch(IOException e) {
			//Assert.fail("Error in file path:" + e.getMessage());
		}
		
		logger.info("Ending AmazonBase constructor");
	}
	
	@BeforeClass
	public WebDriver getWebDriver()
	{
		logger.info("Starting getWebDriver method");
		
		/*String browserName=testdataProp.getProperty("browser.name");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
		}
		
		else
		{
			System.out.println("Browser not supported");
		}
		
		driver.get(testdataProp.getProperty("url"));*/
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(30, SECONDS);
		
		logger.info("Ending getWebDriver method");
		return driver;
		
		
		
	}	

}
