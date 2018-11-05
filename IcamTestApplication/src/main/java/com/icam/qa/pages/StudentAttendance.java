package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class StudentAttendance extends TestBase {
	
	@FindBy(xpath="//select[@id='class']")
	@CacheLookup WebElement standard;
	
	@FindBy(xpath="//select[@id='sectionone']")
	WebElement sec;
	
	@FindBy(xpath="//*[@id='checkbox_99999']")
	WebElement chckbx;
	
	@FindBy(xpath="//*[@id='allSubmit']")
	WebElement submit;
	
	public StudentAttendance(){
		PageFactory.initElements(driver, this);
		
	}

	public void stdnAttnd() throws InterruptedException{
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		Select select=new Select(standard);
		select.selectByVisibleText("XII");
		Select select1=new Select(sec);
		select1.selectByVisibleText("B");
		Thread.sleep(3000);
		chckbx.click();
		submit.click();
	}
	
	
}
