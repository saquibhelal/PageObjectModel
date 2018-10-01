package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class ClassTeacher extends TestBase {

	@FindBy(xpath="//select[@id='standardCode']")
	WebElement standard;
	
	@FindBy(xpath="//select[@id='section']")
	WebElement sec;
	
	@FindBy(xpath="//input[@id='desc']")
	WebElement userId;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public ClassTeacher(){
		PageFactory.initElements(driver,this);
	}
	
	public String validatePageTitle(){
		String valChck="Class Teacher";
		return valChck;
	}
	@FindBy(linkText="ssp_mh")
	WebElement test;
	public void createClassTeacher() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select = new Select(standard);
		select.selectByVisibleText("VI");
		Select select1= new Select(sec);
		select1.selectByVisibleText("A");
		userId.sendKeys("ssp_mh");
		test.click();
		//submit.click();
		
		
	}
	
}
