package com.amazon.webAutomation.Test;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.webAutomation.Pages.SearchProductPage;

public class SearchProductTest extends AmazonBaseTest {
	private static final Logger logger=Logger.getLogger(SearchProductTest.class);
	
	SearchProductPage search;

	public SearchProductTest() throws FileNotFoundException {
		super();
		logger.info("Starting SearchProductTest constructor");
		logger.info("Ending SearchProductTest constructor");
	}
	
	@BeforeTest
	public void init()throws Exception {
		logger.info("Starting init method");
		this.driver=getWebDriver();	
		search=new SearchProductPage(driver);
		logger.info("Ending init method");
		}
	
	@Test(priority=1)
	public void testSearchProduct() throws InterruptedException {
		logger.info("Starting testSearchProduct method");
		
		
		String url=search.getUrl();
		Assert.assertEquals(url, "https://www.amazon.in/");
		search.clickOnSearchProduct();
		Thread.sleep(2000);
		search.setSearchProduct("head phone");
		search.clickOnSearchButton();
		
		logger.info("Ending testSearchProduct method");
		
	}
	

}
