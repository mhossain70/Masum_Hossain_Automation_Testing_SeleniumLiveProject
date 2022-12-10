package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	
	public CheckoutPage() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id= "button-payment-address")
	public static WebElement continueButtonofBillingDetailsSection;
	
	@FindBy(id= "button-shipping-address")
	public static WebElement continueButtonofDeliveryDetailsSection;
	

	@FindBy(id= "button-shipping-method")
	public static WebElement continueButtonofDeliveryMethodDetailsSection;
	
	
	@FindBy(name= "agree")
	public static WebElement termAndConditionCheckoutbox;
	
	
	@FindBy(id= "button-payment-method")
	public static WebElement continueButtonOfPaymentMethodsSection;
	
	@FindBy(id= "button-confirm")
	public static WebElement confirmOrderButton;
	
public static void placeAndOrder() {
		
	Elements.click(CheckoutPage.continueButtonofBillingDetailsSection);
	Elements.click(CheckoutPage.continueButtonofDeliveryDetailsSection);
	Elements.click(CheckoutPage.continueButtonofDeliveryMethodDetailsSection);
	Elements.click(CheckoutPage.termAndConditionCheckoutbox);
	Elements.click(CheckoutPage.continueButtonOfPaymentMethodsSection);
	Elements.click(CheckoutPage.confirmOrderButton);
	}
		

	

}
