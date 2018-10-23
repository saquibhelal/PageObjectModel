package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AccessTypeRoleMapping;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class AccessTypeRollMappingTest extends TestBase{
	

	LoginPage loginPage;
	HomePage homePage;
	AccessTypeRoleMapping accRolMap;
	
	public AccessTypeRollMappingTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		accRolMap=new AccessTypeRoleMapping();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test
	public void validateTitle()
	{
		String title=accRolMap.validatePageTitle();
		Assert.assertEquals(title, "Access Type Role Mapping");
		System.out.println("----Landing on the correct Page----");
	}
	
	@Test
	public void accessRollTypeMap() throws InterruptedException{
		accRolMap.accessTypeMapp();
		System.out.println("AccessType roll done---->");		
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}

}
