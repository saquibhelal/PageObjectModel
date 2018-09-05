package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class SalaryBreakUp extends TestBase {

	@FindBy(css="#newSalaryBreakUpName")
	WebElement salaryName;
	
	@FindBy(css="#newSalaryBreakUpType")
	WebElement salaryType;
	
	@FindBy(xpath="//input[@value='false']")
	WebElement slab;
	
	@FindBy(css="#submitButton")
	WebElement submit;
	
	
	public SalaryBreakUp(){
		PageFactory.initElements(driver, this);
	}
	
	
	public SalaryBreakUp createSalaryBreakUp(String salName) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		salaryName.sendKeys(salName);
		Thread.sleep(4000);
		Select select = new Select(salaryType);
		select.selectByVisibleText("EARNING");??// some problem.....
		slab.click();
		//submit.click();
		
		return new SalaryBreakUp();
	}
	
}
