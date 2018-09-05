package com.icam.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class SubjectMapping extends TestBase {
	
	HighlightElement highLight;
	
	@FindBy(linkText="Standard Subject Mapping")
	WebElement subjectMappingLink;
	
	@FindBy(css="#course")
	WebElement standardSelection;
	
	@FindBy(xpath="//input[@id='HINDI']")
	WebElement mappingSubject;
	
	@FindBy(xpath="//button[@type='submit' and contains(text(),'Submit')]")
	WebElement submitbtn;
	
	
	public SubjectMapping(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateSubjectMappingPage(){
		String valcheck="Standard Subject Mapping";
		return valcheck;
	}
	
	public SubjectMapping mappedSubject() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
        HighlightElement.highLightElement(driver, standardSelection);
        driver.findElement(By.id("course")).sendKeys("standardSelection");
        Select select=new Select(standardSelection);
        Thread.sleep(2000);
        List<WebElement> we = select.getOptions();
    
        int count=we.size();
        for(int i=0;i<count;i++){
        	if(we.get(i).getText().equalsIgnoreCase("X"));
        	
        	
        	{
        		select.selectByIndex(i);
        		break;
        	}
        }
        
        
        
        
        
        
        
        
        
        
		/*Select standard=new Select(standardSelection);
		
		List<WebElement>stnd=standard.getOptions();
		int total_standard=stnd.size();
		System.out.println("Total Standard"+total_standard);
		for(WebElement ele:stnd){
			String std= ele.getText();
			System.out.println("Standard are===="+std);
		}*/
		
			
		//standard.selectByVisibleText("VI");
		mappingSubject.click();
		//System.out.println("Specific Class selected====>>>"+stnd);
		
		return new SubjectMapping();
	}
	
	
	
}
