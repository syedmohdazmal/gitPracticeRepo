package com.amazon.webAutomation.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends AmazonBasePage {
	
	private static final Logger logger=Logger.getLogger(SearchProductPage.class);
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	protected WebElement txtSearchProduct;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	protected WebElement btnSearch;

	public SearchProductPage(WebDriver driver) {
		super(driver);
		logger.info("Starting SearProductPage constructor");
		logger.info("Ending SearProductPage constructor");
		
	}
	
	public String getUrl()
	{
		logger.info("Starting getUrl method");
		logger.info("Ending getUrl method");
		return driver.getCurrentUrl();
	}
	
	public void clickOnSearchProduct() {
		logger.info("Starting ClickOnSearchProduct method");
		txtSearchProduct.click();
		logger.info("Ending ClickOnSearchProduct method");
	}
	
	public void setSearchProduct(String searchProduct)
	{
		logger.info("Starting setSearchProduct method");
		txtSearchProduct.sendKeys(searchProduct);
		logger.info("Ending setSearchProduct method");
	}
	
	public void clickOnSearchButton()
	{
		btnSearch.click();
	}

}
