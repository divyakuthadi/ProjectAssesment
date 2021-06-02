package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.proj.Base.TestBase;

public class ProceedCheckoutPage extends TestBase{
	
	@FindBy(xpath="//*[@id='add-to-cart-button']")
	WebElement AddToCart;

	public ProceedCheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	public FinalPage ProceedCheckoutPageClick(){
		AddToCart.click();
		return new FinalPage();
		
		
	}

}
