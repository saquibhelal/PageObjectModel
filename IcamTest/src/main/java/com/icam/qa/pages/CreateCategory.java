package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateCategory extends TestBase {

	@FindBy(xpath="//input[@id='category']")
	WebElement categoryName;
	
	@FindBy(xpath="//select[@id='jobTypeCode0']")
	WebElement task;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	public CreateCategory(){
		PageFactory.initElements(driver, this);
	}
	
	public void createCategory(String catName) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		categoryName.sendKeys(catName);
		Select select=new Select(task);
		select.selectByVisibleText("LEAVE APPROVE");
		submit.click();??////////This page need to test........
	}
}
