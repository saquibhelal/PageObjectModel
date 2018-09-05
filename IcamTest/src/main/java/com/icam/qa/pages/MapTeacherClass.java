package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class MapTeacherClass extends TestBase {
	
	
	
	@FindBy(xpath="//select[@name='teacherId']")
	WebElement tchrName;
	
	@FindBy(css="#subject")
	WebElement subject;
	
	@FindBy(css="#course")
	WebElement course;
	
	@FindBy(css="#section")
	WebElement section;
	
	@FindBy(css="#submitButton")
	WebElement submit;
	
	public MapTeacherClass mappedTeacherClass() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select tName=new Select(tchrName);
		tName.selectByValue("TISHA  ROY");
		System.out.println("=====Getting teacher Value=====");
		Select subj=new Select(subject);
		subj.selectByVisibleText("HINDI");
		System.out.println("=====Getting Subjec Value=====");
		Select cor=new Select(course);
		cor.selectByVisibleText("VI");
		Select sec=new Select(section);
		sec.selectByVisibleText("A");
		//submit.click();
		return new MapTeacherClass();
	}
	
}
