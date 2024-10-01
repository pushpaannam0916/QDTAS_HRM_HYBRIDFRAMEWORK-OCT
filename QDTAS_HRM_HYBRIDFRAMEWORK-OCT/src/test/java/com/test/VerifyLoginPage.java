package com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.ExcelDataProvider;
import com.pom.AddUser;
import com.pom.HomePage_LoginPage;

public class VerifyLoginPage extends BaseClass{
	
	private AddUser hp;


	//private String pass;


	@Test (priority=0)
	public void VerifyLoginPage()throws IOException{  // 
		
		
		HomePage_LoginPage hp_lp = new HomePage_LoginPage(driver);
		
		ExcelDataProvider edp = new ExcelDataProvider();
		edp.getdata();
		
		String user = edp.getStringData ("Sheet1",0,1);  
		//System.out.println("User Name: "+user);
		                      //("Sheet1",0,0);        ("Sheet1",0,1;)
		hp.userName(user);
		String pass = edp.getStringData ("Sheet1",1,1);
		hp.password(pass);                                              // ("Sheet1",1,0);         ("Sheet1",1,1)
		//hp.password(pass);
		hp.submit();
	}
	
	//AddUser AU = new AddUser(driver);
	//AddUser.clickadduser();
	
	@Test (priority=1) 
	public void test2()
	{
		System.out.println("test2");
	}
	
	
	@Test(priority=2)
	public void test3()
	{
		System.out.println("test3");
	    Assert.assertEquals("abc", "abc");
	}
	
	
	
		
		
		
		
		
	}




