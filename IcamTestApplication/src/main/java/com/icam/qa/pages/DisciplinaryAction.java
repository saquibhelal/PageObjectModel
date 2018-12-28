package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class DisciplinaryAction extends TestBase {

	@FindBy(xpath="//*[@id='standard']")
	WebElement standard;
	
	@FindBy(xpath="//*[@id='section']")
	WebElement sec;
	
	@FindBy(xpath="//*[@id='rollNumber']")
	WebElement rollNo;
	
	@FindBy(xpath="//*[@id='disciplinaryCode']")
	WebElement disCode;
	
	@FindBy(xpath="//*[@id='complaint']")
	WebElement comment;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public DisciplinaryAction(){
		PageFactory.initElements(driver, this);
	}
	
	public void disciplinaryAction() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(standard);
		select.selectByVisibleText("XII");
		Select select1=new Select(sec);
		select1.selectByVisibleText("B");
		Select select2=new Select(rollNo);
		select2.selectByVisibleText("99999-RAAMM SHAAMM");
		Select select3=new Select(disCode);
		select3.selectByVisibleText("CD3003");
		comment.sendKeys("Disciplinary Action Testing");
		//submit.click();
		
	}
	
	public String validatePageTitle(){
		String valChck="Disciplinary Action";
		return valChck;
	}
}
