package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class Budget extends TestBase {

	HighlightElement highlight;
	
	@FindBy(css="#academicYear")
	WebElement financialYear;
	
	@FindBy(css="#currentAmount")
	WebElement currentAmount;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	
	public Budget(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateBudgetPage(){
		String valcheck="Budget";
		return valcheck;
	}
	
	public Budget createBudget() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
        HighlightElement.highLightElement(driver, financialYear);
		Select select=new Select(financialYear);
		select.selectByVisibleText("2017-2018");
        HighlightElement.highLightElement(driver, currentAmount);
		driver.findElement(By.cssSelector("currentAmount")).sendKeys("50000");
		submit.click();
		return new Budget();
	}
	
	
	
	
	
}
