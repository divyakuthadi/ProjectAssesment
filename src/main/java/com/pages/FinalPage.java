package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.proj.Base.TestBase;

public class FinalPage extends TestBase{
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement button;


	public FinalPage() {
		PageFactory.initElements(driver, this);
	}

	public void finalButton() {
		button.click();
		
	}	
}
