package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user open browser$")
	public void user_open_browser() {
	   TestBase.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page()  {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user login to app$")
	public void user_enter_username_and_password()  {
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() {
		String homeTitle =homepage.verifyHomePageTitle();
	    Assert.assertEquals("Cogmento CRM", homeTitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username()  {
		boolean flag = homepage.verifyCorrectUserName();
		Assert.assertTrue(flag);
	}
	
}
