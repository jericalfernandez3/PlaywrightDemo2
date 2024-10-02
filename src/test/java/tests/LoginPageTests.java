package tests;

import org.testng.Assert;
import org.testng.annotations.*;

import base.BaseTest;
import constants.AppConstants;
public class LoginPageTests extends BaseTest {
	
	@Test(priority = 0)
	public void validateSauceDemoTitlePage() {
		String pageTitle = sauceDemoPage.getSauceDemoPageTitle();
		Assert.assertEquals(pageTitle, AppConstants.SAUCEDEMO_PAGE_TITLE);
	}

	@Test(priority = 1)
	public void validateSauceDemoURL() {
		String pageURL = sauceDemoPage.getSauceDemoPageURL();
		Assert.assertEquals(pageURL, AppConstants.SAUCEDEMO_LOGIN_URL);
	}
	
	@Test(priority = 2)
	public void validateLogin() {
		sauceDemoPage.setUsername(prop.getProperty("username"));
		sauceDemoPage.setPassword(prop.getProperty("password"));
		sauceDemoPage.clickLoginButton();
	}
}
