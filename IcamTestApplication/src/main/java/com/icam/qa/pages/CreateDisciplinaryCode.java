package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class CreateDisciplinaryCode extends TestBase {
	   
	   @FindBy(xpath="//*[@id='disciplinaryCode']")
	   WebElement code;
	   
	   @FindBy(xpath="//*[@id='description']")
	   WebElement desc;
	   
	   @FindBy(xpath="//*[@id='submit']")
	   WebElement submit;
	   
	   public CreateDisciplinaryCode(){
		   PageFactory.initElements(driver, this);
	   }
	   
	   public String validatePage()
	   {
		   String valChck="Create Disciplinary Code";
		   return valChck;
	   }
	   
	   public void createDisciplinaryCode() throws InterruptedException{
	      driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	      Thread.sleep(3000);
		  code.sendKeys("CD3003");
		  desc.sendKeys("code for disciplinary action");
		  submit.click();   
	   }
}
