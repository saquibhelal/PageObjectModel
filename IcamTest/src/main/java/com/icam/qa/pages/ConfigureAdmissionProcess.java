package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class ConfigureAdmissionProcess extends TestBase {

	// @Author Saquib
	@FindBy(how=How.CSS,using="#formFees")
	WebElement formmFees;
	
	@FindBy(how=How.CSS,using="#admissionFormSubmissionLastDate")
	WebElement formLastDate;
	
	@FindBy(how=How.CSS,using="#admissionDriveStartDate")
	WebElement startDate;
	
	@FindBy(how=How.CSS,using="#admissionDriveExpectedEndDate")
	WebElement endDate;
	
	@FindBy(css="#cap1")
	WebElement chck;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public ConfigureAdmissionProcess(){
		PageFactory.initElements(driver, this);
	}
	
	
	public ConfigureAdmissionProcess admissionProcess() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("formmFees")).sendKeys("400");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('admissionFormSubmissionLastDate').value='10/04/2018'");
		Thread.sleep(2000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('admissionDriveStartDate').value='11/04/2018'");
		Thread.sleep(2000);
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript ("document.getElementById('admissionDriveExpectedEndDate').value='12/04/2018'");
		chck.click();??// for cu opening click issue and other i wont check
		//submit.click();
		return new ConfigureAdmissionProcess();
	}
	
}
