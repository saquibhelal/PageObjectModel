package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.SubjectMapping;

public class SubjectMappingTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	SubjectMapping subjectMapping;
	String sheeName="Standard_Details";
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		subjectMapping=new SubjectMapping();
		loginPage=new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));

	}
	
	@Test(priority=1)
	public void mappingSubject() throws InterruptedException{
		homePage.clickOnSubjectMappingLink();
		subjectMapping.mappedSubject();
		
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=subjectMapping.validateSubjectMappingPage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title, "Standard Subject Mapping");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	

	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
	
	
	
	
	
	
	

}
