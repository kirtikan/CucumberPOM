package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	// Page Factory - OR
		
		@FindBy(linkText = "Contacts")
		//@CacheLookup
		WebElement contactsLink;

		@FindBy(linkText ="Deals")
		WebElement dealsLink;

		@FindBy(linkText = "Tasks")
		WebElement tasksLink;

		// Initialization of Page Objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}

		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
		
		public boolean verifyCorrectUserName() {
			WebElement userNameLabel = driver.findElement(By.xpath("//span[contains(text(),'"+prop.getProperty("userlabel")+"')]"));
			return userNameLabel.isDisplayed();
		}

}
