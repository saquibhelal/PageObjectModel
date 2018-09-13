package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.icam.qa.base.TestBase;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.pages.SetExamMarks;
import com.icam.qa.util.TestUtil;

public class SetExamMarksTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	SetExamMarks marks;
	String sheetName="Set_Exam_Marks";
	
	public SetExamMarksTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		marks=new SetExamMarks();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	/*@Test(priority=1,dataProvider = "getIcamSheetData")
	public void setExamMarksTest(String thy0,String thy1){
		homePage.clickOnSetExamMarks();
		marks.examMarks(thy0, thy1);
	}
*/
	@Test(priority=1,dataProvider = "getIcamSheetData")
	public void setExamMarksTest(String theories0,String theories1,String prctl0,String prctl1) throws InterruptedException{
		homePage.clickOnSetExamMarks();
		marks.examMarks(theories0, theories1,prctl0,prctl1);
		
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		// driver.quit();
	}

}
