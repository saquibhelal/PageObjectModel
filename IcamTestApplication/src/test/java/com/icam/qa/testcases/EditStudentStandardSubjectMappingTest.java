package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.EditStudentStandardSubjectMapping;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class EditStudentStandardSubjectMappingTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	EditStudentStandardSubjectMapping edtStdntSubMap;
	
	public EditStudentStandardSubjectMappingTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		edtStdntSubMap=new EditStudentStandardSubjectMapping();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	
	@Test(priority=1)
	public void editStdntSubMapTest() throws InterruptedException{
		homePage.clickOnEditStudentSubjctMapng();
		edtStdntSubMap.edtStdntSubMap();
		System.out.println("*****Mapping Done******");
	}
	
	@Test(priority=2)
	public void validateEditStudentSubMapping(){
	   String title= edtStdntSubMap.validateEditStudntSubMap();
	   Assert.assertEquals(title, "Standard & Subject");
	   System.out.println("=====You are Landing on Correct Page=====");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
}
