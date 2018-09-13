package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.CreateNewRole;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;
import com.icam.qa.util.TestUtil;

public class CreateNewRoleTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	CreateNewRole crRole;
	String sheetName="Role";
	
	public CreateNewRoleTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		crRole=new CreateNewRole();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));	
	}
	
	@DataProvider
	public Object[][] getIcamSheetData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getIcamSheetData",priority=1)
	 public void CreateRoleTest(String modNm,String rolNm) throws InterruptedException{
		homePage.clickOnSystemAdmin();
		crRole.roleCreation(modNm, rolNm);
		System.out.println("******Role Created Successfullt******");
	}
	
	@Test(priority=2)
	public void ValidateRolePageTest(){
		String title=crRole.validateRoelPage();
		Assert.assertEquals(title, "Create Roles");
	}
	
	
	
}
