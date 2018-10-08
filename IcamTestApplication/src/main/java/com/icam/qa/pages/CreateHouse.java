package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateHouse extends TestBase {

	@FindBy(xpath="//select[@id='houseType']")
	WebElement houseType;
	
	@FindBy(xpath="//input[@id='houseName']")
	WebElement houseName;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public CreateHouse(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		String valChck="Create House";
		return valChck;
	}
	
	public void createHouse() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(houseType);
		select.selectByVisibleText("Jr.");
		houseName.sendKeys("Test");
		submit.click();
	}
	
}
