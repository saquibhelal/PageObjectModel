package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class UploadAssignment extends TestBase {

	// @Author Saquib 
	@FindBy(xpath="//*[@id='academicYear']")
	WebElement session;
	
	@FindBy(xpath="//*[@id='course']")
	WebElement programme;
	
	@FindBy(xpath="//*[@id='batch']")
	WebElement batch;
	
	@FindBy(xpath="//*[@id='term']")
	WebElement term;
	
	@FindBy(xpath="//*[@id='subject']")
	WebElement subject;
	
	@FindBy(xpath="//*[@id='exam']")
    WebElement exam;
	
	@FindBy(xpath="html/body/form/div/div[2]/section/footer/button[1]")
	WebElement submit;
	
	public UploadAssignment(){
		PageFactory.initElements(driver, this);
	}
	
	public void uploadAssignment() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		Select select=new Select(session);
		select.selectByVisibleText("2018-2019");
		Thread.sleep(2000);
		Select select1=new Select(programme);
		select1.selectByVisibleText("VI");
		Thread.sleep(2000);
		Select select2=new Select(batch);
		select2.selectByVisibleText("A");
		Thread.sleep(2000);
		/*Select select3=new Select(term);
		select3.selectByVisibleText("term1");
		Thread.sleep(2000);
		Select select4=new Select(subject);
		select4.selectByVisibleText("Science");
		Thread.sleep(2000);
		Select select5=new Select(exam);
		select5.selectByVisibleText("Half Yearly");
		Thread.sleep(2500);*/
		driver.findElement(By.xpath(".//*[@id='fileData0']")).sendKeys("C:\\Users\\User\\Downloads\\email.xlsx");
		//submit.click();
		
		
	}
	
}
