package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateStudentSubjectMapping extends TestBase {

	@FindBy(css="#course")
	WebElement course;
	
	@FindBy(xpath=".//*[@id='nameAndRoll']/tr/td[1]/input")
	WebElement chck;
	
	@FindBy(css="#subjectHINDI")
	WebElement sub1;
	
	@FindBy(css="#subjectENGLISH")
	WebElement sub2;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	
	public CreateStudentSubjectMapping(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateStudentSubjectMappingPage(){
		String valcheck="Standard-Student-Subject Mapping";
		return valcheck;
	}
	
	public CreateStudentSubjectMapping studentSubjectMapping() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(course);
		select.selectByVisibleText("VI");
		chck.click();
		sub1.click();
		sub2.click();
		//submit.click();
		return new CreateStudentSubjectMapping();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
