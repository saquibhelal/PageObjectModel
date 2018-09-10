package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class DeAllocateCommodity extends TestBase {

	// @Author Saquib
	@FindBy(how=How.CSS,using="#commodityCode")
	WebElement commCode;
	
	@FindBy(how=How.CSS,using="#commodityCode0")
	WebElement check0;
	
	@FindBy(how=How.XPATH,using="//textarea[@name='CHAIR-2comment']")
	WebElement text;
	
	@FindBy(css="#submit")
	WebElement submit;
	
	public DeAllocateCommodity(){
		PageFactory.initElements(driver, this);
	}
	
	
	public DeAllocateCommodity commodityDeAllocation() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		Select select=new Select(commCode);
		select.selectByVisibleText("CHAIR");
		check0.click();
		driver.findElement(By.xpath("//textarea[@name='CHAIR-1comment']")).sendKeys("done");
		//submit.click();
		return new DeAllocateCommodity();
	}
	
	
}
