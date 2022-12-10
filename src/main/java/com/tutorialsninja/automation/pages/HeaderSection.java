package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeaderSection {
	
	
	public  HeaderSection() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myAccountLink;
	
	@FindBy(linkText="Register")
	public static WebElement Register;
	
	@FindBy(linkText="Login")
	public static WebElement login;
	
	
	@FindBy(name="search")
	public static WebElement searchBoxField;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement searchButton;
	
	
	public static void navigateToLoginPage() {
		Elements.click(myAccountLink);
		Elements.click(login);
		
	}
	
	
	@FindBy(xpath="//span[ text()='Shopping Cart']")
	public static WebElement viewshoppingCartOption;
	
	
	public static void searchProduct() {
		
		Elements.TypeText(HeaderSection.searchBoxField, Base.reader.getProduct());
		Elements.click(HeaderSection.searchButton);
		
	}
	
	public static void navigateToDhoppingCartPage() {
		
		 Elements.click(HeaderSection.viewshoppingCartOption);
		
		
	}
	
	
}
