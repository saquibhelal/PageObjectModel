package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.RoleContactMappingList;

public class RoleContactMappingListTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	RoleContactMappingList rolMap;
	
	public RoleContactMappingListTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		rolMap=new RoleContactMappingList();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test
	public void roleMapListTest() throws InterruptedException{
		homePage.clickOnRoleContactMappingListLink();
		rolMap.roleContactMapping();
		System.out.println("Role Mapping Done Successfully");
	}
	
	@Test
	public void validateTitle(){
		String title=rolMap.validatePageTitle();
		Assert.assertEquals(title, "Role Contact Mapping List");
		System.out.println("----Landing on the correct Page----");
		
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}

}
