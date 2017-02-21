package com.shiptproject;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebPageAutomationTestCase extends
WebPageAutomationBaseGenericTestBase {
	private WebPageAutomationPageObjectModel webpageauto;

	@Test
	public void webpageautomation() throws InterruptedException, IOException {

		webpageauto = new WebPageAutomationPageObjectModel(driver);

		driver.get(baseUrl); // Go to Shipt Link
		Thread.sleep(1000);
		webpageauto.login_link.click();
		webpageauto.email_textbox.clear();
		webpageauto.email_textbox.sendKeys("qatest@shipt.com");
		webpageauto.password_textbox.clear();
		webpageauto.password_textbox.sendKeys("Sh1pt123!");
		webpageauto.login_button.click();
		Thread.sleep(3000);

		/*
		 * Use the search feature to find a product and add it to the cart
		 */
		webpageauto.search_textbox.clear();
		webpageauto.search_textbox.sendKeys("banana");
		webpageauto.add_button.click();

		/*
		 * Use the category menu to find a product and it to the cart
		 */

		webpageauto.shopbycategory_button.click();
		Thread.sleep(1000);
		webpageauto.baby.click();
		webpageauto.baby_addbutton.click();
		webpageauto.cart_link.click();
		Thread.sleep(3000);

		/*
		 * Validate that the correct products exist in the cart
		 */
		String banana = webpageauto.banana_confirmation.getText();
		System.out.println(banana);
		Assert.assertTrue(banana.contains("Banana"),
				"The right product is not listed in the cart");

		String baby = webpageauto.baby_confirmation.getText();
		System.out.println(baby);
		Assert.assertTrue(
				baby.contains("Plum Organics 2nd Blends Blueberry, Pear & Purple Carrot Baby Food"),
				"The right product is not listed in the cart");

		webpageauto.emptycart.click();
		Thread.sleep(3000);
		webpageauto.alert_accept.click();
	}

}
