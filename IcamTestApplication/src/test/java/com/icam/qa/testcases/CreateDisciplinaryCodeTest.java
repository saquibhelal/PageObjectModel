package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateDisciplinaryCode;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateDisciplinaryCodeTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateDisciplinaryCode disCode;
	
	public CreateDisciplinaryCodeTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		disCode=new CreateDisciplinaryCode();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnCreateDisciplinaryCodeLink();
	}
	
	@Test(priority=1)
	public void pageValidation(){
		String title=disCode.validatePage();
		Assert.assertEquals(title, "Create Disciplinary Code");
		System.out.println("landing on the correct page---->");
		
	}
	
	@Test(priority=2)
	public void createDisciplinaryTest() throws InterruptedException{
		disCode.createDisciplinaryCode();
		System.out.println("Disciplinary code has been created---->");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}
	
}
