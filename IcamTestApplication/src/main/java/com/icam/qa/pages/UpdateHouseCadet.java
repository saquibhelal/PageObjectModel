package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class UpdateHouseCadet extends TestBase {

	@FindBy(xpath="//input[@id='userId']")
	WebElement rollNo;
	
	@FindBy(xpath="//button[@id='editButton']")
	WebElement edit;
	
	@FindBy(xpath="//select[@id='houseList']")
	WebElement house;
	
	@FindBy(xpath="//button[@id='submitButton']")
	WebElement submit;
	
	public UpdateHouseCadet(){
		PageFactory.initElements(driver,this);
	}
	
	public void updateHouseCadet() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		rollNo.sendKeys("99999");
		edit.click();
		Select select=new Select(house);
		select.selectByVisibleText("TILAK");
		submit.click();
	}
	
	public String validatePagetTitle(){
		String valChck="Update House For Cadet";
		return valChck;
	}
	
}
