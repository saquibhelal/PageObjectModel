package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateGroup extends TestBase {

	@FindBy(xpath="//input[@id='groupName']")
	WebElement name;
	
	@FindBy(xpath="//select[@id='parentGroupCode']")
	WebElement parent;
	
	@FindBy(xpath="//select[@id='groupTypeCode']")
	WebElement groupType;
	
	@FindBy(xpath="//button[@id='submitButton']")
	WebElement submit;
	
	
	public CreateGroup(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		String valChck="Create Group";
		return valChck;
	}
	
	public void groupCreation() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		name.sendKeys("Car Testing");
		Select select=new Select(parent);
		select.selectByVisibleText("OTHER EXPENSE");
		Select select1=new Select(groupType);
		select1.selectByVisibleText("LIABLITY");
		submit.click();
	}
	
	
}
