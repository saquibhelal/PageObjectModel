package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class AccessionRegister extends TestBase {
	
	
	//@Author Saquib
	@FindBy(xpath="//*[@id='category']")
	WebElement cat;
	
	@FindBy(xpath="//input[@id='bookName']")
	WebElement bookTitle;
	
	@FindBy(xpath="//input[@id='accessionNumber']")
	WebElement acssNo;
	
	@FindBy(xpath="//*[@id='bookDiv']/div/div[1]/div[4]/div/input")
	WebElement author;
	
	@FindBy(xpath="//input[@id='bookPlace']")
	WebElement place;
	
	@FindBy(xpath="//input[@id='bookPublisherName']")
    WebElement publisher;
	
	@FindBy(xpath="//input[@id='publishingYear']")
	WebElement year;
	
	@FindBy(xpath="//input[@id='pages']")
	WebElement pages;
	
	@FindBy(xpath="//input[@id='source']")
	WebElement source;
	
	@FindBy(xpath="//input[@id='billNo']")
	WebElement billNo;
	
	@FindBy(xpath="//input[@id='cost']")
	WebElement cost;
	
	@FindBy(xpath="//input[@id='classNo']")
	WebElement clsNo;
	
	@FindBy(xpath="//input[@id='bookNo']")
	WebElement bookNo;
	
	@FindBy(xpath="//input[@id='withdrawalNo']")
	WebElement withdrwNo;
	
	@FindBy(xpath="//button[@value='SUBMIT']")
	WebElement submit;
	
	
	public AccessionRegister(){
		PageFactory.initElements(driver, this);
	}
	
	public void accsnRegister(String bkTitl,String accNo,String auth,String plc,String 
	  pub,String Yr,String pgs,String src,String blNo,String cst,String clsnm,String bknm,String widNo) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(cat);// category for dropdown.....
		select.selectByVisibleText("Book");
		Thread.sleep(3000);
		bookTitle.sendKeys(bkTitl);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('bookEntryDate').value='10/04/2018'");
		acssNo.sendKeys(accNo);
		//author.sendKeys(auth);
		//place.sendKeys(plc);
		//publisher.sendKeys(pub);
		//year.sendKeys(Yr);
		//pages.sendKeys(pgs);
		//source.sendKeys(src);
		billNo.sendKeys(blNo);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('billDate').value='11/04/2018'");
		cost.sendKeys(cst);
		//clsNo.sendKeys(clsnm);
		//bookNo.sendKeys(bknm);
		withdrwNo.sendKeys(widNo);
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("document.getElementById('withdrawalDate').value='12/04/2018'");
		//submit.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
