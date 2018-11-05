package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.DisciplinaryAction;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class DisciplinaryActionTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	DisciplinaryAction discActn;
	
	public DisciplinaryActionTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		discActn=new DisciplinaryAction();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnCreateDisciplinaryActionLink();
	}
	
	@Test
	public void pageValidateTest(){
		String title=discActn.validatePageTitle();
		Assert.assertEquals("Disciplinary Action", title,"Assertion pass Landing on the correct page---->");
	}
	
	@Test
	public void disciplinaryActionsTest() throws InterruptedException{
		discActn.disciplinaryAction();
		System.out.println("Disciplinary Action done--->");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
}
