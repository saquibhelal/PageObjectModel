package com.qa.webiq;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LeaveDetails {
	
	public static WebDriver driver;
	
	@Test
	public void leaveDetailsTest(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos"
				+ "\\drivers\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		        driver=new FirefoxDriver();
		      				
				driver.get("https://sainikschoolpurulia.com/");
				
               driver.findElement(By.xpath("//*[@id='menu-item-783']/a")).click();
				
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("99999");//Rollno
				
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("welcome@99999");
				
				JavascriptExecutor js =(JavascriptExecutor)driver;
				WebElement element= driver.findElement(By.xpath("//input[@name='dob']"));
				js.executeScript("arguments[0].setAttribute('value','08/09/2018')",element);
				
				Scanner scanner=new Scanner(System.in);
				System.out.println("Please enter the captcha");//Code for Captcha.
				scanner.next();
				
				driver.findElement(By.xpath("html/body/section/div/div/div[2]/form/div[5]/div[2]/button[1]")).click();
				
				driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/a")).click();//Academic details
				
				driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/ul/li[6]/a")).click();
				
				System.out.println("Check Your Leave Details");
	}

}
