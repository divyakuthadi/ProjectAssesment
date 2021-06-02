package com.TestCaes;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.FinalPage;
import com.pages.HomePage;
import com.pages.ItemSelectedPage;
import com.pages.ProceedCheckoutPage;
import com.proj.Base.TestBase;

import junit.framework.Assert;

public class FinalPageTest extends TestBase {
	HomePage loginpage;
	FinalPage searchpage;
	ItemSelectedPage itemselectedpage;
	ProceedCheckoutPage checkoutpage;
	FinalPage page;
	
public  FinalPageTest() {
			
		}
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage= new HomePage();
		searchpage= new FinalPage();
		ItemSelectedPage itemselectedpage;
		ProceedCheckoutPage checkoutpage= new ProceedCheckoutPage();
		page = new FinalPage();
		loginpage.SearchOption("qa testing for begginers");
	}
	@Test
	public void CHeckoutbutton() {
		page.finalButton();
		String ExpectedPrice=driver.findElement(By.xpath("//*[@id='price-matcher']")).getText();
		Assert.assertEquals(ExpectedPrice, "$47.90");
	}
@AfterMethod
public void teardown() {
	driver.quit();
}
}
