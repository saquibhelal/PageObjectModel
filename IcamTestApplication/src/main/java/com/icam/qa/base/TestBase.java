package com.icam.qa.base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.icam.qa.util.TestUtil;
import com.icam.qa.util.WebEventListner;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Author Saquib
public class TestBase {
	
	public static WebDriver driver;
	public static Properties Pro;
	public static EventFiringWebDriver e_driver;
	public static WebEventListner eventListner;
	
	
	public TestBase(){
		
		try{
			Pro=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\User\\git\\PageObjectModel\\IcamTestApplication\\src\\"
					+ "main\\java\\com\\icam\\qa\\config\\config.properties");
			Pro.load(fis);
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void initializationBrowser(){
		String browserName=Pro.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\drivers"
					+ "\\chromedriver_win32\\chromedriver.exe");*/
			    driver=new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("FF")){
			WebDriverManager.firefoxdriver().setup();
			/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\drivers\\"
					+ "geckodriver-v0.19.1-win32\\geckodriver.exe");*/
     			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")){
			WebDriverManager.iedriver().setup();
			/*System.setProperty("webdriver.IE.driver", "C:\\Users\\User\\Desktop\\Selnium_Repos\\drivers\\"
					+ "IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");*/
			    driver=new InternetExplorerDriver();
		}
		
		e_driver=new EventFiringWebDriver(driver);
		eventListner=new WebEventListner();
		e_driver.register(eventListner);
		driver= e_driver;
		
		

		driver.manage().window().maximize();
		//driver.manage().window().setPosition(new Point(0, -1000));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(Pro.getProperty("url"));
	    //driver.manage().window().maximize();
	}

}
