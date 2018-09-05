package com.icam.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.icam.qa.base.HighlightElement;
import com.icam.qa.base.TestBase;

public class CreateNewStudent extends TestBase {
	
	HighlightElement highLight;

	@FindBy(linkText="Office Administration")
	WebElement officeAdminLinkforStudentCreation;
	
	//@FindBy(xpath="//a[contains(text(),'Student Management')]")
	@FindBy(xpath=".//*[@id='menu']/ul/li[12]/ul/li[8]/a")
	WebElement studentManagementLink;
	
	@FindBy(linkText="Create Student")
	WebElement createStudent;
	
	@FindBy(css="#courseId")
	WebElement standard;
	
	@FindBy(css="#driveId")
	WebElement admissionDrive;
	
	@FindBy(css="#strFormId")
	WebElement formId;
	
	@FindBy(css="#userId")
	WebElement rollNo;
	
	@FindBy(css="#firstName")
	WebElement firstName;
	
	@FindBy(css="#lastName")
	WebElement lastName;
	
	@FindBy(css="#dateOfBirth")
	WebElement dob;
	
	@FindBy(css="#dateOfAdmission")
	WebElement admissionDate;
	
	@FindBy(css="#bloodGroup")
	WebElement bloodGroup;
	
	@FindBy(css="#category")
	WebElement category;
	
	@FindBy(css="#nationality")
	WebElement nationality;
	
	@FindBy(css="#stateOfDomicile")
	WebElement stateOfDomicle;
	
	@FindBy(css="#emailId")
	WebElement email;
	
	@FindBy(xpath="//input[@value='male']")
	WebElement sex;
	
	@FindBy(css="#fatherFirstName")
	WebElement fatherFirstName;
	
	@FindBy(css="#fatherFirstName")
	WebElement fatherLastName;
	
	@FindBy(css="#motherFirstName")
	WebElement motherFirstName;
	
	@FindBy(css="#motherLastName")
	WebElement motherLastName;
	
	@FindBy(css="#guardianFirstName")
	WebElement guardianFirtsName;
	
	@FindBy(css="#guardianLastName")
	WebElement guardianLastName;
	
	@FindBy(css="#presentAddressLine")
	WebElement address;
	
	@FindBy(css="#presentAddressCityVillage")
	WebElement city;
	
	@FindBy(css="#presentAddressPinCode")
	WebElement pinCode;
	
	@FindBy(css="#presentAddressDistrict")
	WebElement district;
	
	@FindBy(css="#presentAddressState")
	WebElement state;
	
	@FindBy(css="#presentAddressPostOffice")
    WebElement postOffice;
	
	@FindBy(css="#presentAddressPoliceStation")
	WebElement policeStation;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkBox;
	
	@FindBy(id="#guardianAddressLine")
	WebElement guardianAddress;
	
	@FindBy(css="#guardianAddressCityVillage")
	WebElement guardianCity;
	
	@FindBy(css="#guardianAddressPinCode")
	WebElement guardianPincode;
	
	@FindBy(css="#guardianAddressDistrict")
	WebElement guardianDistrict;
	
	@FindBy(css="#guardianAddressState")
	WebElement guardianState;
	
	@FindBy(id="#guardianAddressPostOffice")
	WebElement gurdianPostOffice;
	
	@FindBy(css="#guardianAddressPoliceStation")
	WebElement guardianPoliceStation;
	
	@FindBy(css="#personalIdentificationMark")
	WebElement personalIdentificationMark;
	
	@FindBy(linkText="Next")
	WebElement nextpg;
	
	@FindBy(xpath=".//*[@id='addStudent']/div[2]/ul/li[2]/a")
	WebElement educationDetailsNextPage;
	
	@FindBy(id=".//*[@id='submit']")
	WebElement submit;
	
	
	
	
	public CreateNewStudent(){
		PageFactory.initElements(driver, this);
	}
	
