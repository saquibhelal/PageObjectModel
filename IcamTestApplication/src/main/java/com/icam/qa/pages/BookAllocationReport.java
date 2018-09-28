package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class BookAllocationReport extends TestBase {

	
	@FindBy(xpath="//*[@id='command']/section/footer/button[1]")
	WebElement submit;
	
	public BookAllocationReport(){
		PageFactory.initElements(driver, this);
	}
	
	public void bookAllocationReport() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('fromDate').value='15/09/2018'");
		Thread.sleep(2000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('toDate').value='20/09/2018'");
		submit.click();
	}
	
}
