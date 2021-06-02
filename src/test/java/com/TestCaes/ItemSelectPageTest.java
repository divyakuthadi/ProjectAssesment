package com.TestCaes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.ItemSelectedPage;
import com.pages.FinalPage;
import com.proj.Base.TestBase;

import junit.framework.Assert;

public class ItemSelectPageTest extends TestBase {
	HomePage loginpage;
	//FinalPage searchpage;
	ItemSelectedPage itemselectedpage;
	
public ItemSelectPageTest() {
			
		}
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage= new HomePage();
		//FinalPage searchpage= new FinalPage();
		loginpage.SearchOption("qa testing for begginers");
	}
	@Test
	public void ClickElement() {
		WebElement ele= driver.findElement(By.xpath("//*contains(text(),'49')] "));
		String value=ele.getText();
		Assert.assertEquals(value, "$47.49");
		itemselectedpage.ClickLink();
	}
@AfterMethod
public void teardown() {
	driver.quit();
}

}