	public void createStudent(String rolNo,String fNam,String lstNam,String nat,
			String emal,String ffNam,String llNam,String mmName,String lmName,String gfNam,String glNam,
			String adrs,String cty,String pincde,String dist,String poOffice,
			String polStation,String grAdd,String grCt,String grDt,String grPo,String grPst,String persnIdentifction) throws InterruptedException{
		    driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		/*List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total iframes available :"+iframes.size());*/
		

		Thread.sleep(2000);
		HighlightElement.highLightElement(driver, standard);
		Select select=new Select(standard);
		select.selectByVisibleText("VI");
		Thread.sleep(200);
		HighlightElement.highLightElement(driver, admissionDrive);
		Select select1=new Select(admissionDrive);
		select1.selectByVisibleText("ADVIVIL-D2");
		Thread.sleep(200);
		HighlightElement.highLightElement(driver, formId);
		Select select2=new Select(formId);
		select2.selectByVisibleText("VI-1");
		HighlightElement.highLightElement(driver, rollNo);
		rollNo.clear();
		rollNo.sendKeys(rolNo);
		HighlightElement.highLightElement(driver, firstName);
		firstName.clear();
		firstName.sendKeys(fNam);
		HighlightElement.highLightElement(driver, lastName);
		lastName.clear();
		lastName.sendKeys(lstNam);
		Thread.sleep(200);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('dateOfBirth').value='12/04/1989'");
		Thread.sleep(300);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('dateOfAdmission').value='12/03/2017'");
		Thread.sleep(200);
		HighlightElement.highLightElement(driver, bloodGroup);
        Select select3=new Select(bloodGroup);
        select3.selectByVisibleText("A+");
        Thread.sleep(200);
		HighlightElement.highLightElement(driver, category);
        Select select4=new Select(category);
        select4.selectByVisibleText("GENERAL");	
		HighlightElement.highLightElement(driver, nationality);
        nationality.sendKeys(nat);
        Thread.sleep(200);
		HighlightElement.highLightElement(driver, stateOfDomicle);
        Select select5=new Select(stateOfDomicle);
        select5.selectByVisibleText("WEST BENGAL");
		HighlightElement.highLightElement(driver, email);
		//email.clear();
       // email.sendKeys(emal);
        sex.click();
		HighlightElement.highLightElement(driver, fatherFirstName);
        fatherFirstName.sendKeys(ffNam);
		HighlightElement.highLightElement(driver, fatherLastName);
        fatherLastName.sendKeys(llNam);
		HighlightElement.highLightElement(driver, motherFirstName);
        motherFirstName.sendKeys(mmName);
		HighlightElement.highLightElement(driver, motherLastName);
        motherLastName.sendKeys(lmName);
		HighlightElement.highLightElement(driver, guardianFirtsName);
        guardianFirtsName.sendKeys(gfNam);
		HighlightElement.highLightElement(driver, guardianLastName);
        guardianLastName.sendKeys(glNam);
		HighlightElement.highLightElement(driver, address);
        address.sendKeys(adrs);
		HighlightElement.highLightElement(driver, city);
        city.sendKeys(cty);
		HighlightElement.highLightElement(driver, pinCode);
        pinCode.sendKeys(pincde);
		HighlightElement.highLightElement(driver, district);
        district.sendKeys(dist);
        Thread.sleep(200);
		HighlightElement.highLightElement(driver, state);
        Select select6=new Select(state);
        select6.selectByVisibleText("WEST BENGAL");
		HighlightElement.highLightElement(driver, postOffice);
        postOffice.sendKeys(poOffice);
		HighlightElement.highLightElement(driver, policeStation);
        policeStation.sendKeys(polStation);
        Thread.sleep(200);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
       // driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
        checkBox.click();?? // Some frame issue....
		HighlightElement.highLightElement(driver, guardianAddress);
        guardianAddress.sendKeys(grAdd);
		HighlightElement.highLightElement(driver, guardianCity);
        guardianCity.sendKeys(grCt);
		HighlightElement.highLightElement(driver, guardianDistrict);
        guardianDistrict.sendKeys(grDt);
        Thread.sleep(200);
		HighlightElement.highLightElement(driver, guardianState);
        Select select7=new Select(guardianState);
        select7.selectByVisibleText("WEST BENGAL");
		HighlightElement.highLightElement(driver, gurdianPostOffice);
        gurdianPostOffice.sendKeys(grPo);
		HighlightElement.highLightElement(driver, guardianPoliceStation);
        guardianPoliceStation.sendKeys(grPst);
		HighlightElement.highLightElement(driver, personalIdentificationMark);
        personalIdentificationMark.sendKeys(persnIdentifction);
        nextpg.click();
        educationDetailsNextPage.click();// some iframe issue in this page....
        //submit.click();
	}
	
	
	
	
	
	
	
	
	
	
}
