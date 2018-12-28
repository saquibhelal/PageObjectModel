package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class StudentAchievement extends TestBase{

	@FindBy(xpath="//select[@id='eventName']")
	WebElement event;
	
	@FindBy(xpath="//input[@id='eventPosition0']")
	WebElement evntPos;
	
	@FindBy(xpath="//input[@id='student0']")
	WebElement student;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	public StudentAchievement(){
		PageFactory.initElements(driver,this);
	}
	
	public String validatePage(){
		String valChck="Student Achievements";
		return valChck;
	}
	
	public void studentAchievement(String evPos,String std) throws InterruptedException{
	
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(event);
		select.selectByVisibleText("TESTINGGG");
		evntPos.sendKeys(evPos);
		student.sendKeys(std);
		//submit.click();
		
	}
	
}
