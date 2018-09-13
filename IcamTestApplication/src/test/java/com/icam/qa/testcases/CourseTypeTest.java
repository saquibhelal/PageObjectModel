package com.icam.qa.testcases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CourseType;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CourseTypeTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	CourseType courseType;
	String sheeName="Course";
	
	public CourseTypeTest(){
		super();
	}

	@BeforeClass
	public void setUp(){
		initializationBrowser();
		courseType= new CourseType();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		homePage.clickOnAcademicLink();
	}
	
	
	/*@Test(priority=1)
	public void verifyCourseTypeTitle(){
		driver.switchTo().frame("frame");
		Assert.assertTrue(courseType.verifycourseTypeTitle(),"Course Title is Missing in the Page");
	}*/
	
	/*@Test(priority=3)
	public void verifyTableData(String expectedCourse){
		Assert.assertEquals(courseType.checkTable(expectedCourse), "");;
	}*/
	
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheeName);
		return data;
	}
	

	
	@Test(priority=1, dataProvider="getIcamSheetData")
	public void createNewCourseType(String CoureTypeName, String Descrption) throws Exception{
		courseType.createCourseType(CoureTypeName, Descrption);
		TestBase.driver.navigate().refresh();
		homePage.academicLink.click();
		homePage.courseLink.click();
		homePage.createCourseType.click();
	}
	
	@Test(priority=2)
	public void validateCourseTypeTest(){
		String title=courseType.validateCourseTypePage();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(title,"Standard & Sections");
		softassert.assertAll();
		System.out.println("======You are Landing on the Correct Page======");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		 driver.quit();
	}
}
