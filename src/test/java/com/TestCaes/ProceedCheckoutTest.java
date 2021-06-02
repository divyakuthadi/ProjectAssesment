package com.TestCaes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.FinalPage;
import com.pages.HomePage;
import com.pages.ItemSelectedPage;
import com.pages.ProceedCheckoutPage;
import com.proj.Base.TestBase;

import junit.framework.Assert;

public class ProceedCheckoutTest extends TestBase{
	HomePage loginpage;
	FinalPage finalpage;
	ItemSelectedPage itemselectedpage;
	ProceedCheckoutPage checkoutpage;
	
public  ProceedCheckoutTest() {
			
		}
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage= new HomePage();
		 finalpage= new FinalPage();
		ItemSelectedPage itemselectedpage;
		ProceedCheckoutPage checkoutpage= new ProceedCheckoutPage();
		loginpage.SearchOption("qa testing for begginers");
	}
	@Test
	public void CHeckout() {
		WebElement ele= driver.findElement(By.xpath("//*contains(text(),'54.89')] "));
		String value=ele.getText();
		Assert.assertEquals(value, "$54.89");
		finalpage=checkoutpage.ProceedCheckoutPageClick();
	}
@AfterMethod
public void teardown() {
	driver.quit();
}
}
