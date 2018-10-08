package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class AddRoomType extends TestBase {

	@FindBy(xpath="//input[@id='roomTypeName']")
	WebElement roomType;
	
	@FindBy(xpath="//input[@name='GENERAL']")
	WebElement gen;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	public AddRoomType(){
		PageFactory.initElements(driver, this);
	}
	
	public void addRoomType() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		roomType.sendKeys("Auto Testing");
		gen.sendKeys("200");
		submit.click();	
	}
	
	public String validatePagetTitle(){
		String valChck="Add Room Type";
		return valChck;
	}
	
}
