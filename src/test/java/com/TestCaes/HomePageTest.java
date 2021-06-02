package com.TestCaes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.ItemSelectedPage;
import com.pages.FinalPage;
import com.proj.Base.TestBase;

import junit.framework.Assert;

public class HomePageTest extends TestBase{
	HomePage loginpage;
	ItemSelectedPage searchpage;
	
public HomePageTest() {
			
		}
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage= new HomePage();
		FinalPage searchpage= new FinalPage();
	}
	
	@Test
	public void loginpageTitleTest() {
		String Title=loginpage.PageTitle();
		Assert.assertEquals(Title, "Welcome to Amazon");
	}
	@Test
	public void PerformSearch() {
		searchpage=loginpage.SearchOption("qa testing for begginers");
		
	}
@AfterMethod
public void teardown() {
	driver.quit();
}

}
