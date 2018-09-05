package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AssignHostelToStudent;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class AssignHostelToStudentTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	AssignHostelToStudent asgnHstl;
	
	public AssignHostelToStudentTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		asgnHstl=new AssignHostelToStudent();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@Test(priority=1)
	public void studentHostelAssignedTest() throws InterruptedException{
		homePage.clickOnAssignStudentLink();
		asgnHstl.hostelAssigned();
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=asgnHstl.validateAssignHostelStundentPage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title, "Student And Hostel Details");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
	
	
	
	
	
	
}
