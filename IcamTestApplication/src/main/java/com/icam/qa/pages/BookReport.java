package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class BookReport extends TestBase {

	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	
	public BookReport(){
		PageFactory.initElements(driver, this);
	}
	
	public void generateBookReport() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		submit.click();
	}
	
	
	
	
	
	
}
