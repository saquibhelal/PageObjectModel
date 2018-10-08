package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddRoomType;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class AddRoomTypeTest extends TestBase {
    
	LoginPage loginPage;
	HomePage homePage;
	AddRoomType adRomTyp;
	
	public AddRoomTypeTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		adRomTyp=new AddRoomType();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test(priority=1)
	public void addRoomTypTest() throws InterruptedException{
		homePage.clickOnAddRoomTypeLink();
		adRomTyp.addRoomType();
		System.out.println("======Room Added Successfully=====");
	}
	
	@Test(priority=2)
	public void validatePage(){
		String Title=adRomTyp.validatePagetTitle();
		Assert.assertEquals(Title, "Add Room Type");
		System.out.println("=====Landing on the correct Page====");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
}
