package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class MapTeacherSubject extends TestBase {
	
	// @Author Saquib
	@FindBy(css="#teacherId")
	WebElement teacherId;
	
	@FindBy(css="#HINDI")
	WebElement subj1;
	
	@FindBy(css="#ENGLISH")
	WebElement subj2;
	
	@FindBy(xpath="//button[contains(text(),'Submit ')]")
	WebElement submit;
	
	
	
	public MapTeacherSubject(){
		PageFactory.initElements(driver, this);
	}
	
	public TeacherList subjectMapping() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select teacher=new Select(teacherId);
		teacher.selectByVisibleText("rajesh.pal");
		subj1.click();
		subj2.click();
		//submit.click();
		return new TeacherList();
	}
	
	

}
