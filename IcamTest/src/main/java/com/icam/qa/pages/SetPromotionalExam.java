package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class SetPromotionalExam extends TestBase{
	
	//@Author Saquib
	@FindBy(xpath="//*[@id='course']")
	WebElement progName;
	
	@FindBy(xpath="//*[@id='exam']")
	WebElement exam;
	
	@FindBy(xpath="html/body/div[1]/div/form/section/footer/button[1]")
	WebElement submit;
	
	public SetPromotionalExam(){
		PageFactory.initElements(driver, this);
	}
	
	public void promotionalExam() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(progName);
		select.selectByVisibleText("VI");
		Select select1=new Select(exam);
		select1.selectByVisibleText("");
		submit.click();
	}
	
	
	
	
	

}
