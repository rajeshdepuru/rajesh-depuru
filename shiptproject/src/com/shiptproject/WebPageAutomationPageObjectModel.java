package com.shiptproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPageAutomationPageObjectModel {

	@FindBy(xpath = "html/body/div[3]/div[1]/header/div/div/nav/ul[2]/li[3]/a")
	public WebElement login_link;

	@FindBy(xpath = ".//*[@id='myid']/div/ion-content/div/div/div[2]/form/div/label[1]/input")
	public WebElement email_textbox;

	@FindBy(xpath = ".//*[@id='myid']/div/ion-content/div/div/div[2]/form/div/label[2]/input")
	public WebElement password_textbox;

	@FindBy(id = "start_shopping_login_button")
	public WebElement login_button;

	@FindBy(xpath = "html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]/span/div/form/label/input")
	public WebElement search_textbox;

	@FindBy(xpath = "html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[2]/ion-header-bar/div[2]/span/div/form/label/button")
	public WebElement search_button;

	@FindBy(xpath = ".//*[@id='homeIonContent']/div/div/div[1]/div/div/div[1]/ion-item/div[1]/div[4]/button[2]")
	public WebElement add_button;

	@FindBy(xpath = "html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-view/ion-view/div/button[1]")
	public WebElement shopbycategory_button;

	@FindBy(xpath = "//*[@ng-repeat='category in vm.categories']")
	public WebElement baby;

	@FindBy(xpath = ".//*[@id='productsIonContent']/div/div/div[2]/div/div/div[1]/ion-item/div[1]/div[4]/button[2]")
	public WebElement baby_addbutton;

	@FindBy(xpath = "html/body/ion-nav-view/ion-side-menus/ion-side-menu-content/ion-nav-bar/div[1]/ion-header-bar/div[3]/span/web-cart-button/button")
	public WebElement cart_link;

	@FindBy(xpath = ".//p[@class='wrap product-name ng-binding' and contains(text(),'Banana')]")
	public WebElement banana_confirmation;
	
	@FindBy(xpath = ".//p[@class='wrap product-name ng-binding' and contains(text(),'Plum Organics 2nd Blends Blueberry, Pear & Purple Carrot Baby Food')]")
	public WebElement baby_confirmation;
	//.//*[@id='productsIonContent']/div/div/div[2]/div/div/div[1]/ion-item/div[1]/div[4]
	@FindBy(xpath = ".//a[@class='empty-cart']")
	public WebElement emptycart;
	
	@FindBy(xpath = "//*[@ng-repeat='button in buttons']")
	public WebElement alert_accept;
	
	
	
	
	public WebPageAutomationPageObjectModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
