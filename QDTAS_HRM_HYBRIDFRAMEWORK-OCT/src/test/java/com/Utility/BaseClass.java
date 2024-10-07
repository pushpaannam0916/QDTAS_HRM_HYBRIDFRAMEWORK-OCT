package com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//import com.qdtas_Utilities.Screenshot;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeTest
	@Parameters({"Browser"})
	
	public void browserLaunch(String browser) 
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		driver.get("https://qdtas-hrm-front-end.vercel.app/");
		  driver.manage().window().maximize();
	}
	
	
	 @AfterMethod
	 public void FiledScreenshot(ITestResult result) throws IOException
    {
   	     if(ITestResult.FAILURE ==result.getStatus()) {
   		 Screenshot.getScreenshot(driver);
   		 }
   		 else if(ITestResult.SUCCESS==result.getStatus()){
   		 Screenshot.getScreenshot(driver);
   		 }
    }


	public void OnTestSucess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void OnTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	

}
