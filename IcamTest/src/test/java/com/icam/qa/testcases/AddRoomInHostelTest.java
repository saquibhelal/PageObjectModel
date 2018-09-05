package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddRoomInHostel;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AddRoomInHostelTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	AddRoomInHostel hstlRoom;
	String sheetName="AddRoomInHostel";
	
	public AddRoomInHostelTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		hstlRoom=new AddRoomInHostel();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void hostelRoomTest(String rumNm,String rumPs,String bdct) throws InterruptedException{
		homePage.clickOnAddRoomInHostelLink();
		hstlRoom.addingRoomInHostel(rumNm, rumPs, bdct);
		System.out.println("******Added Room in Hostel******");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
}
