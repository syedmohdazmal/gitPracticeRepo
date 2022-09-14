package com.amazon.webAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonBasePage {
	
	WebDriver driver;
	public AmazonBasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
