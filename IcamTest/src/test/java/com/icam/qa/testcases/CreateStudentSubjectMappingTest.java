package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateStudentSubjectMapping;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class CreateStudentSubjectMappingTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	CreateStudentSubjectMapping cscMp;
	

	public CreateStudentSubjectMappingTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		cscMp=new CreateStudentSubjectMapping();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void studentStandardSubjctMappingTest() throws InterruptedException{
		homePage.ClickOnStudentStandardSubjectMapping();
		cscMp.studentSubjectMapping();
		System.out.println("******Subject Mapping Done*******");
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=cscMp.validateStudentSubjectMappingPage();
		Assert.assertEquals(title, "Standard-Student-Subject Mapping");
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
}
