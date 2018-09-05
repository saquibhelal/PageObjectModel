package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.TestBase;

public class DesignationLevelMapping extends TestBase {
	
	@FindBy(css="#designationCode")
	WebElement designationName;
	
	@FindBy(xpath="html/body/section/div/div[1]/form/section/div/div[2]/div/ul/li[2]/input")
	WebElement check1;
	
	@FindBy(xpath="html/body/section/div/div[1]/form/section/div/div[2]/div/ul/li[3]/input")
	WebElement check2;
	
	@FindBy(css=".btn.btn-primary")
	WebElement submit;
	
	public DesignationLevelMapping(){
		PageFactory.initElements(driver, this);
	}
	
	public DesignationLevelMapping mappedDesignationLevel() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
        Select desigName=new Select(designationName);
        desigName.selectByVisibleText("TESTER");
        check1.click();
        check2.click();
       // submit.click();
		return new DesignationLevelMapping();
	}
	
	
	
	
	
	
	
	

}
