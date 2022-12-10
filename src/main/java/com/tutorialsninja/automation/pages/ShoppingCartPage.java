package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class ShoppingCartPage {
	
	public ShoppingCartPage() {
		
	PageFactory.initElements(Base.driver,this);}
	
	@FindBy(linkText="btn btn-primary")
	public static WebElement checkoutButton;
	
	public static void navigateShoppingCartPage() {
		
		Elements.click(ShoppingCartPage.checkoutButton);
	}
		
		
	}

