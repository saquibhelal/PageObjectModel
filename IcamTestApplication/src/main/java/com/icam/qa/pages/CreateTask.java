package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateTask extends TestBase{

	// @Author Saquib
	@FindBy(xpath="//*[@id='jobTypeName']")
	WebElement taskName;
	
	@FindBy(xpath="//select[@id='approvalRequired']")
    WebElement approvalRequired;
	
	@FindBy(xpath="//textarea[@name='jobTypeDesc']")
	WebElement taskDesc;
	
	@FindBy(xpath="//input[@name='isLinked']")
	WebElement checkbox;
	
	@FindBy(xpath="//select[@id='linkName']")
	WebElement link;
	
	@FindBy(xpath="//textarea[@id='note']")
    WebElement note;
	
	@FindBy(xpath="//select[@id='taskAssignee']")
	WebElement taskAssignee;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	public CreateTask(){
		PageFactory.initElements(driver, this);
	}
	
	public CreateTask createTaskApproval(String tNm,String tDesc,String nte) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		taskName.sendKeys(tNm);
		Select select=new Select(approvalRequired);
		select.selectByVisibleText("YES");
		Thread.sleep(3000);
		taskDesc.sendKeys(tDesc);
		checkbox.click();
		Select select1=new Select(link);
		select1.selectByVisibleText("Create Task");
		note.sendKeys(nte);
		Select select2=new Select(taskAssignee);
		select2.selectByVisibleText("Reporting Manager");
		//submit.click();??
		
		return new CreateTask();////////This page need to test 
		
	}
	
}
