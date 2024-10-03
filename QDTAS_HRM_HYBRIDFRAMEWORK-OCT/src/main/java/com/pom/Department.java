package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Department {

WebDriver ldriver;
	
	public Department (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
      
	@FindBy(name="deptName")
	@CacheLookup
	static
	WebElement txtdeptName;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement txtsubmit;

	private static WebElement submitButton;

	public static Department Department;
	
	
	public static void setDeptName(String deptName)
    {
	        txtdeptName.sendKeys(deptName);
    }
  
  public void setDeptNameNull()
  {                                  //Action Method
 	 
 	 txtdeptName.click();
 	 
  }
  public static void clicksubmit()
  {
  
	   submitButton.click();
  
  }

public static void clickDepartment() {
	// TODO Auto-generated method stub
	
}
}
