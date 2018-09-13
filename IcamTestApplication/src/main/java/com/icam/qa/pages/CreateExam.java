package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class CreateExam extends TestBase {
	
	// @Author Saquib
	@FindBy(css="#className")
	WebElement standard;
	
	@FindBy(css="#termName")
	WebElement term;
	
	@FindBy(css="#examType")
	WebElement examType;
	
	@FindBy(css="#submit")
	WebElement submit;
	
	
	public CreateExam (){
		PageFactory.initElements(driver, this);
	}
	
	
	public CreateExam examCreation() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
        Select stand=new Select(standard);
        stand.selectByVisibleText("II");
        Select trm=new Select(term);
        trm.selectByVisibleText("Term1");
        Select exmTyp=new Select(examType);
        exmTyp.selectByVisibleText("Periodic Test");
      //submit.click();
		return new CreateExam();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
