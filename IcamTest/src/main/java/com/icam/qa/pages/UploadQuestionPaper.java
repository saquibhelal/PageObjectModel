
package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class UploadQuestionPaper extends TestBase {

	// @Author Saquib 
	@FindBy(xpath="//*[@id='academicYear']")
	WebElement session;
	
	@FindBy(xpath="//*[@id='course']")
	WebElement programme;
	
	@FindBy(xpath="//*[@id='subject']")
	WebElement subject;
	
	@FindBy(xpath="//*[@id='exam']")
	WebElement exam;
	
	@FindBy(xpath="html/body/form/div/div[2]/section/footer/button[1]")
	WebElement submit;
	
	public UploadQuestionPaper(){
		PageFactory.initElements(driver,this);
	}
	
	public void UploadQuestion() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(session);
		select.selectByVisibleText("2018-2019");
		Thread.sleep(2000);
		Select select1=new Select(programme);
		select1.selectByVisibleText("XII");
		Thread.sleep(2000);
		/*Select select2=new Select(subject);
		select2.selectByVisibleText("Test");
		Thread.sleep(2000);
		Select select3=new Select(exam); 
		select3.selectByVisibleText("Geog");*/
		driver.findElement(By.xpath(".//*[@id='fileData0']")).sendKeys("C:\\Users\\User\\Documents\\Browser setup code.png");
		submit.click();
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
