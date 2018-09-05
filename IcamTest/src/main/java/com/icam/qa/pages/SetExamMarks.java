package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class SetExamMarks extends TestBase {
	
	@FindBy(css="#standard")
	WebElement starndard;
	
	@FindBy(css="#term")
	WebElement term;
	
	@FindBy(css="#exam")
	WebElement exam;
	
	@FindBy(css="#theory0")
	WebElement theory0;
	
	@FindBy(css="#theoryPass0")
	WebElement theory1;
	
	@FindBy(css="#practical0")
	WebElement practcle0;
	
	@FindBy(css="#practicalPass0")
	WebElement passPractl;
	
	
	@FindBy(css=".btn.btn-primary")
	WebElement submit;
	
	
	public SetExamMarks(){
		PageFactory.initElements(driver, this);
	}
	
	public SetExamMarks examMarks(String thoery0,String thoery1,String practicle0,String practicle1) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(starndard);
		select.selectByVisibleText("VII");
		Thread.sleep(2000);
		Select selec1=new Select(term);
		selec1.selectByVisibleText("Term1");
		Thread.sleep(2000);
		Select xam=new Select(exam);
		xam.selectByVisibleText("Periodic Test");
		theory0.clear();
		theory0.sendKeys(thoery0);
		theory1.clear();
		theory1.sendKeys(thoery1);
		practcle0.clear();
		practcle0.sendKeys(practicle0);
		passPractl.clear();
		passPractl.sendKeys(practicle1);
		//submit.click();
		return new SetExamMarks();
	}

}
