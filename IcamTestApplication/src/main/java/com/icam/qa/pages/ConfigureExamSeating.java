package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class ConfigureExamSeating extends TestBase{
	
	/*@FindBy(xpath="//input[@id='examName']")
	WebElement examName;*/
	
	@FindBy(xpath="//select[@name='algorithm']")
	WebElement algo;
	
	@FindBy(xpath="//select[@name='programName0']")
	WebElement progName;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	
	public ConfigureExamSeating(){
		PageFactory.initElements(driver, this);
	}
	
	public void examSeatingArrang() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='examName']")).sendKeys("Test");
		Select select=new Select(algo);
		select.selectByVisibleText("RightToLeftSeating");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('examStartDate').value='11/04/2018'");
		Thread.sleep(2000);
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		js1.executeScript("document.getElementById('examEndDate').value='15/05/2018'");
		Thread.sleep(2000);
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("document.getElementById('startTime').value='15:00:PM'");
		Thread.sleep(2000);
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("document.getElementById('endTime').value='17:30:PM'");
		Select select1=new Select(progName);
		select1.selectByVisibleText("VI");
		submit.click();
		
		
	}
	
	
	

}
