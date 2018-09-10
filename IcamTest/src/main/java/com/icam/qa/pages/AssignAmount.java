package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class AssignAmount extends TestBase {
	
	// @Author Saquib
	HighlightElement highLight;
	
	@FindBy(linkText="Assign Amount")
	WebElement amount;
	
	@FindBy(css="#templateName")
	WebElement templateName;
	
	@FindBy(css="#unMappedCourseName")
	WebElement standardName;
	
	@FindBy(css=".textField.form-control")
	WebElement general;
	
	@FindBy(id=".//*[@id='amountTableBody']/tr[1]/td[3]/input")
	WebElement sc;
	
	@FindBy(id=".//*[@id='amountTableBody']/tr[1]/td[4]/input")
	WebElement st;
	
	@FindBy(id=".//*[@id='amountTableBody']/tr[1]/td[5]/input")
	WebElement obc;
	
	@FindBy(id=".//*[@id='submit']")
	WebElement submit;
	
	
	public AssignAmount(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateAssignAmountPage(){
		String valcheck="Assign Fees To Template For A Standard";
		return valcheck;
	}
	
	public AssignAmount assignFeesAmount(String gen,String scc,String stt,String obcc) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        Thread.sleep(3000);
        HighlightElement.highLightElement(driver,templateName);
        Select tmplName=new Select(templateName);
        tmplName.selectByVisibleText("CLASS X");
        HighlightElement.highLightElement(driver,standardName);
        Select stndName=new Select(standardName);
        stndName.selectByVisibleText("XI");
        Thread.sleep(5000);
        general.clear();
        HighlightElement.highLightElement(driver,general);
        general.sendKeys(gen);
        HighlightElement.highLightElement(driver,sc);
        sc.sendKeys(scc);
        HighlightElement.highLightElement(driver,st);
        st.sendKeys(stt);
        HighlightElement.highLightElement(driver,obc);
        obc.sendKeys(obcc);
        HighlightElement.highLightElement(driver,submit);
        submit.click();
		return new AssignAmount();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
