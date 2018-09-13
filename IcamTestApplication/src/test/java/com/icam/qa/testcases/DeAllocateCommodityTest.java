package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.DeAllocateCommodity;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class DeAllocateCommodityTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	DeAllocateCommodity deAllotCom;
	
	public DeAllocateCommodityTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		deAllotCom=new DeAllocateCommodity();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		 
	}
	
	@Test
	public void deAlloComTest() throws InterruptedException{
		homePage.clickOnDeAllocateCommodityLink();
		deAllotCom.commodityDeAllocation();
	}
	
	@Test
	public void testing(){
		System.out.println("====Done for Now=====");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
}
