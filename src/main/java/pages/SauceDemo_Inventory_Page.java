package pages;

import com.microsoft.playwright.Page;

public class SauceDemo_Inventory_Page {
	
	private Page page;
	
	//1. String locators
	private String locator_productName = "//div[@class='inventory_item_name ' and contains(text(), 'Product Name')]";
	private String locator_itemName = "//div[@data-test=\"inventory-item-name\"]";
	
	//2. page constructor
	public SauceDemo_Inventory_Page(Page page) {
		this.page = page;
	}
	
	//3. page methods	
	public String geInventoryTitle() {
		String title = page.title();
		System.out.println("The Inventory Page title is: " + title);
		return title;
	}
	
	public void selectProductName(String productName) {
		String finalProdName = locator_productName.replace("Product Name", productName);
		page.click(finalProdName);
	}
	
	public String validateItemName() {
//		String itemName = page.locator_itemName.innerText();
        String text = page.locator(locator_itemName).innerText();
        System.out.println(text);
        return text;
	}

}
