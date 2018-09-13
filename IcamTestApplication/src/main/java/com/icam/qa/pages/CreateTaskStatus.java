package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateTaskStatus extends TestBase {

	// @Author Saquib
	@FindBy(xpath="//input[@id='taskStatus']")
	WebElement taskStatus;
	
	@FindBy(xpath="//select[@id='status']")
	WebElement tcStatus;
	
	@FindBy(xpath="//input[@type='button']")
	WebElement submit;
	
	public CreateTaskStatus(){
		PageFactory.initElements(driver, this);
	}
	
	public void taskStatus(String tskSts) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		taskStatus.sendKeys(tskSts);
		Select select=new Select(tcStatus);
		select.selectByVisibleText("OPEN");
		//submit.click();??// This page need to test..........
	}
}
