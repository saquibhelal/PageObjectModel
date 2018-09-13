package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class TeacherList extends TestBase {
	
	// @Author Saquib
	@FindBy(linkText="Details")
	WebElement details;
	
	@FindBy(css="#editButton")
	WebElement edit;
	
	@FindBy(css="#submitButton")
	WebElement submit;
	
	
	public TeacherList(){
		PageFactory.initElements(driver, this);
	}
	
	public TeacherList teacherDetails() throws InterruptedException{
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		details.click();
		Thread.sleep(4000);
		edit.click();
		//submit.click();
		return new TeacherList();
	}
	
	
	
	
	
	
	
	
	

}
