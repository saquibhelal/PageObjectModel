package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class CreateEventList extends TestBase{

	@FindBy(xpath=".//*[@id='edit1']/i")
	WebElement edit;
	
	@FindBy(xpath="//input[@name='eventIncharge']")
	WebElement incharge;
	
	@FindBy(xpath="//button[@id='updateEvent']")
	WebElement updateBtn;
	
	public CreateEventList(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void updateEventList() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		edit.click();
		incharge.sendKeys("Testing");
		updateBtn.click();
	}
	
}
