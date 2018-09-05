package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class ActiveDrive extends TestBase{

	@FindBy(xpath="//*[@id='datatable-tabletools']/tbody/tr/td[5]/a/i")
	WebElement Gform;
	
	@FindBy(css="#numberOfprint")
	WebElement noOfCopies;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	public ActiveDrive(){
		PageFactory.initElements(driver, this);
	}
	
	public void activeDrive() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Gform.click();
		driver.findElement(By.cssSelector("#numberOfprint")).sendKeys("2");??
		//submit.click();
		
		
		
		
		
		
	}
	
	
	
}
