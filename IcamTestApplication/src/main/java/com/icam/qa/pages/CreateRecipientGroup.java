package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateRecipientGroup extends TestBase {
	
	// @Author Saquib
	
	@FindBy(css="#category")
	WebElement catName;
	
	@FindBy(css="#jobTypeCode0")
	WebElement recGroup;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public CreateRecipientGroup(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void createRecGroup() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(catName);
		select.selectByVisibleText("APPROVAL OF STUDENT LEAVE");
		//Select select1=new Select(recGroup);
		//select1.selectByVisibleText("");
		submit.click();
	}

}
