package com.icam.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.icam.qa.base.TestBase;

public class CreateStandard extends TestBase {

	@FindBy(css="#standardName")
	WebElement standardName;
	
	@FindBy(css="#sections")
	WebElement section;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	public CreateStandard(){
		PageFactory.initElements(driver, this);
	}
	
	public void standardCreation(String stnd,String sec) throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
		standardName.sendKeys(stnd);
		section.sendKeys(sec);
		submit.click();
	}
	
	public void validateList() throws InterruptedException{
	     
		// Method 1:
		
		List<WebElement> rows= driver.findElements(By.xpath("//*[@id='datatable-tabletools']/tbody/tr["));
		int rowCount=rows.size();
		System.out.println("Total row in web table:"+rowCount);

		String before_xpath="//*[@id='datatable-tabletools']/tbody/tr[";
		String after_xpath="]/td[1]";

			for(int i=1;i<=rowCount;i++){
			String actual_xpath=before_xpath + i + after_xpath;
			WebElement element=driver.findElement(By.xpath(actual_xpath));
			String ExpValue=element.getText();
			System.out.println(element.getText());
			if(element.getText().equals(ExpValue)){
			System.out.println("Standard:"+element.getText()+"is found");
			break;

		   }
		}
		
	}
	
	
	
	/*public boolean checkTable(String expectedValue){
		String text=null;
		for (WebElement table: driver.findElements(By.xpath("//*[@id='datatable-tabletools']/tbody/tr/td")));
		{
			
			if(table.getText.equals(expectedValue)){
				return true;
			}
			return false;
		}
	}*/
	
}
