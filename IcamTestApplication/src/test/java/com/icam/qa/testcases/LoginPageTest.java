package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		loginPage= new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Dashboard | iCAM Admin - BETA ");
	}
 
	@Test(priority=2)
	public void icamLogoTest(){
		boolean flag=loginPage.validateIcamLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() throws InterruptedException{
		Thread.sleep(7000);
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
		
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
}
