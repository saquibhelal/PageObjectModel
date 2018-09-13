package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class CreateTicketStatus extends TestBase {

	// @Author Saquib
	@FindBy(xpath="//input[@id='status']")
	WebElement ticketStatus;
	
	@FindBy(xpath="//input[@type='button']")
	WebElement submit;
	
	public CreateTicketStatus(){
		PageFactory.initElements(driver, this);
	}
	
	public void ticketStatus(String TckStatus) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		ticketStatus.sendKeys(TckStatus);
		//submit.click();???//This page need to test .............
		
	}
}
