package pages;

import com.microsoft.playwright.Page;

public class SauceDemo_Login_Page {
	
	private Page page;
	
	//1. String locators
	private String locator_userName = "//input[@placeholder=\"Username\"]";
	private String locator_password = "//input[@placeholder=\"Password\"]";
	private String locator_loginBtn = "//input[@name=\"login-button\"]";
	
	//2. page constructor
	public SauceDemo_Login_Page(Page page) {
		this.page = page;
	}
	
	//3. page methods
	public String getSauceDemoPageTitle() {
		String title = page.title();
		System.out.println("The Page title is: " + title);
		return title;
	}
	
	public String getSauceDemoPageURL() {
		String url = page.url();
		System.out.println("The Page URL is: " + url);
		return url;
	}
	
	public void setUsername(String username) {
		page.fill(locator_userName, username);
	}
	
	public void setPassword(String password) {
		page.fill(locator_password, password);
	}
	
	public void clickLoginButton() {
		page.click(locator_loginBtn);
	}

}
