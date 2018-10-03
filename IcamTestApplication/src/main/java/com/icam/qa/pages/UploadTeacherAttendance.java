package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class UploadTeacherAttendance extends TestBase {

	@FindBy(xpath="//select[@id='year']")
	WebElement year;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement month;
	
	@FindBy(xpath="//select[@id='resourceType']")
	WebElement resType;
	
	@FindBy(xpath="//select[@id='jobType']")
	WebElement jobType;
	
	@FindBy(xpath="html/body/div[2]/form/div[2]/section/footer/button[1]")
	WebElement submit;
	
	public UploadTeacherAttendance(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePage(){
		String valChck="Teacher Attendance";
		return valChck;
	}
	
	public void teacherAttendance() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(year);
		select.selectByVisibleText("2019");
		Select select1=new Select(month);
		select1.selectByVisibleText("February");
		Select select2=new Select(resType);
		select2.selectByVisibleText("TEACHING STAFF");
		Select select3=new Select(jobType);
		select3.selectByVisibleText("FULL TIME");
		driver.findElement(By.xpath(".//*[@id='attachment']")).sendKeys("C:\\Users\\User\\Documents\\Browser setup code.png");
		//submit.click();
	}
	
	
	
	
	
	
}

