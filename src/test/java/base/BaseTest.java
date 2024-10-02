package base;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;

import pages.SauceDemo_Inventory_Page;
import pages.SauceDemo_Login_Page;
import playwrightdemo.PlaywrightFactory;

public class BaseTest {
	
	PlaywrightFactory pf;
	Page page;
	protected Properties prop;
	
	protected SauceDemo_Login_Page sauceDemoPage;
	protected SauceDemo_Inventory_Page inventoryPage;
	
	@BeforeTest
	public void setup() throws IOException {
		pf = new PlaywrightFactory();
		prop = pf.init_prop();
		page = pf.initBrowser(prop);
		sauceDemoPage = new SauceDemo_Login_Page(page);
		inventoryPage = new SauceDemo_Inventory_Page(page);
	}
	
	@AfterTest
	public void tearDown() {
		page.context().browser().close();
	}


}
