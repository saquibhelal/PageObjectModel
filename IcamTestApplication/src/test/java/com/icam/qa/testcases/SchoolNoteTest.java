package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.SchoolNote;

public class SchoolNoteTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	SchoolNote schlNote;
	
	public SchoolNoteTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		schlNote=new SchoolNote();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@Test(groups={"regressionTest"},dependsOnGroups={"smokeTest"},priority=1)
	public void schooNoteTest() throws InterruptedException{
		homePage.clickOnSchoolNoteLink();
		schlNote.schoolNote();
		System.out.println("===School note has been added sucessfull===");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====>>\n");
		//driver.quit();
	}
	
}
