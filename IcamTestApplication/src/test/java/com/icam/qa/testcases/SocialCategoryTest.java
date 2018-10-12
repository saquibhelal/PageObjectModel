package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.SocialCategory;

public class SocialCategoryTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	SocialCategory socCat;
	
	public SocialCategoryTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		socCat=new SocialCategory();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test(priority=1)
	public void socialCatTest() throws InterruptedException{
		homePage.clickOnManageSocialCategoryLink();
		socCat.socialCat();
		System.out.println("Social category added Successfull---->");
	}
	
	@Test(priority=2)
	public void validatePage(){
		String Title=socCat.validatePageTitle();
		Assert.assertEquals(Title, "Social Category");
		System.out.println("Landing on the correct Page--->");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
	
}
