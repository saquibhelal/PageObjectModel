package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class BookLendingReport extends TestBase {
 
    @FindBy(xpath="//input[@id='rollNumber']")
    WebElement rollNo;
    
    @FindBy(xpath="//*[@id='command']/section/footer/button[1]")
    WebElement submit;
    
    public BookLendingReport(){
    	PageFactory.initElements(driver, this);
    }
	
    public void bookLending() throws InterruptedException{
    	driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
    	Thread.sleep(3000);
    	rollNo.sendKeys("99999");
    	submit.click();
    }
	
}
