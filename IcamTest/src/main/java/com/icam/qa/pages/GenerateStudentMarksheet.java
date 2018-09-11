package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class GenerateStudentMarksheet extends TestBase {

	//@Autor Saquib
	@FindBy(xpath="//select[@name='academicYearCode']")
	WebElement academicYear;
	
	@FindBy(xpath="//select[@name='standardCode']")
	WebElement standard;
	
	@FindBy(xpath="//select[@name='sectionCode']")
	WebElement sectionName;
	
	@FindBy(xpath="//*[@id='examName']")
	WebElement examName;
	
	@FindBy(xpath="//*[@id='studentName']/option[1]")
	WebElement stdName;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	public GenerateStudentMarksheet(){
		PageFactory.initElements(driver, this);
	}
	
	public void generateStudentMarksheet() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(academicYear);
		select.selectByVisibleText("2018-2019");
		Select select1=new Select(standard);
		select1.selectByVisibleText("VI");
		Select select2=new Select(sectionName);
		select2.selectByVisibleText("A");
		Select select3=new Select(examName);
		select3.selectByVisibleText("Half Yearly Exam");
		Select select4=new Select(stdName);
		select4.selectByVisibleText(" Biplab   Mahato");
		submit.click();
		
	}
	
}
