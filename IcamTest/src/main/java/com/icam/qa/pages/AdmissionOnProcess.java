package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class AdmissionOnProcess extends TestBase {

	@FindBy(xpath="//*[@id='datatable-tabletools']/tbody/tr/td[3]/a")
	WebElement driveName;
	
	@FindBy(xpath="//*[@id='formID']")
	WebElement formId;
	
	@FindBy(css="#formSubmissionDate")
	WebElement formSubmissionDate;
	
	@FindBy(css="#candidateFirstName")
	WebElement firstName;
	
	@FindBy(css="#candidateLastName")
	WebElement lastName;
	
	@FindBy(css="#dateOfBirth")
	WebElement dob;
	
	@FindBy(css="#category")
	WebElement category;
	
	@FindBy(css="#candidateContactNo")
	WebElement contact;
	
	@FindBy(css="#candidateEmail")
	WebElement email;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[@id='safcontents']/div/div[6]/a")
	WebElement next;
	
	
	
	public AdmissionOnProcess(){
		PageFactory.initElements(driver, this);
	}
	
	public void admissionOnProcess(String fName,String lName,String contactNo,String imail) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		driveName.click();
		Select select=new Select(formId);
		select.selectByVisibleText("VIII-1");
		Thread.sleep(200);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('formSubmissionDate').value='19/04/2018'");
		Thread.sleep(200);
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		Thread.sleep(200);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("document.getElementById('dateOfBirth').value='10/10/1991'");
		Select select1=new Select(category);
		select1.selectByVisibleText("GENERAL");
		contact.sendKeys(contactNo);
		email.sendKeys(imail);
		submit.click();
		next.click();
	}
	
	
	
	
	
	
	
	
	
	
}
