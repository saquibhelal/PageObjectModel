package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateCategoryRecipient extends TestBase {
	
	// @Author Saquib
	@FindBy(xpath="//select[@id='category']")
	WebElement catName;
	
	@FindBy(xpath="//select[@id='jobTypeCode0']")
	WebElement recGrup;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public CreateCategoryRecipient(){
		PageFactory.initElements(driver, this);
	}
	
	public void catRecipient() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		Select select=new Select(catName);
		select.selectByVisibleText("APPROVAL OF STUDENT LEAVE");
		Select select1=new Select(recGrup);
		select1.selectByVisibleText("LEAVE GROUP");
		submit.click();???// This Page need to be Test.......
	}
	
	
}
