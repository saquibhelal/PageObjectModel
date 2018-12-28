package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class UploadResult extends TestBase {
	
	// @Author Saquib
	@FindBy(xpath="//select[@name='standard']")
	WebElement uploadResult;
	
	@FindBy(xpath="//select[@name='term']")
	WebElement termName;
	
	@FindBy(xpath="//select[@name='section']")
	WebElement section;
	
	@FindBy(xpath="//select[@name='subject']")
	WebElement subject;
	
	@FindBy(xpath="//select[@name='exam']")
	WebElement exam;
	
	@FindBy(how=How.XPATH,using="//*[@id='303_theory']")
	@CacheLookup WebElement theory;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public UploadResult(){
		PageFactory.initElements(driver, this);
	}
	
	public UploadResult resultupload(String rst) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(uploadResult);
		select.selectByVisibleText("XII");
		Thread.sleep(2000);
		Select select1=new Select(termName);
		Thread.sleep(2000);
		select1.selectByVisibleText("Periodic Test");
		Select select2=new Select(section);
		Thread.sleep(2000);
		select2.selectByVisibleText("B");
		Select select3=new Select(subject);
		Thread.sleep(2000);
		select3.selectByVisibleText("ENGLISH");
		Select select4=new Select(exam); 
		select4.selectByVisibleText("Periodic Test");
		theory.sendKeys(rst);
		//submit.click();
		return new UploadResult();
	}
	
	
	
	
	
	

}
