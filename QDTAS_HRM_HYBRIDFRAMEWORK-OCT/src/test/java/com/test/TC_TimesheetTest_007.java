package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.HomePage_LoginPage;
import com.pom.Timesheet;
@Test
public class TC_TimesheetTest_007 extends BaseClass {

	 public  void ProjectTest() throws InterruptedException,IOException
     {
		 HomePage_LoginPage lp=new HomePage_LoginPage(driver);
 		lp.setEmail1(email);
 		logger.info("email is provided");
 		lp.password(password);
 		logger.info("password is provided");
 		lp.submit();
 		Thread.sleep(3000);
     
	 
 		Timesheet Timesheet =new Timesheet(driver);
 		Timesheet.clickTimesheet();
 		logger.info("providing Timesheet details...");
 		
 		Timesheet.setStartTime("07:24");
 		Timesheet.setEndTime("08.24");
 		Timesheet.setDate("13-07-2024");
 		Timesheet.setProject("HRM");
 		Timesheet.setNote("complete testing");
 		
 		 boolean res=driver.getPageSource().contains("Timesheet added successfully !!!");
		  if(res==true)
		  {
			  Assert.assertTrue(true);
			  logger.info("test case is passed.......");
			  
		  }
		  else
		  {
			  logger.info("test case is failed.....");
			  captureScreenshot(driver,"Timesheet");
		      Assert.assertTrue(false);
		  }
}

	private void captureScreenshot(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
 		
 	
}
	 
