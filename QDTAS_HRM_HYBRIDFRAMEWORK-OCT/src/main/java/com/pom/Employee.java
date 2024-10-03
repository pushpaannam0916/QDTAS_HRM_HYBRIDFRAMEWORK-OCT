package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee {
WebDriver ldriver;
	
	public Employee(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
      
	@FindBy(name="empName")
	@CacheLookup
	static
	WebElement txtempName;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement txtsubmit;

	private static WebElement submitButton;

	public static Employee Employee;

	//public static Employee Employee;
	
	public static void setEmpName(String empName)
    {
	        txtempName.sendKeys(empName);
    }
  
  public void setEmpNameNull()
  {                                  //Action Method
 	 
 	 txtempName.click();
 	 
  }
  public static void clicksubmit()
  {
  
	   
	submitButton.click();
  
  }

public static void clickEmployee() {
	// TODO Auto-generated method stub
	
}
}
