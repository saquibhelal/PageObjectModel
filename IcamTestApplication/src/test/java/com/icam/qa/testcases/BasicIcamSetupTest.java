/*package com.icam.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.BasicIcamSetup;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class BasicIcamSetupTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	BasicIcamSetup setUpIcam;
	
	
	public BasicIcamSetupTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initializationBrowser();
		setUpIcam=new BasicIcamSetup();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		//driver.switchTo().frame("frame");
	}
	
	@Test(priority=1)
	public void basicSetupForIcamTest() throws InterruptedException{
		homePage.clickOnBasicSetup();
		setUpIcam.icamSetup();
	}
	
	
	@AfterMethod
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 //driver.quit();
	}
	
	
	
}
*/