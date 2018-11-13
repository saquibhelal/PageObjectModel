package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateTaskStatus extends TestBase{
	
	
	@FindBy(css="#taskStatus")
	WebElement tsStatus;
	
	@FindBy(css="#status")
	WebElement status;
	
	@FindBy(css=".btn.btn-primary")
    WebElement submit;
	
	public CreateTaskStatus(){
		PageFactory.initElements(driver, this);
	}
	
	public void taskStatuseCreation(String tStatus) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		tsStatus.sendKeys(tStatus);
		Select select=new Select(status);
		select.selectByVisibleText("");
		submit.click();
		
		
	}
	
	
	
}
