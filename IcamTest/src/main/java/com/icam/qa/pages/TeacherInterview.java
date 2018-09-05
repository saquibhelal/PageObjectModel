package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class TeacherInterview extends TestBase{
	
	
	@FindBy(css="#candidateId")
	WebElement canId;
	
	@FindBy(how=How.XPATH,using="//input[@name='subject']")
	@CacheLookup WebElement sub;
	
	@FindBy(how=How.XPATH,using="//input[@name='subMarks']")
	@CacheLookup WebElement subMark;
	
	@FindBy(css="#strStatus")
	WebElement status;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public TeacherInterview(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateTeacherInterviewPage(){
		String valCheck="Teacher Interview Result";
		return valCheck;
	}
	
	public void teacherInterview(String sb,String mrk) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(canId);
		select.selectByValue("CIS-2");
		sub.sendKeys(sb);
		subMark.sendKeys(mrk);
		status.click();
		//submit.click();
		
		
	}
	

}
