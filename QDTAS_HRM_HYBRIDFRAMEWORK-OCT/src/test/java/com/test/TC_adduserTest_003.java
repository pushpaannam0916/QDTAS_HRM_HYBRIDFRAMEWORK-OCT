package com.test;

import java.io.IOException;


//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.pom.HomePage_LoginPage;
import com.pom.Timesheet;

import com.pom.AddUser;

public class TC_adduserTest_003 extends BaseClass
{
	
	@Test
       public void adduserTest() throws InterruptedException, IOException
       {
		VerifyLoginPage lp=new VerifyLoginPage();
		lp.setemail(email);
		logger.info("email is provided");
		lp.setpassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		  AddUser adduser=new  AddUser (driver);
		  AddUser.clickAddUser();
		  logger.info(" providing adduser details....");
		  
		  AddUser.setUserName("pushpa");
		  AddUser.setFirstName("Annam");
		  AddUser.setMiddleName("lakshmi");
		  AddUser.setLastName("appikatla");
		  AddUser.setDOB("16-12-2005");
		  Thread.sleep(3000);
		  //adduser.setPassword("Push23@");
		  //adduser.setConfirmPassword("Push23@");
		  AddUser.setGender("female");
		  AddUser.setPhoneNumber("0987654321");
		  adduser.setDepartment("Testing");
		  adduser.setRole("Admin");
		  adduser. setDesignation("Mnual Testing");
		  
		  
		  String email=toString()+"@gmail.com";
		  adduser.setEmail1(email);
		  adduser.setPassword("Push23@");
		  adduser.setConfirmPassword("Push23@");
		  adduser. clickSubmit();
		  Thread.sleep(3000);
		  logger.info("validation started...");
		  
		  boolean res=driver.getPageSource().contains("adduser successfully updated!!!");
		  if(res==true)
		  {
			  Assert.assertTrue(true);
			  logger.info("test case is passed.......");
			  
		  }
		  else
		  {
			  logger.info("test case is failed.....");
			  captureScreenshot(driver,"adduser");
		      Assert.assertTrue(false);
		  }
}

	private void captureScreenshot(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
	
	
		
	


	
	
	}
