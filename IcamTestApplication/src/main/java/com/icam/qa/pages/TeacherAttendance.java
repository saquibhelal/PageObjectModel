package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class TeacherAttendance extends TestBase {
	
	//@Author Saquib
	@FindBy(xpath="//select[@name='year']")
	WebElement year;
	
	@FindBy(xpath="//select[@name='month']")
	WebElement month;
	
	@FindBy(xpath="//select[@name='resourceType']")
	WebElement res;
	
	@FindBy(xpath="//select[@name='jobtype']")
	WebElement jobTyp;
	
	@FindBy(xpath="//*[@id='allSubmit']")
	WebElement submit;
	
	
	public TeacherAttendance(){
		PageFactory.initElements(driver, this);
	}
	
	public void teacherAttendance() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(year);
		select.selectByVisibleText("2018");
		Select select1=new Select(month);
		select1.selectByVisibleText("June");
		Select select2=new Select(res);
		select2.selectByVisibleText("TEACHING STAFF");
		Select select3=new Select(jobTyp);
		select3.selectByVisibleText("FULL TIME");
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
