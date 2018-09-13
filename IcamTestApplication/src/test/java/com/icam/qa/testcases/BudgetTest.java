package com.icam.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icam.qa.base.TestBase;
import com.icam.qa.pages.Budget;
import com.icam.qa.pages.HomePage;
import com.icam.qa.pages.LoginPage;

public class BudgetTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	Budget budget;
	
	
	public BudgetTest(){
		super();
	}
	
	
	@BeforeClass
	public void setUp(){
		initializationBrowser();
		budget=new Budget();
		loginPage= new LoginPage();
		homePage=loginPage.login(Pro.getProperty("username"), Pro.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void createBudgetTest() throws InterruptedException{
		homePage.clickOnBudgetLink();
		budget.createBudget();
		System.out.println("********Budget created Successfully********");
	}
	
	@Test(priority=2)
	public void ValidateBudgetTest(){
		String title=budget.validateBudgetPage();
		Assert.assertEquals(title, "Budget");
	}
	
	
	@AfterClass
	public void tearDown(){
		System.out.println("======Browser is shutting down=====\n");
		//driver.quit();
	}
}
