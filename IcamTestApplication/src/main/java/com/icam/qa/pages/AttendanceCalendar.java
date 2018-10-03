package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class AttendanceCalendar extends TestBase {
	
	@FindBy(xpath="//select[@id='year']")
	WebElement year;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement month;
	
	@FindBy(xpath="//select[@id='resourceType']")
	WebElement resTyp;
	
	@FindBy(xpath="//select[@id='class']")
	WebElement standard;
	
	@FindBy(xpath="//select[@id='course']")
	WebElement course;
	
	@FindBy(xpath="//select[@id='sectionone']")
	WebElement sec;
	
	@FindBy(xpath="//select[@id='resourceName']")
	WebElement resName;
	
	
	public AttendanceCalendar(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePage(){
		String valChck="Student Attendance";
		return valChck;
	}
	
	public void attendanceCalendar() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(year);
		select.selectByVisibleText("2018");
		Select select1=new Select(month);
		select1.selectByVisibleText("October");
		Select select2=new Select(resTyp);
		select2.selectByVisibleText("STUDENT");
		Select select3=new Select(standard);
		select3.selectByVisibleText("VII");
		Select select4=new Select(course);
		select4.selectByVisibleText("VII");
		Select select5=new Select(sec);
		select5.selectByVisibleText("A");
		Select select6=new Select(resName);
		select6.selectByVisibleText("SAYAN  DUTTA");
	}
	

}
