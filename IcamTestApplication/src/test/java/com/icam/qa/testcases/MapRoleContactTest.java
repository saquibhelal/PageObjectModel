package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.MapRoleContact;

public class MapRoleContactTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	MapRoleContact mapRolCntct;
	
	public MapRoleContactTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		mapRolCntct=new MapRoleContact();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test
	public void doingMapRoleCntcTest() throws InterruptedException{
		homePage.clickOnMpaRoleContact();
		mapRolCntct.doMapRoleContact();
		System.out.println("*****Mapped Successfully******");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
}
