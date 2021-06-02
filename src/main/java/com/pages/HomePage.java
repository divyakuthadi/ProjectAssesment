package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.proj.Base.TestBase;

public class HomePage extends TestBase {
	
//locators
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
WebElement searchField;

@FindBy(xpath="//input[@id='nav-search-submit-button']")
WebElement searchButton;


public HomePage() {
	PageFactory.initElements(driver, this);
}

//Actions
public String PageTitle() {
	return driver.getTitle();
}

public ItemSelectedPage SearchOption(String Field) {
	searchField.sendKeys(Field);
	searchButton.click();
	return new ItemSelectedPage();
}




}
