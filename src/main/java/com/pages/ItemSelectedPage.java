package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.proj.Base.TestBase;

public class ItemSelectedPage extends TestBase{
@FindBy(xpath="//*[@id=\"search\"]")
WebElement LinkSelect;


public ItemSelectedPage() {
	PageFactory.initElements(driver, this);
}

public ProceedCheckoutPage ClickLink() {
	LinkSelect.click();
	return new ProceedCheckoutPage();
	
	
}

}
