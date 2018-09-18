package com.icam.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class CourseType extends TestBase {
	
	// @Author Saquib
	HighlightElement highLight;

	@FindBy(how=How.CSS,using="#courseTypeName") public 
	WebElement typeName;
	
	@FindBy(how=How.CSS,using="#desc") public 
	WebElement desc;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public CourseType(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateCourseTypePage(){
		String valCheck="Standard & Sections";
		return valCheck;
	}
	
	public void createCourseType(String typName,String dsc) throws Exception{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(2000);
		HighlightElement.highLightElement(driver, typeName);
		typeName.sendKeys(typName);
		HighlightElement.highLightElement(driver, desc);
		desc.sendKeys(dsc);
		HighlightElement.highLightElement(driver, submit);
		submit.click();
	}
	
	public void validateList(){
		
		//No of columns...
		List <WebElement> cols= driver.findElements(By.xpath("//*[@id='datatable-tabletools']/thead/tr/th"));
		System.out.println("No of cols are :" +cols.size());
		
		//No of rows...
		List <WebElement> rows= driver.findElements(By.xpath(".//*[@id='datatable-tabletools']/tbody/tr[3]/td[2]"));
		System.out.println("No of rows are :" +rows.size());
		
		
	}
	
}
