/*package com.icam.qa.pages;

import java.util.Calendar;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.icam.qa.base.TestBase;

public class BasicIcamSetup extends TestBase {

    // @Author Saquib
	private String today;

	@FindBy(css="#sessionStartDate")
	WebElement startDate;
	
	@FindBy(css="#sessionEndDate")
	WebElement enddate;
	
	@FindBy(id="//input[@id='financialYearName']")
	WebElement yearName;
	
	@FindBy(xpath="html/body/div[3]/div[1]/table/tbody/tr[2]/td[1]")
	WebElement specificDate;
	
	@FindBy(xpath="html/body/div[3]/div[1]/table/thead/tr[2]/th[3]")
	WebElement arrow;
   @FindBy(xpath="html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")
   WebElement yearSelection;
    
	
	@FindBy(xpath="//button[@value='submit']")
	WebElement submit;
	
	public BasicIcamSetup(){
		PageFactory.initElements(driver, this);
	}
	
	
	public BasicIcamSetup icamSetup() throws InterruptedException{
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		Thread.sleep(4000);
        today = getCurrentDay();
		Thread.sleep(4000);
		startDate.click();
		arrow.click();
		System.out.println("got your point=========");
		specificDate.click();
		Thread.sleep(4000);
		enddate.click();??
		
		Actions action = new Actions(driver);
		action.moveToElement(yearSelection).doubleClick().build().perform();
		
		
		
		WebElement dateWidgetFrom=driver.findElement(By.xpath("html/body/div[3]/div[1]/table/tbody/tr[2]/td[3]"));
		List<WebElement> columns=dateWidgetFrom.findElements(By.tagName("td"));
		for (WebElement cell: columns) {
            
            //If you want to click 18th Date
            if (cell.getText().equals("18")) {
            
            //Select Today's Date
            if (cell.getText().equals(today)) {
                cell.click();
                break;
            }
        }
		try{
			Thread.sleep(4000);
		}catch (InterruptedException e) {
         e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("document.getElementsByClassName('form-control')[0].setAttribute('value', '07/08/2017')");
		
		JavascriptExecutor jsend = (JavascriptExecutor)driver; 
		jsend.executeScript("document.getElementsByClassName('form-control')[0].setAttribute('value', '07/08/2017')");
		
		return new BasicIcamSetup();
	}
	
	
	public String getCurrentDay (){
        //Create a Calendar Object
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
 
        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt +"\n");
 
        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");
 
        return todayStr;
    }
	
	
	
	
	
	
	


}
*/