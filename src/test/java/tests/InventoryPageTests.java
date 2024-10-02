package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import constants.AppConstants;

public class InventoryPageTests extends BaseTest {
	
	@Test(priority = 0)
	public void validateInventoryPage() {
		sauceDemoPage.setUsername("standard_user");
		sauceDemoPage.setPassword("secret_sauce");
		sauceDemoPage.clickLoginButton();
		String inventoryTitle = inventoryPage.geInventoryTitle();
		Assert.assertEquals(inventoryTitle, AppConstants.SAUCEDEMO_PAGE_TITLE);
	}
	
	@Test(priority = 1)
	public void validateProductDesc() {
		inventoryPage.selectProductName("Sauce Labs Onesie");
		String itemName = inventoryPage.validateItemName();
		Assert.assertEquals(itemName, "Sauce Labs Onesie");
	}
}
