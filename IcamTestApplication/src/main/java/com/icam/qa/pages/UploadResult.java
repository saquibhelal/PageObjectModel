package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class UploadResult extends TestBase {

	@FindBy(id="//*[@id='standard']")
	WebElement standard;
	
	@FindBy(id="//*[@id='section']")
	WebElement sec;
	
	@FindBy(id="//*[@id='subject']")
	WebElement  sub;
	
	@FindBy(id="//*[@id='exam']")
	WebElement exam;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	
	public UploadResult(){
		PageFactory.initElements(driver, this);
	}
	
	public void uploadStudentResult() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		Select select = new Select(standard);
		select.selectByVisibleText("XII");
		Select select2 = new Select(sec);
		select2.selectByVisibleText("B");
		Select select3 = new Select(sub);
		select3.selectByVisibleText("ENGLISH");
		Select select4 = new Select(exam);
		select4.selectByVisibleText("Half Yearly Exam");
		submit.click();
		
	}
	
	
	
	
	
	
}
