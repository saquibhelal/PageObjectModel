package com.icam.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.AddHostelRoomType;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class AddHostelRoomTypeTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	AddHostelRoomType roomTyp;
	String sheetName="RoomTypeHostel";
	
	public AddHostelRoomTypeTest(){
		super();
	}
	

	@BeforeClass
	public void setUp(){
		initializationBrowser();
		roomTyp=new AddHostelRoomType();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1,dataProvider="getIcamSheetData")
	public void hostelRoomTypeTest(String rmt,String gen,String sccc,String sttt,String obbc) throws InterruptedException{
		homePage.clickOnRoomTypeLink();
		roomTyp.createHostelType(rmt, gen, sccc, sttt, obbc);
		System.out.println("*****Room Added Successfully*****");
	}
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		driver.quit();
	}
}
