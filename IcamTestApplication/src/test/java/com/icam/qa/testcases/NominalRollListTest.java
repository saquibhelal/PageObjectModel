package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.NominalRollList;

public class NominalRollListTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	NominalRollList nmRollList;
	
	public NominalRollListTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		nmRollList=new NominalRollList();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test
	public void NominalRollLstTest() throws InterruptedException{
		homePage.clickOnNominalRollListLink();
		nmRollList.nomianlReportr();
		System.out.println("===Nominal Roll List are===>>");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
	
	
	
	
}
