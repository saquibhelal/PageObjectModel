package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class BookCatalogingAndAccessionRegistration extends TestBase {

	@FindBy(xpath="//select[@id='category']")
	WebElement cat;
	
	@FindBy(xpath="//input[@id='bookName']")
	WebElement bookTitle;
	
	@FindBy(xpath="//input[@id='accessionNumber']")
	WebElement AccessionNo;
	
	@FindBy(xpath="//input[@id='author']")
	WebElement author;
	
	@FindBy(xpath="//select[@id='genreId']")
	WebElement subject;
	
	@FindBy(xpath="//input[@id='cost']")
	WebElement cost;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public BookCatalogingAndAccessionRegistration(){
		
		PageFactory.initElements(driver, this);		
	}
	
	public String validatePage(){
		String valChck="Add Book/Magazines To Catalogue";
		return valChck;
	}
	
	public void bookCatAndAccReg(String bkTitle,String AccessNo,String AuthorName,String cst) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		Select select=new Select(cat);
		select.selectByVisibleText("Book");
		bookTitle.sendKeys(bkTitle);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('bookEntryDate').value='10/04/2018'");
		AccessionNo.sendKeys(AccessNo);
		author.sendKeys(AuthorName);
		Select select1=new Select(subject);
		select1.selectByVisibleText("Comics");
		cost.sendKeys(cst);
		//submit.click();
		
	}
	
	
	
	
	
}
