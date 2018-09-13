package com.icam.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class CreateSubject extends TestBase {

	// @Author Saquib
	HighlightElement highLight;
	
	@FindBy(css="#scholasticTypeName")
	WebElement scholasticName;
	
	@FindBy(how=How.CSS,using="#subjectGroupName")
	 WebElement subName;
	
	@FindBy(how=How.CSS,using="#subjectGroupOrderId")
	 WebElement subId;
	
	@FindBy(how=How.CSS,using="	#totalHRSForCourse")
	 WebElement hrs;

	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	
	public CreateSubject(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateCreateSubjectPage(){
		String valcheck="Create Subject";
		return valcheck;
	}
	
	 public void subjectCreation(String sbName,String sbCr,String sbDur) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		HighlightElement.highLightElement(driver, scholasticName);
		Select select=new Select(scholasticName);
		select.selectByVisibleText("Scholastic");
        HighlightElement.highLightElement(driver, subName);
        subName.sendKeys(sbName);
        HighlightElement.highLightElement(driver, subId);
        subId.sendKeys(sbCr);
        HighlightElement.highLightElement(driver, hrs);
        hrs.sendKeys(sbDur);
        HighlightElement.highLightElement(driver, submit);
        submit.click();
       
	}
 
}
