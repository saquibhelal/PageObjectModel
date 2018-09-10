package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class EditStudentStandardSubjectMapping extends TestBase {

	// @Author Saquib
	@FindBy(css="#course")
	WebElement course;
	
	@FindBy(css="#student")
	WebElement stndt;
	
	@FindBy(css="#subjectMATHAMATIC")
	WebElement sub1;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	
	public EditStudentStandardSubjectMapping(){
	   PageFactory.initElements(driver, this);	
	}
	
	public String validateEditStudntSubMap(){
		String valueChck="Standard & Subject";
		return valueChck;
	}
	
	
	public EditStudentStandardSubjectMapping edtStdntSubMap() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(course);
		select.selectByVisibleText("VI");
		Thread.sleep(2000);
		Select select1=new Select(stndt);
		select1.selectByVisibleText("1001 (Praveen  Mahato)");
		sub1.click();
		//submit.click();
		return new EditStudentStandardSubjectMapping();
	}
	
	
	
}
