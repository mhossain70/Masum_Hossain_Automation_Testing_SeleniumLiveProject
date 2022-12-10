package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Orders {
	
	HeaderSection headersection = new HeaderSection();
	
	LoginPage loginpage = new LoginPage();
	
	SearchResultPage searchresultpage = new SearchResultPage();
	
	ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
	
	
	CheckoutPage  checkoutpage = new CheckoutPage();
	
	OrderSuccessPage ordersuccesspage = new OrderSuccessPage();
	
	
	@Given("^I login to the application$")
	public void i_login_to_the_application()  {
		
		
		Browser.openApplicationURL();
		HeaderSection.navigateToLoginPage();
		LoginPage.dologin();
		
	    
	}

	@When("^I add any product to Bag and checkout$")
	public void i_add_any_product_to_Bag_and_checkout()  {
		
		HeaderSection.searchProduct();
		SearchResultPage.addFirstProductInTheSearchResultsToCart();
		HeaderSection.navigateToDhoppingCartPage();
		ShoppingCartPage.navigateShoppingCartPage();
	}

	@When("^I place an order$")
	public void i_place_an_order() {
	   
		CheckoutPage.placeAndOrder();
		
		
		
		
	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()  {
		
		Waits.waitUntilElementLocated(15, OrderSuccessPage.succesBreadCrumb);
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.succesBreadCrumb));
		
		
	    
	}



}
