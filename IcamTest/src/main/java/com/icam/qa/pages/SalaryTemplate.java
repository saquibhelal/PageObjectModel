package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class SalaryTemplate extends TestBase {

	// @Author Saquib
	HighlightElement highLight;
	
	@FindBy(how=How.CSS,using="#designationType")
	WebElement desigType;
	
	@FindBy(how=How.CSS,using="#designation")
	WebElement desig;
	
	@FindBy(how=How.CSS,using="#level")
	WebElement level;
	
	@FindBy(how=How.CSS,using="#salaryTemplateName")
	WebElement template;
	
	@FindBy(how=How.XPATH,using="//input[@name='salaryBreakUpCode' and @value='SALBRKUP1']")
	WebElement check0;
	
	@FindBy(how=How.XPATH,using="//input[@name='salaryBreakUpCode' and @value='SALBRKUP2'] ")
	WebElement check1;
	
	@FindBy(how=How.CSS,using="#submitButton")
	WebElement submit;
	
	
	public SalaryTemplate(){
		PageFactory.initElements(driver, this);
	}
	
	
	public SalaryTemplate createSalaryTemplate() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	    Thread.sleep(2000);
		 HighlightElement.highLightElement(driver, desigType);
	    Select dsTyp=new Select(desigType);
	    dsTyp.selectByVisibleText("TEACHING STAFF");
	    Thread.sleep(2000);
		 HighlightElement.highLightElement(driver, desig);
	    Select dsg=new Select(desig);
	    dsg.selectByVisibleText("TEACHING MASTER");
	    Thread.sleep(2000);
		 HighlightElement.highLightElement(driver, level);
        Select lvl=new Select(level);
        lvl.selectByValue("LEVEL 2");
	    Thread.sleep(2000);
		 HighlightElement.highLightElement(driver, template);
	    driver.findElement(By.cssSelector("#salaryTemplateName")).sendKeys("Testing");
        //driver.findElement(By.cssSelector(template)).sendKeys("Test");
        check0.click();
        check1.click();
        //submit.click();
		return new SalaryTemplate();
	}
	
	
	
}
