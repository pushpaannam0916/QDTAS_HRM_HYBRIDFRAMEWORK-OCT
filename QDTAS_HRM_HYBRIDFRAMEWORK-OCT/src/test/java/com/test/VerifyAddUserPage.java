package com.test;

import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.qdtas_PageObjects.LoginPage;
import com.qdtas_PageObjects.adduser;


public class VerifyAddUserPage extends BaseClass
{
	
	@Test
       public void adduserTest() throws InterruptedException, IOException
       {
		LoginPage lp=new LoginPage(driver);
		lp.setemail(email);
		logger.info("email is provided");
		lp.setpassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		  adduser adduser=new  adduser(driver);
		  adduser.clickAddUser();
		  logger.info(" providing adduser details....");
		  
		  adduser.setUserName("pushpa");
		  //adduser. setEmail1("push2gmail.com");
		  adduser.setFirstName("Annam");
		  adduser.setMiddleName("lakshmi");
		  adduser.setLastName("appikatla");
		  adduser.setDOB("16-12-2005");
		  Thread.sleep(3000);
		  //adduser.setPassword("Push23@");
		  //adduser.setConfirmPassword("Push23@");
		  adduser.setGender("female");
		  adduser.setPhoneNumber("0987654321");
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
