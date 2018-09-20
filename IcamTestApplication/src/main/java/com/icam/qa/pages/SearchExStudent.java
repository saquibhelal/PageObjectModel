package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class SearchExStudent extends TestBase {
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='rollNumber']")
	WebElement rollNo;
	
	@FindBy(xpath="//button[@id='search']")
	WebElement search;
	
	public SearchExStudent(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchExStudent() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		firstName.sendKeys("Sayan");
		lastName.sendKeys("Dutta");
		rollNo.sendKeys("5013");
		search.click();
	}
	
	
	
	
	
	
	
	

}
